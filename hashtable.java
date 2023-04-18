package map;

import java.util.Hashtable;
import java.util.Map;

public class hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<Integer,String>ht = new Hashtable<>();
ht.put(1, "pune");
ht.put(2, "banglore");
ht.put(3, "mumbai");
ht.put(4, "odissa");

for(Map.Entry<Integer,String> me:ht.entrySet()) {
	System.out.println("key is: "+me.getKey() + "value is: " +me.getValue());
}
	}

}
