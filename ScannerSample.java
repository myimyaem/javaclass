import java.util.*;
public class ScannerSample{
  public static void main(String[] data) {
    String NameOfUser="";
    Scanner inputName = new Scanner(System.in);
    System.out.println("Enter your name: ");
    NameOfUser = inputName.next();
    System.out.println("Hello "+NameOfUser+" you may use this program");
    // sum of two input numbers
    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    int num1 = 0,num2 = 0;
    System.out.println("Enter 1st number: ");
    num1 = input1.nextInt();
    System.out.println("Enter 2nd number: ");
    num2 = input2.nextInt();
    System.out.println(NameOfUser+" sum of two number is: "+ (num1+num2));
    if((num1+num2)<=60 && (num1+num2)>=45)
      System.out.println((num1+num2)+" is grade F");
    // else if()
    //   D
    // else if()
    //   B
    //     .
    //     .
    //     .
    // else
    //     invalid grade
        
    // end of sum of two input numbers
    
  }
}