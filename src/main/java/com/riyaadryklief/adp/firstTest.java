package com.riyaadryklief.adp;
// Riyaad Ryklief 215187849
public class firstTest {

    private String name;
    private String surname;
    private boolean notEqual = false;

    public firstTest(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean notEqual() {
        return notEqual;
    }

    public static void main( String[] args )    {
        System.out.println( "Hello World!" );
    }
}
