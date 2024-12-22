package solid.javad.unitconverter.ui.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowForward
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import solid.javad.unitconverter.core.Quantity
import solid.javad.unitconverter.core.getUnits
import solid.javad.unitconverter.core.quantities.Area
import solid.javad.unitconverter.ui.navigation.Route
import solid.javad.unitconverter.ui.theme.Typography
import solid.javad.unitconverter.core.Unit as QuantityUnit

@Composable
fun ConvertScreen(
    modifier: Modifier = Modifier,
    route: Route.ConvertScreen
) {
    val units = getUnits(route.quantity::class, "sMetre")

    Column(
        modifier = modifier.padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var fromUnit: QuantityUnit<out Quantity> by remember { mutableStateOf(units.first()) }
        var toUnit: QuantityUnit<out Quantity> by remember { mutableStateOf(units.first()) }
        var inputValue by remember { mutableDoubleStateOf(1.0) }

        UnitSpinner(
            modifier = Modifier.fillMaxWidth(),
            list = units,
            selected = fromUnit,
            onSelectionChanged = { fromUnit = it }
        )

        Text(
            modifier = Modifier.padding(vertical = 8.dp),
            text = "To",
            style = Typography.titleMedium
        )

        UnitSpinner(
            modifier = Modifier.fillMaxWidth(),
            list = units,
            selected = toUnit,
            onSelectionChanged = { toUnit = it }
        )

        Spacer(modifier = Modifier.height(32.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = inputValue.toPlainString(),
            onValueChange = { newValue ->
                inputValue = newValue.toDoubleOrNull() ?: 0.0
            },
            label = { Text("From") },
            trailingIcon = { Text(modifier = Modifier.padding(end = 16.dp), text = fromUnit.name) },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = calculateConvertedValue(inputValue, fromUnit, toUnit),
            onValueChange = {},
            label = { Text("To") },
            trailingIcon = { Text(modifier = Modifier.padding(end = 16.dp), text = toUnit.name) },
            singleLine = true,
            readOnly = true
        )
    }
}

@Composable
private fun calculateConvertedValue(
    value: Double,
    from: QuantityUnit<out Quantity>,
    to: QuantityUnit<out Quantity>
): String {
    return try {
        to.fromMainUnit(from.toMainUnit(value)).toPlainString() // Safe conversion and display
    } catch (e: Exception) {
        "Error"
    }
}

private fun Double.toPlainString(): String {
    return java.math.BigDecimal(this.toString()).stripTrailingZeros().toPlainString()
}


@Composable
fun <T : Quantity> UnitSpinner(
    modifier: Modifier = Modifier,
    list: List<QuantityUnit<out T>>,
    selected: QuantityUnit<out Quantity>,
    onSelectionChanged: (unit: QuantityUnit<out T>) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    OutlinedCard(
        modifier = modifier.clickable {
            expanded = !expanded
        }
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {

            Text (
                modifier = Modifier
                    .weight(1f)
                    .padding(16.dp),
                text = selected.name
            )
            Icon (
                modifier = Modifier.padding(8.dp),
                imageVector = Icons.Outlined.ArrowDropDown,
                contentDescription = "Units Menu"
            )

            DropdownMenu(
                modifier = Modifier.wrapContentWidth(),
                expanded = expanded,
                onDismissRequest = { expanded = false }

            ) {
                list.forEach { listEntry ->
                    DropdownMenuItem(
                        onClick = {
                            expanded = false
                            onSelectionChanged(listEntry)
                        },
                        text = {
                            Text (
                                modifier = Modifier
                                    .wrapContentWidth()
                                    .align(Alignment.Start),
                                text = listEntry.name
                            )
                        }
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun PreviewConvertScreen() {
    ConvertScreen(modifier = Modifier.fillMaxSize(), Route.ConvertScreen(Area(1.0)))
}