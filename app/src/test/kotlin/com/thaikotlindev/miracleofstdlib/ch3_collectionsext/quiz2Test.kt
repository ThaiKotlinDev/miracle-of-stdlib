package com.thaikotlindev.miracleofstdlib.ch3_collectionsext

import com.thaikotlindev.miracleofstdlib.shared.Category
import com.thaikotlindev.miracleofstdlib.shared.Product
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class SearchProductTest {
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
            Product("1", "product1", "", 100.0, categoryList[0]),
            Product("2", "product2", "", 200.0, categoryList[1]),
            Product("3", "namew", "", 300.0, categoryList[2]),
            Product("4", "namex", "", 400.0, categoryList[1]),
            Product("5", "namey", "", 200.0, categoryList[0]),
            Product("6", "namez", "", 600.0, categoryList[2])
    )

    @Test
    fun searchByName_product() {
        assertThat(productList.search(name = "product"),
                equalTo(listOf(productList[0], productList[1])))
    }

    @Test
    fun searchByName_product1() {
        assertThat(productList.search(name = "product1"),
                equalTo(listOf(productList[0])))
    }

    @Test
    fun searchByName_name() {
        assertThat(productList.search(name = "name"),
                equalTo(listOf(productList[2], productList[3], productList[4], productList[5])))
    }

    @Test
    fun searchByPriceRange_100_to_300() {
        assertThat(productList.search(priceRange = 100.0 to 300.0),
                equalTo(listOf(productList[0], productList[1], productList[2], productList[4])))
    }

    @Test
    fun searchByPriceRange_300_to_600() {
        assertThat(productList.search(priceRange = 300.0 to 600.0),
                equalTo(listOf(productList[2], productList[3], productList[5])))
    }

    @Test
    fun searchByPriceRange_0_to_50() {
        assertThat(productList.search(priceRange = 0.0 to 50.0),
                equalTo(listOf()))
    }

    @Test
    fun searchByCategory_1() {
        assertThat(productList.search(categoryId = "1"),
                equalTo(listOf(productList[0], productList[4])))
    }

    @Test
    fun searchByCategory_2() {
        assertThat(productList.search(categoryId = "2"),
                equalTo(listOf(productList[1], productList[3])))
    }

    @Test
    fun searchByCategory_3() {
        assertThat(productList.search(categoryId = "3"),
                equalTo(listOf(productList[2], productList[5])))
    }

    @Test
    fun searchByCategory_10() {
        assertThat(productList.search(categoryId = "10"),
                equalTo(listOf()))
    }

    @Test
    fun searchByName_product_Category_1() {
        assertThat(productList.search(name = "product", categoryId = "1"),
                equalTo(listOf(productList[0])))
    }

    @Test
    fun searchByName_product_Category_2() {
        assertThat(productList.search(name = "product", categoryId = "2"),
                equalTo(listOf(productList[1])))
    }

    @Test
    fun searchByCategory_3_Price_500_to_800() {
        assertThat(productList.search(categoryId = "3", priceRange = 500.0 to 800.0),
                equalTo(listOf(productList[5])))
    }

    @Test
    fun searchByName_name_Category_3_Price_100_to_300() {
        assertThat(productList.search(name = "name", categoryId = "3", priceRange = 100.0 to 300.0),
                equalTo(listOf(productList[2])))
    }

}
