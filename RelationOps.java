public class RelationOps{
  public static void main(String[] args){
    int  x = 10, y= 20, z = 10,yy = 1;
    short zz = 1;
    // System.out.println((zz==yy)|| false);
    StringBuilder a = new StringBuilder("name");
    StringBuilder b = new StringBuilder("name");
    StringBuilder c = a;
    System.out.println(a.toString().equals(b.toString()));
    System.out.println(a==c);
  }
}