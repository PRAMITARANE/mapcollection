package map;

import java.util.Map;
import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>tm= new TreeMap();
		tm.put(1, "marathi");
		tm.put(0, null);
		tm.put(2, "english");
		tm.put(3, "hindi");
		
		for(Map.Entry<Integer,String>me:tm.entrySet()) {
			System.out.println("key is:" +me.getKey() + "value is:" +me.getValue());
		}

	}

}
