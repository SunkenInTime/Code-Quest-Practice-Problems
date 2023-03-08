/*
Sample class to be used as the base for most [if not all] Code Quest Academy problems. All[most] solutions will be coded within the the testCase ForLoop.
Have fun coding :)
*/
import java.util.Scanner;

public class Prob01                                           // Name of class reference the problem number 
{
  
  public static void main(String[] args) 
  {
    
    try (Scanner input = new Scanner(System.in))              // Read the user text input
    {
      int testCases = Integer.parseInt(input.nextLine());     // First input will identify the number of test cases
    //  and guide how many times the for loop is iterated.
      for(int testcase = 0; testcase < testCases; testcase++) 
      {                                                   
       String timeString = input.nextLine();
       int hours = 0;
       int minutes = 0;
       int seconds = 0;
       String[] splitTimeStrings = timeString.split("[\\s,]+");
       for (String value : splitTimeStrings){
        String subValue = value.substring(0, value.length()-1);
          
          if(value.endsWith("h")){
            hours = Integer.parseInt(subValue);
          }else if(value.endsWith("m")){
            minutes = Integer.parseInt(subValue);
          }else if (value.endsWith("s")){
            seconds = Integer.parseInt(subValue);
          }
        
          
      
       }
       System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
       }
       input.close();
    }

  }
}