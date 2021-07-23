import java.util.Scanner;
public class starlab14{
  public static void main(String[]args){
    Scanner ac=new Scanner(System.in);
    int n1=ac.nextInt(),n2=ac.nextInt();
    for(int i=1;i<=n1;i++){
      
      if(i==1 || i==n1){
        for(int x=1;x<=n2;x++)
          System.out.print('*');
      }else{
        for(int x=1;x<=n2;x++){
          if(x==1 || x==n2)
            System.out.print('*');
          else
            System.out.print(" ");
        }
      }
      System.out.println();
        }
      }
    }
  

