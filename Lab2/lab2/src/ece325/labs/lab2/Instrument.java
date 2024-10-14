package ece325.labs.lab2;

import java.util.List;
import java.util.ArrayList;
/** 
 * Finish this class.
 */
public class Instrument extends Equipment{
	public Instrument(String arg) {
		super(createList(arg));
	}
    private static List<String> createList(String arg) {
        List<String> types = new ArrayList<>();
        types.add(arg);
        types.add("Instrument");
        return types;
    }
	
}
