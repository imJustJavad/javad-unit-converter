package solid.javad.unitconverter.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import solid.javad.unitconverter.ui.screen.ConvertScreen
import solid.javad.unitconverter.ui.screen.MainScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController) {
    NavHost(navController, startDestination = Route.MainScreen) {
        composable<Route.MainScreen> { backStackEntry ->
            MainScreen(modifier, backStackEntry.toRoute())
        }

        composable<Route.ConvertScreen> { backStackEntry ->
            ConvertScreen(modifier, backStackEntry.toRoute())
        }
    }
}