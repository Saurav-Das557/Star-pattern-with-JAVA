import java.util.Scanner;
public class starlab25{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int line=sc.nextInt();
    for(int i=1;i<=line;i++){
      for(int x=1;x<=(line-i);x++){
        System.out.print(" ");
      }for(int count=1;count<=i;count++){
        System.out.print(count);
      }for(int j=i-1;j>=1;j--){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
    
  