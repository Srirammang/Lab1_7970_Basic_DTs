
public class TypeCasting {

	public static void main(String[] args) {
	
		        // Implicit Type Casting 
		        int I = 9;
		        long longValue = I; 

		        System.out.println("Implicit Casting (Widening):");
		        System.out.println("Int Value: " + I);
		        System.out.println("Long Value: " + longValue);

		        // Explicit Type Casting 
		        double D = 123.45;
		        int inti = (int) D;

		        System.out.println("\nExplicit Casting (Narrowing):");
		        System.out.println("Double Value: " + D);
		        System.out.println("Int Value: " + inti);
		    }
		


	}


