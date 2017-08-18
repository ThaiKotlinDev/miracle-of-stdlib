package com.thaikotlindev.miracleofstdlib.ch1_godlikeext


class MBundle {
    private val mapString = mutableMapOf<String, String>()

    fun putString(key: String, value: String) {
        mapString.put(key, value)
    }

    fun getString(key: String): String? = mapString[key]
}

open class MFragment {
    var arguments: MBundle? = null
}