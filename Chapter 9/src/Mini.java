import java.awt.Color;

public class Mini extends Car {
	Color color;
	
	public Mini(){
		this(Color.RED);
	}
	
	public Mini(Color c){
		super("mini");
		color = c;
		// more initialization
	}
	
	public Mini(int size){
		super(size);
	}
}
