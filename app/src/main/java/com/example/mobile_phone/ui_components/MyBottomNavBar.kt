package com.example.mobile_phone.ui_components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.R

@Preview(showBackground = true)
@Composable
fun MyBottomNavBar() {
    val NavItem = listOf(
        NavItem(
            title = "Home",
            icon = R.drawable.ic_home
        ),
        NavItem(
            title = "Search",
            icon = R.drawable.ic_search
        ),
        NavItem(
            title = "Cart",
            icon = R.drawable.ic_cart
        ),
    )


    NavigationBar(
        ContainerColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier.fillMaxWidth()


    ) { }


}


data class NavItem(
    val title: String,
    val icon: Int
)