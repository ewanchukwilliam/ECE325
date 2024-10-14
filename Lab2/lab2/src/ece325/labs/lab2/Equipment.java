package ece325.labs.lab2;

import java.util.List;
import java.util.ArrayList;
/**
 * Finish this class.
 */
public class Equipment {
  private String objectType = "";
  private String equipmentType = "";

  public Equipment(List<String> characteristics) {
		this.objectType = characteristics.get(0);
		this.equipmentType = characteristics.get(1);
	}
	public String type() {
		return this.objectType;
	}
	public String equipType() {
		return this.equipmentType;
	}
}
