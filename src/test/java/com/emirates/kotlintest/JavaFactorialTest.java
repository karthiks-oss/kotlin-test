package com.emirates.kotlintest;

import com.emirates.kotlintest.utils.Factorial;
import org.junit.Assert;
import org.junit.Test;

public class JavaFactorialTest {
    @Test
    public void testFact0(){
        long result = Factorial.calc(0L);
        Assert.assertEquals("Factorial of 0 should be 1",1,result);
    }

    @Test
    public void testFact6(){
        long result = Factorial.calc(6L);
        Assert.assertEquals("Factorial of 6 should be 720",720,result);
    }
}
