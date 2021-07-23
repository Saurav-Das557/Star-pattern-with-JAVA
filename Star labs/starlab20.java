import java.util.Scanner;
public class starlab20{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int line=sc.nextInt();
    for(int i=1;i<=line;i++){
      if(i==1||i==line){
        for(int x=1;x<=(line-i);x++){
          System.out.print(" ");
        }
        for(int count=1;count<=(2*i)-1;count++){
          System.out.print("*");
        }
      }else{
         for(int x=1;x<=(line-i);x++){
          System.out.print(" ");
        }
        for(int count=1;count<=(2*i)-1;count++){
        if(count==1||count==(2*i)-1){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
        }
      }System.out.println();
    }
  }
}
        