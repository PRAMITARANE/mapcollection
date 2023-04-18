package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class mapcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap <Integer,String> lhm = new LinkedHashMap<>();
lhm.put(1, "P");
lhm.put(2, "r");
lhm.put(3, "a");
lhm.put(4, "m");
lhm.put(5, "i");
lhm.put(6, "t");
lhm.put(7, "a");
lhm.put(0, null);

for (Map.Entry <Integer,String> me:lhm. entrySet()) {
	System.out.println("key is:" +me.getKey() + "value is :" +me.getValue());
}


	}

}
