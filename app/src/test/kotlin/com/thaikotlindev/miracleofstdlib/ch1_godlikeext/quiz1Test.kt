package com.thaikotlindev.miracleofstdlib.ch1_godlikeext

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.notNullValue
import org.junit.Assert.assertThat
import org.junit.Test

class ProductDetailFragmentTest {

    @Test
    fun testMiracleInstance() {
        ProductDetailFragment.miracleInstance("10", "test").run {
            assertThat(arguments, notNullValue())
            arguments?.let {
                assertThat(it.getString(ProductDetailFragment.ARG_PRODUCT_ID), equalTo("10"))
                assertThat(it.getString(ProductDetailFragment.ARG_SOMETHING), equalTo("test"))
            }
        }
    }

}