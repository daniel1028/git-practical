class Friends{

   public void move(){
      System.out.println("Prathipa and  Revathy are Friends ");
   }
}

class Overrloading extends Friends{

   public void move(){
      System.out.println("Prathipa and Revathy are working in Bambeeq");
   }
}

public class Overloading{

   public static void main(String args[]){
      Friends a = new Friends(); 
      Friends b = new Friends(); 
      b.move();
   }
}