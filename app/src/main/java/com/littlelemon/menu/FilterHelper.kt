package com.littlelemon.menu

class FilterHelper {//TODO create a FilterHelperTest and write a unit test for filterProducts

    fun filterProducts(type: FilterType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            FilterType.All -> productsList
            FilterType.Dessert -> productsList.filter { it.category == "Dessert" } // Filtrar productos con categoría "Dessert"
            FilterType.Drinks -> productsList.filter { it.category == "Drinks" } // Filtrar productos con categoría "Drinks"
            FilterType.Food -> productsList.filter { it.category == "Food" } // Filtrar productos con categoría "Food"

        }
    }

}