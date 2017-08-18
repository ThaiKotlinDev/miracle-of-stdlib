package com.thaikotlindev.miracleofstdlib.ch3_collectionsext

import com.thaikotlindev.miracleofstdlib.shared.Category
import com.thaikotlindev.miracleofstdlib.shared.Product

private val categoryList = listOf(Category("1", "sport"))
private val productList = listOf(
	Product("1", "product1", "description1", 100.0, categoryList[0]),
	Product("2", "product2", "description2", 200.0, categoryList[0]),
	Product("3", "product3", "description3", 300.0, categoryList[0]),
	Product("4", "product4", "description4", 400.0, categoryList[0]),
	Product("5", "product5", "description5", 200.0, categoryList[0]),
	Product("6", "product6", "description6", 600.0, categoryList[0])
)

fun searchOne() {
	productList.first()                             // Product 1
	productList.first { it.name == "product20" }    // Throw NoSuchElementException
	productList.firstOrNull { it.price == 200.0 }   // Product 2
	productList.firstOrNull { it.price == 1000.0 }  // Null

	productList.last()                              // Product 6
	productList.lastOrNull { it.price == 200.0 }    // Product 5

	productList.single()                            // throw IllegalArgumentException("List has more than one element.")
	productList.singleOrNull()                      // Null
	productList.single { it.price == 600.0 }        // Product 6
	productList.single { it.price == 200.0 }        // throw IllegalArgumentException("Collection contains more than one matching element.")
}