package com.littlelemon.menu

import org.junit.Test
import org.junit.jupiter.api.Assertions.*


class FilterHelperTest{
    @Test
    fun filterProducts_filterTypeDessert_croissantReturned() {
        // Declare una lista de productos con diferentes categorías
        val sampleProductsList = mutableListOf(
            ProductItem(title = "Black tea", price = 3.00, category = "Drinks", R.drawable.black_tea),
            ProductItem(title = "Croissant", price = 7.00, category = "Dessert", R.drawable.croissant),
            ProductItem(title = "Bouillabaisse", price = 20.00, category = "Food", R.drawable.bouillabaisse)
        )

        // Ejecuta FilterHelper.filterProducts con FilterType.Dessert y sampleProductsList
        val filteredList = FilterHelper().filterProducts(FilterType.Dessert, sampleProductsList)

        // Prueba el resultado, esperando que solo contenga el producto "Croissant"
        assertEquals(1, filteredList.size) // Debería haber un solo elemento en la lista
        assertEquals("Croissant", filteredList[0].title) // El producto en la lista debe ser "Croissant"
        assertEquals(7.00, filteredList[0].price, 0.01) // El precio del producto debe ser 7.00
        assertEquals("Dessert", filteredList[0].category) // La categoría del producto debe ser "Dessert"
        assertEquals(R.drawable.croissant, filteredList[0].image) // La imagen del producto debe ser R.drawable.croissant
    }
}



