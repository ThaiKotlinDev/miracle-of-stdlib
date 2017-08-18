package com.thaikotlindev.miracleofstdlib.ch2_delegate

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v4.app.Fragment

class FakeFragment : Fragment() {
	// This approach can not run cuz context is null.
	// val badPreference = context.getSharedPreferences("PREF_NAME", Context.MODE_PRIVATE)

	lateinit var normalPreference: SharedPreferences

	val goodPreference: SharedPreferences by lazy { context.getSharedPreferences("PREF_NAME", Context.MODE_PRIVATE) }

	override fun onActivityCreated(savedInstanceState: Bundle?) {
		super.onActivityCreated(savedInstanceState)

		normalPreference = context.getSharedPreferences("PREF_NAME", Context.MODE_PRIVATE)
		normalPreference.getString("NORMAL_PREFERENCE", ":|")

		goodPreference.getString("GOOD_PREFERENCE", ":)")
	}
}
