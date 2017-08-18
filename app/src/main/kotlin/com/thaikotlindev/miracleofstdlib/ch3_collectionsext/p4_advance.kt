package com.thaikotlindev.miracleofstdlib.ch3_collectionsext

import com.thaikotlindev.miracleofstdlib.shared.Category
import com.thaikotlindev.miracleofstdlib.shared.Product

private val categoryList = listOf(
	Category("1", "sport1", listOf(
		Category("4", "sport4"),
		Category("5", "sport5")
	)),
	Category("2", "sport2", listOf(
		Category("6", "sport6")
	)),
	Category("3", "sport3")
)
private val productList = listOf(
	Product("1", "product1", "description1", 100.0, categoryList[0]),
	Product("2", "product2", "description5", 200.0, categoryList[1]),
	Product("3", "product3", "description3", 300.0, categoryList[2]),
	Product("4", "product4", "description4", 400.0, categoryList[1]),
	Product("5", "product5", "description2", 200.0, categoryList[0]),
	Product("6", "product6", "description6", 600.0, categoryList[2])
)

fun advanceCollection() {
	productList.filter { it.price > 200.0 } // 3,4,6
	productList.filterNot { it.price == 200.0 } // 1,3,4,6

	productList.map { it.price * 1.07 } // 107.0, 214.0 ,321.0, 428.0, 214.0, 642.0 vat7%

	categoryList.flatMap {
		it.subCategoryList.map { it.name } // [sport4, sport5], [sport6], []
	} // [sport4, sport5, sport6]

	productList.groupBy { it.category } // {cat1:[p1,p5], cat2:[p2,p4], cat3:[p3,p6]

	productList.sortedBy { it.price }   //  [p1,p2,p5,p3,p4,p6]
	productList.sortedByDescending { it.price }   //[p6,p4,p3,p5,p2,p1]
	productList.sortedWith(compareBy(Product::price, Product::description)) // [p1,p5,p2,p3,p4,p6]
}



