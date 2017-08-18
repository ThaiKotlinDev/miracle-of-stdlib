package com.thaikotlindev.miracleofstdlib.ch1_godlikeext

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.widget.TextView
import android.widget.Toast
import com.thaikotlindev.miracleofstdlib.R

fun initTextViewBad(context: Context) {
	val tvJAV = TextView(context)
	tvJAV.setText(R.string.app_name)
	tvJAV.setTextColor(ContextCompat.getColor(context, R.color.colorPrimary))
	tvJAV.setOnClickListener {
		Toast.makeText(context, "Hello JAV", Toast.LENGTH_SHORT).show()
	}
}

fun initTextViewWith(textView: TextView) {
	with(textView) {
		setText(R.string.app_name)
		setTextColor(ContextCompat.getColor(context, R.color.colorPrimary))
		setOnClickListener {
			Toast.makeText(context, "Hello JAV", Toast.LENGTH_SHORT).show()
		}
		// can return what your want.
	}
}

fun initTextViewGood(context: Context) {
	val tvJAV = TextView(context).apply {
		//this in this block is tvJAV scope
		setText(R.string.app_name)
		setTextColor(ContextCompat.getColor(context, R.color.colorPrimary))
		setOnClickListener {
			Toast.makeText(context, "Hello JAV", Toast.LENGTH_SHORT).show()
		}
	}
}

fun initTextViewGood2(context: Context) {
	val tvJAV = TextView(context).also {
		//it or can assign new name
		it.setText(R.string.app_name)
		it.setTextColor(ContextCompat.getColor(context, R.color.colorPrimary))
		it.setOnClickListener {
			Toast.makeText(context, "Hello JAV", Toast.LENGTH_SHORT).show()
		}
	}
}

fun callBadApi(callback: ((String) -> Unit)? = null) {
	val resultString: String? = "" //TODO: Call API and get String result
	if (resultString != null && callback != null) {
		callback.invoke(resultString)
	}
}

fun callGoodapi(success: ((String) -> Unit)? = null) {
	val resultString: String? = ""//TODO: Call API and get String result
	resultString?.let { success?.invoke(it) }
}

fun sumPairOldschool(context: Context) {
	val pair: Pair<Int, Int>? = Pair(3, 5)
	var sum = if (pair != null) pair.first + pair.second else 0
}

fun sumPairGood(context: Context) {
	val pair: Pair<Int, Int>? = Pair(3, 5)
	val sumRun = pair?.run { first + second } ?: 0
	val sumLet = pair?.let { it.first + it.second } ?: 0
}



