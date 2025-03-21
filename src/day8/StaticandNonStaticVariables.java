/*
Static Variables- variables declared with the name static inside the class is called static variables.
                - one copy.
                - memory for static variables is alloacated in class static area.
                - accessed with the help of class name.
                - can be accessed in both static and non-static methods/context.
                - can be accessed within the same class without the help of className in both the contexts.
                - can be accessed within the same class with the help of className in both the contexts.
                - a static variable is preferred when a common data has to shared among objects.

                
Non-static variables- variables directly declared within the class without prefixing with static modifier. 
                    - a copy of all non-static variables will be present in every object you create. 
                    - memory for non-static variables is alloacated inside object in heap area.  
                    - accessed with the help of object reference.
                    - can be accessed oonly inside non-static context/methods.
                    - can be accessed directly inside the class without the help of object reference inside a non-static context only.
                    If it has to be accessed inside a static context, then it is done with the help of object reference.
                    - non-static variables of one class can be accessed in another class with the help of object refernce in both contexts. 
                    - a non-static variable is prefered when the object requires independent copy of variables to store different data.          
 */

package day8;

public class StaticandNonStaticVariables {

	int id = 1;
	static String name = "Raj";

	public StaticandNonStaticVariables() {

		// non-static context

		System.out.println(name);
		System.out.println(id);
	}

	public static void main(String[] args) { // static context
		System.out.println(name);
//		System.out.println(id); throwing an error
		
		//resolving the error now- by creating the object refernce we xan access the non-static  varaible
		
		StaticandNonStaticVariables obj=new StaticandNonStaticVariables();
		System.out.println(obj.id);
		
	}

}
