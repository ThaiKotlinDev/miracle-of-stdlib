package com.thaikotlindev.miracleofstdlib.ch3_collectionsext

fun immutableCollection() {
	val list = listOf(1, 2, 3)                          // [1, 2, 3]
	val set = setOf("Ant", "Bat", "Cat", "Ant", "Bat")  // [Ant, Bat, Cat]
	val map = mapOf("A" to 1, "B" to 2)                 // {"A":1, "B":2}
	val range = 1..5                                    // [1, 2, 3, 4, 5]
	val rangeChar = 'A'..'C'                            // ['A', 'B', 'C']

	list.all { it > 0 }                         // true
	list.any { it < 0 }                         // false
	list.none { it > 5 }                        // false
	list.joinToString("/")                      // A/B/C/A/B
	list.sum()                                  // 6
	set.sumBy { it.length }                     // 9
	map.minBy { it.value }                      // {"A":1}
	3 in range                                  // true
	range.sum()                                 // 15

	for (i in 0..list.size - 1) {
		list[i]
	}
	list.forEach { item -> }
	list.forEachIndexed { index, item -> }

	list.toSet()
	set.toMutableList()
	map.toList()
	range.toList()
}

fun mutableColleciton() {
	val list = mutableListOf("A", "B", "C", "A", "B")   // [A, B, C, A, B]
	list.add("D")                                       // [A, B, C, A, B, D]
	list.add(0, "Z")                                    // [Z, A, B, C, A, B, D]
	list.removeAt(1)                                    // [Z, B, C, A, B, D]

	val set = mutableSetOf("A", "B", "C", "A", "B")     // [A, B, C]
	set.add("A")                                        // [A, B, C]

	val map = mutableMapOf("A" to 1, "B" to 2)          // {"A":1, "B":2}
	map.put("C", 99)                                    // {"A":1, "B":2, "C": 99}
	map.remove("C")                                     // {"A":1, "B":2}
}