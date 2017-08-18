package com.thaikotlindev.miracleofstdlib.ch3_collectionsext

import com.thaikotlindev.miracleofstdlib.shared.Product

// implement search function that can be filter by name,priceRange or category
fun List<Product>.search(name: String? = null,
                         priceRange: Pair<Double, Double>? = null,
                         categoryId: String? = null): List<Product> = TODO("Make it happen")
