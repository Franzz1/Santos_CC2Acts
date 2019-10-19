import java.util.*;
  public class Numbers{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number from 0-9:");
      try{
      int q = sc.nextInt();
      int w = sc.nextInt();
      int u = sc.nextInt();
      int r = sc.nextInt();
      int t = sc.nextInt();
      int y = sc.nextInt();
      
      int num = 11;
      while(num<=99){
        int ahh = num/10;
        int ohh = num%10;
         boolean zxc = ahh == q || ahh == w || ahh == u || ahh == r || ahh == t || ahh == y;
         boolean qaz = ohh == q || ohh == w || ohh == u || ohh == r || ohh == t || ohh == y;
            if(zxc == true || qaz == true){
                num++;
                continue;
              }else{
                  System.out.println(num);
                  num++;
                  }
                 }
                }
                  catch(InputMismatchException q){
                  System.out.print("Error");
         }       
      } 
   }   
    
      