package com.java.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestJunit1.class, ClassUnderTestTest.class})
public class TestSuit {
}
