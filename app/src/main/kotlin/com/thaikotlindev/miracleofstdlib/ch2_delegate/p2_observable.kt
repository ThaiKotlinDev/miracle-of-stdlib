package com.thaikotlindev.miracleofstdlib.ch2_delegate

import kotlin.properties.Delegates

class HelloObservable {

	var name by Delegates.observable("time0") { _, old, new ->
		println("New $new, Old $old")
	}

	fun run() {
		name = "time1" // New time1, Old time0
		name = "time2" // New time2, Old time1
		name = "time3" // New time3, Old time2
		name = "time5" // New time5, Old time3
		name = "time6" // New time6, Old time5
	}
}





