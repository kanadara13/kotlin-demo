package com.land.demo.service

import org.junit.Test

import org.junit.Assert.*

class ItemContractServiceKtTest {

    @Test
    fun destructuring() {
        val data: List<Int> = listOf(1,3,4,5,6,8,10)
        var (a,b) =  data
        print("a 는 $a b는 $b")
    }
}