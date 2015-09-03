import java.util.*;
public class V3Radiator extends V2Radiator {
	V3Radiator(ArrayList lgList){
		super(lgList);
		for(int g = 0; g < 10; g++){
			lgList.add(new SimUnit("V3Radiator"));
		}
	}
}
