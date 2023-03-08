/* 
A simple class that will serve as the loader for all Code Quest 
Academy problems. In order to sumbit the code solution to Code Quest Academy 
DOMJudge, the student must provide the solution in the form of a 'class.java' 
file.
*/
class Main {
  public static void main(String[] args) {

    System.out.println("Running Code Quest Academy problem tester...");

    /*2
  
    STUDENTS [Only Change this section]: Change 'Prob00' with the name of 
    our created solution class. 
    Ex. For problem 1 change to 'Prob01 loadedProblem = new Prob01();'
    */
    Adipply loadedProblem = new Adipply();
    //STUDENTS: End of change section

    
    loadedProblem.main(null);    // Run the solution
     
  }
}