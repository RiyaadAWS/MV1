package com.riyaadryklief.adp;

import jdk.nashorn.internal.runtime.ECMAException;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

// Riyaad Ryklief 215187849

public class firstTestTest {

    firstTest test = new firstTest("Riyaad", "Ryklief");
    firstTest test2 = new firstTest("Frank","AB");

    //Name method test
    @Test (timeout = 1)
    public void getName() throws Exception {
        assertEquals("Riyaad", test.getName());
        assertEquals("Frank",test2.getName());
        assertNotEquals("dfasd",test.getName());
        assertNotEquals("dfasd",test2.getName());
    }
    //Surname method test
    @Test (timeout = 1)
    public void getSurname() throws Exception {
        assertEquals("Ryklief", test.getSurname());
        assertEquals("AB",test2.getSurname());
        assertNotEquals("dfasd",test.getSurname());
        assertNotEquals("dfasd",test2.getSurname());
    }

    @Test (timeout = 1)
    public void testIfNotEqual() throws Exception{
        assertFalse(test.notEqual());
        assertFalse(test2.notEqual());
    }

    @Test (timeout = 1)
    public void testIfSame() throws Exception {
        assertNotSame(test,test2);
    }

    @Test (timeout = 1)
    public void testIfNull() throws Exception{
        assertNotNull(String.valueOf(test),test2);
    }

    //Ignore test below
    @Ignore
    @Test
    public void ignoreTest() throws Exception{
        System.out.println(test.getName());
        System.out.println(test2.getName());
    }
}