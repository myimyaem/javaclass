import java.util.Random;

public class ImportExample{
  public static void main(String[] args){
    Random r = new Random();
    System.out.println(args[0]+" your number is "+r.nextInt(10));
  }
}