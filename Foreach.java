class Foreach{
  public static void main(String[] data){
    String[] colors = {"Red","Yellow","Green","White","Dirty White"};
    
    for(String color: colors){
      System.out.println(color);
      System.out.println(" we are the power rangers");
    }

OUTERLOOP:    for(int a = 1;a<=5;a++){
INNERLOOP:      for(int b =1; b<=a;b++){
                  if((a*b)!=10)
                    System.out.print(a*b+" ");
                  else
                    continue INNERLOOP;
              }
              System.out.println();
              }
  }
}