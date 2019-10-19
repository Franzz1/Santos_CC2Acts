import java.util.Scanner;
  public class Numbers1{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number from 0-9:");
      int q = sc.nextInt();
      int w = sc.nextInt();
      int u = sc.nextInt();
      int r = sc.nextInt();
      int t = sc.nextInt();
      int y = sc.nextInt();
      if(q >= 0 && q <=9 && w >= 0 && w<=9 && u >= 0 && u<=9 && r >= 0 && r<=9 && t >= 0 && t<=9 && y >= 0 && y<=9)
      {
        for(int i=11;i<=99;i++)
        {
          if(i/10 == q|| i/10 == w|| i/10 == u|| i/10 == r|| i/10 == t|| i/10 == y )
          {
            continue;
            }
            if(i%10 == q || i%10 == w || i%10 == u || i%10 == r || i%10 == t || i%10 == y )
            {
            continue;
            }
            System.out.println(i);
          }    
        }
        else{
        System.out.print("Error");
        }
  
  
  }
 }    