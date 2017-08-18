package com.thaikotlindev.miracleofstdlib.ch1_godlikeext

class ProductDetailFragment : MFragment() {

    companion object {
        const val ARG_PRODUCT_ID = "PRODUCT_ID"
        const val ARG_SOMETHING = " SOMETHING"

        fun badInstance(productId: String, something: String?): ProductDetailFragment {
            val bundle = MBundle()
            bundle.putString(ARG_PRODUCT_ID, productId)
            if (something != null) bundle.putString(ARG_SOMETHING, something)
            val fragment = ProductDetailFragment()
            fragment.arguments = bundle
            return fragment
        }

        fun badInstance(productId: String): ProductDetailFragment {
            return badInstance(productId, null)
        }

        fun miracleInstance(productId: String, something: String? = null): ProductDetailFragment {
            TODO("Make it happen")
        }
    }

}