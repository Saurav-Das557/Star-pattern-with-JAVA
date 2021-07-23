import java.util.Scanner;
public class starlab4{
  public static void main(String[]args){
    Scanner ac=new Scanner(System.in);
    int n1=ac.nextInt(),n2=ac.nextInt();
    for(int i=1;i<=n1;i++){
      for(int x=1;x<=n2;x++){
      System.out.print(x);
      }
      System.out.println();
    }
  }
}