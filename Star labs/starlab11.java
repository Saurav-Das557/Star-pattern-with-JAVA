import java.util.Scanner;
public class starlab11{
  public static void main(String[]args){
    Scanner ac=new Scanner(System.in);
    int n=ac.nextInt();
    int n2=n;
    
    for(int i=n;i>=1;i--){
      for(int sp=(n-1);sp>=1;sp--){
        System.out.print(" ");
      }
      System.out.print(i);      
      for(int x=n+1;x<=n2;x++){
        System.out.print(x);
      }     
      System.out.println();
      n--;
    }
  }
}
   
    