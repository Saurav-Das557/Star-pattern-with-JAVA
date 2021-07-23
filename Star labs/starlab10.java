import java.util.Scanner;
public class starlab10{
  public static void main(String[]args){
    Scanner ac=new Scanner(System.in);
    int n=ac.nextInt(),count=0;
    for(int i=1;i<=n;i++){
      for(int sp=1;sp<=(n-i);sp++){
        System.out.print(" ");
      }
      for(int x=1;x<=(i+count);x++){
        System.out.print(x);                
      }
      count++;
      System.out.println();
    }
  }
}
      