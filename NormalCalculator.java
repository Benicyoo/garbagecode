import java.util.*;
public class NormalCalculator{
    //these exist because I needed them to be hypothetically initialized in order to use them without the complier yelling at me
    public static int first;
    public static int firsttime;
    public static double r;
    public static String oP;
    public static double nr;
    
    public static void main(String [] args){
        //put this whole thing into an if statement later.
        int breaker = 1;//used to test if someone wants to stop calculating
        int cont = 0;
        while(breaker==1){
            Scanner fN = new Scanner(System.in);//scanner object for first number
            System.out.println("Enter number");//text prompt
            double fNu = fN.nextDouble();//gets first number
            Scanner op = new Scanner(System.in);//scanner object for operation
            System.out.println("I really want to do something more advanced that making a stupid calculator I should learn html5");//text prompt
            String oP = op.nextLine();//gets operation
            while(!(oP.equals("+")||oP.equals("-")||oP.equals("*")||oP.equals("/"))){//if any of the tests are true the statement returns false allowing the complier to move past this check. Also since they are individual characters multiple character inputs do not get past.
                System.out.println("You didn't enter a valid operation try again");//text prompt
                oP = op.nextLine();//gets new operation input thats hopefully valid
            }//end of loop if they enter something valid
            Scanner sN = new Scanner(System.in);//scanner object for second number
            System.out.println("Enter number");//text prompt
            double sNu = sN.nextDouble();//gets second number
            double r;//variable for the result
            if(oP.equals("+")){//addition
                r = fNu + sNu;//assigns first number plus second number to r for later use in outputing the result.
            }
            else if(oP.equals("-")){//subtraction
                r = fNu - sNu;//assigns first number minus second number to r
            }
            else if(oP.equals("*")){//multiplication
                r = fNu * sNu;//assigns first number multiplied by second number to r
            }
            else{//division
                r = fNu / sNu;//assigns first number divided by second number to r
            }
            System.out.println(r);//outputs result
            Scanner breakOut = new Scanner(System.in);//scanner object for string response to breakout or not
            System.out.println("Are you done with the calculator?\n(you need to say exactly \"yes\" and if you don't type yes it starts a new calculation and does not hold the old one)\n(type anything other than yes if you want to continue)");//text prompt
            String answer = breakOut.nextLine();//gets string input of answer being "yes" or "no". Buttons would be faster but this isn't that kind of complier I think.
            if (answer.equals("yes"))//if yes it decrements variable breaker so it is no longer 1 which breaks out of this while loop.
                breaker--;
            //if answer.equals("yes") does not return true the code runs again until it does.
        }
        while(breaker==2){
            while(cont==0){
                double nu1=0;//this exists here since it doesn't need to be used hypothetically :)
                if(first==0){
                    Scanner n1 = new Scanner(System.in);//this object is only within this if statement
                    System.out.println("firstnum");//text prompt
                    nu1 = n1.nextDouble();//assigns user input of the first number to nu1
                    Scanner op = new Scanner(System.in);//this object is only within this if statement
                    System.out.println("op");//text prompt
                    oP = op.nextLine();//assigns user input of the operation to oP
                    Scanner nx = new Scanner(System.in);//this object is only within this if statement
                    System.out.println("num");//text prompt
                    nr = nx.nextDouble();//assigns user input of the second number to nr
                    first++;//increments first so this code isn't run in the next loop
                }//This if statement only works for the first run through of this code since variable first is incremented then never changed again
                if(firsttime==0){
                    if(oP.equals("+")){//addition
                        r = nu1+nr;//math
                        firsttime++;//increments so this doesn't run in the next loops
                    }
                    else if(oP.equals("-")){//subtraction
                        r = nu1 - nr;//math
                        firsttime++;//increments so this doesn't run in the next loops
                    }
                    else if(oP.equals("*")){//multiplication
                        r = nu1 * nr;//math
                        firsttime++;//increments so this doesn't run in the next loops
                    }
                    else if(oP.equals("/")){//division
                        r = nu1 / nr;//math
                        firsttime++;//increments so this doesn't run in the next loops
                    }   
                    System.out.println(r);//result
                    oP="";//sets oP to nothing since on the next loop oP will be initialized before the user could input the operation they want and so the else statement would output.
                }//it's the same for this if statement as the one above
                else{
                    if(oP.equals("+")){//addition
                        r = r+nr;//math where it takes the pervious result and does an operation
                        System.out.println(r);//output
                    }
                    else if(oP.equals("-")){//subtraction
                        r = r - nr;//math where it takes the pervious result and does an operation
                        System.out.println(r);//output
                    }
                    else if(oP.equals("*")){//multiplication
                        r = r * nr;//math where it takes the pervious result and does an operation
                        System.out.println(r);//output
                    }
                    else if(oP.equals("/")){//division
                        r = r / nr;//math where it takes the pervious result and does an operation
                        System.out.println(r);//output
                    }
                    Scanner continu = new Scanner(System.in);//Scanner object to find out if someone with want to continue performing operations on a number
                    System.out.println("would you like to continue (y/n)");//text prompt
                    String co = continu.nextLine();//gets input of y or n
                    if(co.equals("y")){
                        System.out.println("ok");
                    }
                    //this is just bad I'll fix it later
                    else{
                        cont--;//ends loop
                        break;//ends outer loop? idk it stops the code
                    }
                    Scanner op = new Scanner(System.in);//Scanner object for operation input
                    System.out.println("op");//text prompt
                    oP = op.nextLine();//sets instance variable oP to user input
                    Scanner nx = new Scanner(System.in);//Scanner object for number input
                    System.out.println("repeating num?");//text prompt
                    nr = nx.nextDouble();//sets instance variable nr to user input
                }
            }
            breaker--;//breaks out the loop although I think I'm using a while statement as an if statement
        }
    }
}