package com.thaikotlindev.miracleofstdlib.shared

data class Category(val id: String, val name: String, val subCategoryList: List<Category> = listOf())

data class Product(val id: String, val name: String, val description: String, val price: Double,
                   val category: Category)