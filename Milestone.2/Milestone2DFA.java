//Gregory Fox
public class Milestone2DFA {
//establishing all the states
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
	private static final int Q11 = 11;
	private static final int Q12 = 12;
	private static final int Q13 = 13;
	private static final int Q14 = 14;
	private static final int Q15 = 15;
	private static final int Q16 = 16;
	private static final int Q17 = 17;
	private static final int Q18 = 18;
	private static final int Q19 = 19;
	private static final int Q20 = 20;
	private static final int Q21 = 21;
	private static final int Q22 = 22;
	private static final int Q23 = 23;
	private static final int Q24 = 24;
	private static final int Q25 = 25;
	private static final int Q26 = 26;
	private static final int Q27 = 27;
	private static final int Q28 = 28;
	private static final int Q29 = 29;
	private static final int Q30 = 30;
	private static final int Q31 = 31;
	private static final int Q32 = 32;
	private static final int Q33 = 33;
	private static final int Q34 = 34;
	private static final int Q35 = 35;
	private static final int Q36 = 36;
	private static final int Q37 = 37;
	private static final int Q38 = 38;
	private static final int Q39 = 39;
	private static final int Q40 = 40;
	private static final int Q41 = 41;
	private static final int Q42 = 42;
	private static final int Q43 = 43;
	private static final int Q44 = 44;
	private static final int Q45 = 45;
	private static final int Q46 = 46;
	private static final int Q47 = 47;
	private static final int Q48 = 48;
	private static final int Q49 = 49;
	
	private static int state = Q0;
	
	public String currentStatement = "";
	
	public int inputState (char in) {
		switch(in) {
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'o':
		case 'q':
		case 's':
		case 'u':
		case 'w':
		case 'x':
		case 'z':
			return 0; //excluding characters for keywords
		case 'v':
			return 1;
		case 'a':
			return 2;
		case 'r':
			
			if ( state == Q1 ){
				return 5;
			}
				else {
					return 3;
				}
		case 'i':
			return 6;
		case 'p':
			return 4;
		case 't':
			return 8;
		case 'n':
			return 7;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			return 9;
		case ' ':
			return 10;
		case '-':
			return 11;
		case '+':
			return 12;
		case '=':
			return 13;
		case '*':
			return 14;
		case '"':
			return 15;
		case '(':
			return 16;
		case ')':
			return 17;
		default:
			return 0;			
		}
	}
	
public void reset() {
		state = Q0;
}

public boolean process(String in){
    for (int i=0; i < in.length(); i++){
        char c = in.charAt(i);
        int input = this.inputState(c); //makes the input a number
        System.out.println("Input: " + input);
        try{
        state = DFAMatrix[state][input];
        System.out.println(state);
        } catch (ArrayIndexOutOfBoundsException ex){
        	state = Q49;
        }
    }
        
  	  if (state == Q11 ||state == Q27 || state == Q32 || state == Q36 ||state == Q47 ||state == Q48 ) {
      	System.out.println("true");
      	System.out.println(state);
      	state = Q0;
      	return true;
      	
	  }    
      else {
	        	System.out.println(state);
	        	reset();
	        	return false;
      }
    
}
	
//making the DFA matrix
	public static int [][] DFAMatrix = {
//q0
/*1*/	{Q28,Q23,Q28,Q28,Q1,Q28,Q28,Q28,Q28,Q49,Q49,Q49,Q49,Q49,Q41,Q49,Q49,Q49},
/*2*/	{Q49,Q49,Q49,Q2,Q49,Q2,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*3*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q3,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*4*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q4,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*5*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q5,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*6*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q6,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*7*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q7,Q49},
/*8*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q8,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*9*/	{Q9,Q9,Q9,Q9,Q9,Q9,Q9,Q9,Q9,Q17,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*10*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q10,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*11*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q11},
/*12*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q0,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*13*/	{Q13,Q13,Q13,Q13,Q13,Q13,Q13,Q13,Q13,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*14*/	{Q13,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q14,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*15*/	{Q13,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q15,Q49,Q49},
/*16*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q16,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*17*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q11},
/*18*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q18,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*19*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q19,Q49,Q49,Q49,Q49,Q11},
/*20*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q20,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*21*/	{Q21,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*22*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q22,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*23*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q11},
/*24*/	{Q49,Q49,Q24,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*25*/	{Q49,Q49,Q49,Q25,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*26*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q26,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*27*/	{Q27,Q27,Q27,Q27,Q27,Q27,Q27,Q27,Q27,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*28*/	{Q27,Q27,Q27,Q27,Q27,Q27,Q27,Q27,Q27,Q49,Q0,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*29*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q29,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*30*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q30,Q49,Q49,Q49,Q49},
/*31*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q31,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*32*/	{Q48,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q32,Q49,Q49,Q49,Q49,Q49,Q37,Q49,Q49},
/*33*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q32,Q33,Q49,Q49,Q49,Q49,Q49,Q49,Q49},	
/*34*/	{Q0,Q23,Q0,Q0,Q1,Q0,Q0,Q0,Q0,Q0,Q0,Q0,Q34,Q0,Q0,Q0,Q0,Q0},
/*35*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q35,Q49,Q49,Q49,Q49,Q49,Q49,Q49},	
/*36*/	{Q36,Q36,Q36,Q36,Q36,Q36,Q36,Q36,Q36,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},		
/*37*/	{Q36,Q36,Q36,Q36,Q36,Q36,Q36,Q36,Q36,Q49,Q0,Q49,Q49,Q49,Q49,Q49,Q49,Q49},		
/*38*/	{Q38,Q38,Q38,Q38,Q38,Q38,Q38,Q38,Q38,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},		
/*39*/	{Q38,Q38,Q38,Q38,Q38,Q38,Q38,Q38,Q38,Q49,Q39,Q49,Q49,Q49,Q49,Q49,Q49,Q49},		
/*40*/	{Q38,Q38,Q38,Q38,Q38,Q38,Q38,Q38,Q38,Q49,Q49,Q49,Q49,Q49,Q49,Q40,Q49,Q49},			
/*41*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q0,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*42*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q42,Q49,Q49,Q49,Q49,Q49,Q49},
/*43*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q43,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*44*/	{Q44,Q44,Q44,Q44,Q44,Q44,Q44,Q44,Q44,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*45*/	{Q44,Q44,Q44,Q44,Q44,Q44,Q44,Q44,Q44,Q49,Q45,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
/*46*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q46,Q49,Q49,Q49,Q49,Q49,Q49},
/*47*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q47,Q49,Q49,Q49},
/*48*/	{Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q0,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
		{Q48,Q48,Q48,Q48,Q48,Q48,Q48,Q48,Q48,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49,Q49},
		
	};
	
	  public void test(){
		    for(int i = 0; i < DFAMatrix.length; i++)
		    {
		        for(int j = 0; j < DFAMatrix[i].length; j++)
		        {
		            System.out.print(DFAMatrix[i][j]);
		            if(j < DFAMatrix[i].length - 1) System.out.print(" ");
		        }
		        System.out.println();
		    }
	  }

}
