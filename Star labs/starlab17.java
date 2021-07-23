import java.util.Scanner;
public class starlab17{
  public static void main(String[]args){
    Scanner ac=new Scanner(System.in);
    int n=ac.nextInt();
    
    for(int i=1;i<=n;i++){
      if(i==1 || i==n){
        for(int x=1;x<=i;x++)
          System.out.print(x);
      }else{
        for(int x=1;x<=i;x++){
      if(x==1 || x==i){
        System.out.print(x);
      }else{
        System.out.print(" ");
      }
        }
      } System.out.println();
    }
  }
}