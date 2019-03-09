package com.java.junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestJunit1 {
    private String str = "sstr";

    @Test
    public void junitTest(){
        assertEquals("sstr", str);
    }
}
