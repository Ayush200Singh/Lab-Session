package corejava;
// code written by Ayush singh
// Show inheritance
class Parents{
	 void Parent(){
		System.out.println("I am a default constructor");
	}
	 void Sing() {
		 System.out.println("Ram is singing");
		 
	 }
}
class Child extends Parents{
	void Speak() {
		System.out.println("RAM want to speak ");
	}
	void Dance() {
		System.out.println("Ram is dancing");
	}
}
public class Lab_test {
	public static void main(String[] args) {
		Child ch = new Child();
		    ch.Parent();
		    ch.Sing();
			ch.Dance();
			ch.Speak();

	}

}
