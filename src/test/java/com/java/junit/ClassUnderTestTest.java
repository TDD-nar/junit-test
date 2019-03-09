package com.java.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class ClassUnderTestTest {

    private ClassUnderTest classUnderTest;

    //--------------------------Annotations---------------------------

    //execute before class
    @BeforeClass
    public static void beforeClass() {//Notice its static method
        System.out.println("in before class");
    }

    //execute after class
    @AfterClass
    public static void  afterClass() {//Notice its static method
        System.out.println("in after class");
    }

    @Before//execute before test
    public void setUp() throws Exception {
        classUnderTest = new ClassUnderTest();
        System.out.println("in before");
    }

    //execute after test
    @After
    public void after() {
        System.out.println("in after");
    }

    @Test
    public void testGetString(){
        assertEquals("str", classUnderTest.getString());
    }

    //test case ignore and will not execute, Sometimes it so happens that our code is not
    // completely ready while running a test case. As a result, the test case fails.
    // The @Ignore annotation helps in this scenario.
    // It can be put at class level also
    @Ignore
    @Test
    public void ignoreTest() {
        System.out.println("in ignore test");
    }


    //---------------------Assertions------------
    @Test
    public void testAssertions() {
        //test data
        String str1 = new String ("abc");
        String str2 = new String ("abc");
        String str3 = null;
        String str4 = "abc";
        String str5 = "abc";

        int val1 = 5;
        int val2 = 6;

        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray =  {"one", "two", "three"};

        //Check that two objects are equal
        assertEquals(str1, str2);

        //Check that a condition is true
        assertTrue (val1 < val2);

        //Check that a condition is false
        assertFalse(val1 > val2);

        //Check that an object isn't null
        assertNotNull(str1);

        //Check that an object is null
        assertNull(str3);

        //Check if two object references point to the same object
        assertSame(str4,str5);

        //Check if two object references not point to the same object
        assertNotSame(str1,str3);

        //Check whether two arrays are equal to each other.
        assertArrayEquals(expectedArray, resultArray);
    }

    //---------------------Other Attributes of annotation----------
    //----timeout
    @Test(timeout = 1000)//If test takes more time then its failed
    public void timeOutTest() {
        System.out.println("in ignore test");
    }

    //------Exception Test
    @Test(expected = ArithmeticException.class)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        throw new ArithmeticException();
    }
}