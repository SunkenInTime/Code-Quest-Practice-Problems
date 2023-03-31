/*
Sample class to be used as the base for most [if not all] Code Quest Academy problems. All[most] solutions will be coded within the the testCase ForLoop.
Have fun coding :)
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
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
        String[] wordInput = input.nextLine().split("\\|");
        List<String> comparedWord = new ArrayList<>();  
        
        for(String value : wordInput[0].split("")){
          for()
        }
             
        // Your code goes here! :)
        // Have FUN!
       }
    }
  }
}