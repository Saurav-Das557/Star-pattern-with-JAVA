import java.util.Scanner;
public class starlab13{
  public static void main(String[]args){
    Scanner ac=new Scanner(System.in);
     int n=ac.nextInt();
    for(int i=1,count=0;i<=n;i++){
      for(int sp=1;sp<=(n-i);sp++){
        System.out.print(" ");
      }
      for(int x=1;x<=(i+count);x++){
        System.out.print(x);                
      }
      count++;
      System.out.println();
    }
    
    for(int i=n-1,count=(i-1);i>=1;i--){
      for(int sp=1;sp<=(n-i);sp++){
        System.out.print(" ");
      }      
      for(int x=(i+count);x>=1;x--){
        System.out.print(x);                
      }     
      count--;
      System.out.println();
    }
  }
}