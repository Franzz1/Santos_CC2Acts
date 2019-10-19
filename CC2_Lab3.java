public class CC2_Lab3{
 public static void main (String[]args){
  char F = 'F';
  char R = 'R';
  char A = 'A';
  char N = 'N';
  char Z = 'Z';
  char ex = '!';
  int q = F;
  int w = R;
  int e = A;
  int t = N;
  int y = Z;
  int u = ex;
   System.out.println("F-"+q);
   System.out.println("R-"+w);
   System.out.println("A-"+e);
   System.out.println("N-"+t);
   System.out.println("Z-"+y);
   System.out.println("!-"+u);
   System.out.println("FRANZ!");
  int a = q+w+e+t+y+u;
  int s = q*w*e*t*y*u;
  int d = (q+w+e+t+y+u)/5;
  int f = 0%d;
   System.out.println("Sum " + a);
   System.out.println("Product " + s);
   System.out.println("Average " + d);
   System.out.println("Remainder " + f);
   }
}     