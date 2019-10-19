import java.util.*;
  public class Calculator{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
        String zxc;
        int f, s;
          System.out.println("Enter number of operations:");
          int num = sc.nextInt();
          
          if(num >= 1 && num <= 100){
            System.out.println("Enter all operations in one line:");
            for(int counter = 1; counter <=num; counter++){
              zxc = sc.next();
             if (zxc.equals("negate")){
              f= sc.nextInt();
                System.out.println(-f);
              }else if (zxc.equals("add")){
              f = sc.nextInt();
              s = sc.nextInt();
                System.out.println(f+s);
              }else if (zxc.equals("max")){
              f = sc.nextInt();
              s = sc.nextInt();
              if(f>s){
                System.out.println(f);
                }
              else if(s>f){
                System.out.println(s);
                }
              else{
                System.out.println(s);
              }
             }   
       }
       }
  }
}          