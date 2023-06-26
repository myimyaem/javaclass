
class Main {
  public static void main(String[] args) {
    // this will display a greeting for students
    System.out.println("Hello java students");
    /*
    *  this
    *  is a
    * multiline comment
    */
    System.out.println( Hello("Marco") );
  }
  public static String Hello(String name1){
    // this is an age variable
      int age = 20;
    // System.out.println("Hello "+ name1 + " you are now " +age+ " years old");
    return "Hello "+ name1 + " you are now " +age+ " years old";
  }
}