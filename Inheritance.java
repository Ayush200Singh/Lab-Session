package corejava;
// code written by Ayush singh
// Show inheritance
class Parents{
	 void Parent(){   // default constructor
		System.out.println("I am a default constructor");
	}
	 void Sing() {    
		 System.out.println("Ram is singing");
		 
	 }
}
class Child extends Parents{    // use extends keyword to inherit the property of parent class 
	void Speak() {
		System.out.println("RAM want to speak ");
	}
	void Dance() {
		System.out.println("Ram is dancing");
	}
}
public class Lab_test {
	public static void main(String[] args) {
		Child ch = new Child();   // Making the object(ch) of Child class to call the methods of Child class
		    ch.Parent();  
		    ch.Sing();
			ch.Dance();
			ch.Speak();

	}

}
