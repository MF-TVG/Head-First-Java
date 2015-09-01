
public class Dog {
	int size;
	String name;
	
	void bark(){
		if(size > 60){
			System.out.println("WOOOF! WOOOF!");
		}
		else if(size > 14){
			System.out.println("Ruff! Ruff!");
		}
		else{
			System.out.println("yip! yip!");
		}
	}
}
