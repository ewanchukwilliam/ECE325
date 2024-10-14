package ece325.labs.lab2;

import java.util.List;
import java.util.ArrayList;
/** 
 * Finish this class.
 */
public class Furniture extends Equipment{
	public Furniture(String arg) {
		super(createList(arg));
	}
    private static List<String> createList(String arg) {
        List<String> types = new ArrayList<>();
        types.add(arg);
        types.add("Furniture");
        return types;
    }
	
}
