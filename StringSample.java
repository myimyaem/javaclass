public class StringSample{
  public static void main(String[] data) {
    String s1 = "1";
    String s2 = s1.concat("2");
    s2.concat("3"); 
    System.out.println("s1 : "+s1);
    System.out.println("s2 : "+s2);        System.out.println(s1.concat("2").equals(s2) );
    // task 112
    // total += 1;

    // task 113 
    // int check_number = 10;
    // String message;
    // for(int i = 0; i<check_number;i++){
    //   message = (i%2==0) ? i+" is even number" : i+" is odd number";
    //   System.out.println(message);
    // }
    
  }
}