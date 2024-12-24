package solid.javad.unitconverter.ui.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import solid.javad.unitconverter.ui.navigation.Route
import solid.javad.unitconverter.ui.theme.Typography
import solid.javad.unitconverter.ui.theme.UnitConverterTheme

@Composable
fun MainScreen (
    modifier: Modifier = Modifier,
    route: Route.MainScreen,
    onQuantitySelected: (QuantityItem) -> Unit
) {
    val itemsSize = quantityItems.size

    LazyVerticalGrid (
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues (
            horizontal = 12.dp
        ),
        verticalArrangement = Arrangement.Center
    ) {
        items(itemsSize / 2 * 2) { i ->
            QuantityItem (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(6.dp),
                item = quantityItems[i],
                onClick = { onQuantitySelected(quantityItems[i]) }
            )
        }

        if (itemsSize % 2 == 1) {
            item(span = { GridItemSpan(2) }) {
                QuantityItem (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp),
                    item = quantityItems.last(),
                    onClick = { onQuantitySelected(quantityItems.last()) }
                )
            }
        }
    }
}

@Composable
private fun QuantityItem(modifier: Modifier = Modifier, item: QuantityItem, onClick: () -> Unit) {
    Card(modifier) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .clickable { onClick() }
                .padding(vertical = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier.size(36.dp),
                painter = painterResource(id = item.resource),
                contentDescription = item.name
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = item.name,
                style = Typography.titleMedium
            )
        }
    }
}

@Preview
@Composable
private fun Preview() {
    UnitConverterTheme {
        Surface (Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            MainScreen(Modifier.fillMaxSize(), Route.MainScreen, {})
        }
    }
}