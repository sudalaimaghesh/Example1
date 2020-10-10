
class AutoBoxing
{
	public static void main(String args[])
    { 
        Integer i = 10; 
  
        int i1 = i;    // unboxing the Object 

	System.out.println("\n");
  	System.out.println("***Unboxing***");
        System.out.println("Wrapper class: " + i); 
        System.out.println("Primitive type: " + i1); 
  
        float f = 12.42f;  //Autoboxing of char 
        Float f1 = f; 	     // Auto-unboxing of float
 
	System.out.println("\n");
	System.out.println("***Auto-Boxing***");
        System.out.println("Primitive type: " + f); 
        System.out.println("Wrapper class: " + f1); 
  

	}
}
//hello
	