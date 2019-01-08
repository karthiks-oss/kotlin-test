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

    @Test(expected = StackOverflowError.class)
    public void testBig(){
        int result = Factorial.calc(Integer.MAX_VALUE);
    }

    @Test(expected = StackOverflowError.class)
    public void testBigL(){
        long result = Factorial.calc(Long.MAX_VALUE);
    }

    @Test
    public void testKt(){
        TestClass testClass = new TestClass();
        int result = testClass.test();
        Assert.assertEquals("Test results should be 1",1,result);
    }
}
