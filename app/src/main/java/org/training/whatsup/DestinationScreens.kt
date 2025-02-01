package org.training.whatsup

sealed class DestinationScreens(val route: String) {
    object Highlight : DestinationScreens("highlight")
    object NearMe : DestinationScreens("nearMe")
    object MyEvents : DestinationScreens("myEvents")
}