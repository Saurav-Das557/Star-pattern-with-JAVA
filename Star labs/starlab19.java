import java.util.Scanner;
public class starlab19{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int line=sc.nextInt();
    for(int i=0;i<line;i++){
    
      if(i==0||i==(line-1)){
          for(int x=1;x<(line-i);x++){
        System.out.print(" ");
          } for(int count=(line-i);count<=line;count++){
          System.out.print(count);
        }
      }else{
         for(int x=1;x<(line-i);x++){
        System.out.print(" ");
         } for(int count=(line-i);count<=line;count++){
          if(count==(line-i)||count==line){
            System.out.print(count);
          }else{
            System.out.print(" ");
          }
        } 
      } System.out.println();
          }
          
  
  }
}