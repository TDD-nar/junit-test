package com.java.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ClassUnderTestTest.class);

        //To run suite
        //Result result = JUnitCore.runClasses(TestSuit.class);

        for(Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}