package map_Collections;

import java.util.TreeMap;

public class TreeMapMethods {

	public static void main(String[] args) {
		TreeMap tree = new TreeMap((o1,o2)->(Integer)o2-(Integer)o1);
		tree.put(1, 52);
		tree.put(2, 6);
		tree.put(3, 89);
		
		System.out.println(tree);
		

	}
}
