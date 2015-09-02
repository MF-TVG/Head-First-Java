
public class MyAnimalList {
	private Animal[] animals = new Animal[5];
	private int nextIndex = 0;
	
	public void add(Animal a){
		if(nextIndex < animals.length){
			animals[nextIndex] = a;
			System.out.println("Animal added at " + nextIndex);
			nextIndex++;
		}
	}

	public void add(Dog a) {
		// TODO Auto-generated method stub
		
	}

	public void add(Cat c) {
		// TODO Auto-generated method stub
		
	}
}
