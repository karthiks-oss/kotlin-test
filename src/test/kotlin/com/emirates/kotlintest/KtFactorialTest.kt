package com.emirates.kotlintest

import com.emirates.kotlintest.utils.Factorial;
import org.junit.Assert
import org.junit.Test

class KtFactorialTest {
    @Test
    fun testFact0(){
        val result = Factorial.calc(0);
        Assert.assertEquals("Factorial of 0 should be 1",1,result);
    }

    @Test
    fun testFact1(){
        val result = Factorial.calc(1);
        Assert.assertEquals("Factorial of 1 should be 1",1,result);
    }

    @Test
    fun testFact5(){
        val result = Factorial.calc(5);
        Assert.assertEquals("Factorial of 5 should be 120",120,result);
    }

    @Test
    fun testMain(){
        Main.main(null);
    }
}