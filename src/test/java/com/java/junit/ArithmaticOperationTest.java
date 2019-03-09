package com.java.junit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ArithmaticOperationTest {
    private ArithmaticOperation arithmaticOperation;

    private int a;
    private int b;
    private int expectedResult;

    public ArithmaticOperationTest(int a, int b, int expectedResult) {
        this.a = a;
        this.b = b;
        this.expectedResult = expectedResult;
    }

    @Before
    public void setUp() throws Exception {
        arithmaticOperation = new ArithmaticOperation();
    }

    @Parameterized.Parameters
    public static Collection params(){
        return Arrays.asList(new Object[][]{{1,2,3}, {3,3,6}, {4,6,10}});
    }

    @Test
    public void addTest(){
        assertEquals(expectedResult, arithmaticOperation.addNumbers(a, b));
    }
}