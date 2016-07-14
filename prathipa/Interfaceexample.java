interface Personality{

   public void Duty();
   public void Aim();
}
public class Interface implements Personality{

	   public void Duty(){
	      System.out.println("Abdul Kalam is a President");
	   }

	   public void Aim(){
	      System.out.println("Abdul Kalam is also a Scientist ");
	   } 

	  
	   public static void main(String args[]){
	      Interface m = new Interface();
	      m.Duty();
	      m.Aim();
	   }
	} /*Abdul Kalam is a President
           Abdul Kalam is also a Scientist*/ 

