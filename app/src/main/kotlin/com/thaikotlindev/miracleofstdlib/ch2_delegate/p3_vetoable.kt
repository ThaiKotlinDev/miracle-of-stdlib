package com.thaikotlindev.miracleofstdlib.ch2_delegate

import kotlin.properties.Delegates

class HelloVetoable {

	var age by Delegates.vetoable(0) { _, old, new ->
		println("New $new, Old $old")
		new < 10
	}

	fun run() {
		age = 1         // age = 1
		age = 2         // age = 2
		age = 10        // age = 2
		age = 1000      // age = 2
	}
}





