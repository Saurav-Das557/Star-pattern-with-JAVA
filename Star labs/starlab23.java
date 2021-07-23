import java.util.Scanner;
public class starlab23{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int line=sc.nextInt();
    for(int i=1;i<=line;i++){
      if(i==1){
        for(int x=1;x<=(line-i);x++){
          System.out.print(" ");
        }
        for(int count=1;count<=(2*i)-1;count++){
          System.out.print(count);
        }
      }else{
         for(int x=1;x<=(line-i);x++){
          System.out.print(" ");
        }
        for(int count=1;count<=(2*i)-1;count++){
        if(count==1||count==(2*i)-1){
          System.out.print(count);
        }else{
          System.out.print(" ");
        }
        }
      }System.out.println();
    }for(int i=line;i>=2;i--){
      for(int x=1;x<=line-(i-1);x++){
        System.out.print(" ");
      }for(int count=1;count<=(i*2)-3;count++){
        if(count==1||count==(i*2)-3){
          System.out.print(count);
        }else{
          System.out.print(" ");
        }
      }System.out.println();
    }
  }
}
    
 
        