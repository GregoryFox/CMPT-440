/**
 * file: driverDFA.java
 * author: Gregory Fox
 * course: CMPT 440
 * assignment: lab 2
 * due date: February 16 2016
 * version
 *
 * This file contains the declaration of the ManWolf program.
 */

/**
 * ManWolf
 *
 * This is the creation of the ManWolf class.
 */
public class ManWolf {

    private int state;

    private static final int Q0 = 0;
    private static final int Q1 = 1;
    private static final int Q2 = 2;
    private static final int Q3 = 3;
    private static final int Q4 = 4;
    private static final int Q5 = 5;
    private static final int Q6 = 6;
    private static final int Q7 = 7;
    private static final int Q8 = 8;
    private static final int Q9 = 9;
    private static final int Q10 = 10;

private static int[][] array = {
        {Q10, Q1, Q10, Q10},
        {Q10, Q0, Q10, Q2},
        {Q7, Q10, Q3, Q1},
        {Q10, Q4, Q2, Q10},
        {Q5, Q3, Q10, Q10},
        {Q4, Q10, Q8, Q6},
        {Q10, Q7, Q10, Q5},
        {Q10, Q6, Q10, Q10},
        {Q2, Q9, Q10, Q10},
        {Q10, Q8, Q5, Q10},
        {Q10, Q10, Q10, Q10}

};



    private int delta(char c) {
        switch (c) {
            case 'w':
                return 0;
            case 'g':
                return 1;
            case 'c':
                return 2;
            case 'n':
                return 3;
            default:
                state = Q10; //error state
                return 0;
        }
    }

    public boolean solution() {
        return state == Q7;

    }

    public void sequence(String cat){
        for (int i=0; i < cat.length(); i++){
            char x = cat.charAt(i);
            int input = this.delta(x);
            state = array[state][input];

        }
    }


    public static void main(String[] args){
        ManWolf result = new ManWolf();

        result.sequence(args[0]);


        if (result.solution() == true){

            System.out.println("That is a solution");

        }
        else {
            System.out.println("That is not a solution");

        }




    }
}

