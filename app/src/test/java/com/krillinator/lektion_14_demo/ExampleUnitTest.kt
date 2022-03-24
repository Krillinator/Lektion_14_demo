package com.krillinator.lektion_14_demo

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)  // 2 + 2 = 4?
    }

    @Test
    fun addition_isCorrect2() {
        assertEquals(4, 2 + 3)  // 2 + 3 = 4?
    }

    @Test
    fun testMethod() {
        assertTrue(3 > 2)
    }
}