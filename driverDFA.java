/**
 * file: driverDFA.java
 * author: Gregory Fox
 * course: CMPT 440
 * assignment: lab 2
 * due date: February 16 2016
 * version
 *
 * This file contains the declaration of the driverDFA for the ManWolfGoatCabbage program.
 */

abstract class driverDFA {
    private int state;
    static private int [][] array;

    public abstract boolean solution();
    public abstract int delta(char c);
    public abstract void process(String c);

}