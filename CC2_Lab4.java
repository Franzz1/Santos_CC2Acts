public class CC2_Lab4{
  public static void main (String[]args){
    String name = "Ra";
    int age = 13 ;
      if (name=="Jhim"|| name=="Ethan"){
        if (age > 4 && age < 11){
          System.out.println("Hamster,Dog");
        }else if (age > 10 && age < 16){
          System.out.println("Spider,Dog");
        }else if (age > 15 && age < 21){
          System.out.println("Dog,Snake");
        }else if (age == 21){
          System.out.println("No Pets, Not Interested");
        }
      } else if (name=="Sally"|| name=="Joy"){
        if (age > 4 && age < 11){
          System.out.println("Hamster,Cat");
        }else if (age > 10 && age < 16){
          System.out.println("Cat,Rabbit");
        }else if (age > 15 && age < 21){
          System.out.println("Cat");
        }else if (age > 21){
          System.out.println("No Pets, Not Interested");
        }
     } else {
     System.out.println("Error");
     }
       
    }
}    
