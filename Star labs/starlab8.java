import java.util.Scanner;
public class starlab8{
  public static void main(String[]args){
    Scanner ac=new Scanner(System.in);
    int n=ac.nextInt();
    for(int i=1;i<=n;i++){
      for(int sp=1;sp<=(n-i);sp++){
        System.out.print(" ");
      }
      for(int x=1;x<=i;x++){
        System.out.print(x);
      }
      System.out.println();
    }
  }
}
      