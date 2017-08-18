package com.thaikotlindev.miracleofstdlib.ch3_collectionsext

val list1 = listOf(1, 2, 3)     // [1, 2, 3]
val list2 = listOf(3, 4)        // [3, 4]

fun operatorCollection() {
	val listPlus = list1 + list2    // [1, 2, 3, 3, 4]
	val listMinus = list1 - list2   // [1, 2]
	val listContain = 1 in list1    // true
}

//region Infix
fun infixCollection() {
	val listUnion = list1 union list2           // [1, 2, 3, 4]
	val listIntersect = list1 intersect list2   // [3]
	val listSubtract = list1 subtract list2     // [1, 2]
	val listZip = list1 zip list2               // [(1, 3), (2, 4)]
}
//endregion