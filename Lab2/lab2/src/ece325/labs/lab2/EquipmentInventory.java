package ece325.labs.lab2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Finish class.
 */
public class EquipmentInventory {

  /** The list of all your equipment objects */
  ArrayList<Equipment> inventory;
  /**
   * The number of objects per type of equipment, grouped by the String
   * description of a type
   */
  HashMap<String, Integer> inventoryCount;

  /**
   * Create an EquipmentInventory object by initializing the inventory and
   * inventoryCount objects.
   */
  public EquipmentInventory(ArrayList<Equipment> equipList) {
    inventory = new ArrayList<>();
    inventoryCount = new HashMap<>();
    for (Equipment equipment : equipList) {
      add(equipment);
    }
  }

  /**
   * Add e to the inventory, and if the add is successful, increase the number
   * of that equipment type in your inventoryCount. Make sure that you cannot
   * accidentally add the same object twice.
   * @param e The equipment object to add
   */
  public void add(Equipment e) {
    if (inventory.contains(e)) {
      System.out.println("piece of equipment already exists");
    } else {
      inventory.add(e);
      increaseInventoryCount(e);
    }
  }

  /**
   * Remove e from the inventory and if successful, decrease the number of that
   * equipment type in your inventoryCount.
   * @param e The equipment object to remove
   */
  public void remove(Equipment e) {
    boolean removed = inventory.remove(e);
    if (removed == false) {
      System.out.println("failed to remove Non existent object");
    } else {
      decreaseInventoryCount(e);
    }
  }

  /**
   * Increase the inventoryCount for the type of equipment of e by 1.
   * If it does not exist in the inventoryCount yet, add the type to the
   * inventoryCount. Note: method should be private, but to allow running
   * unit tests on it (and make our lives easier when marking), we made this
   * method protected. The method should never be called outside of the class.
   * @param e The type of equipment for which we want to increase the
   *     inventoryCount
   */
  protected void increaseInventoryCount(Equipment e) {
    int count = getInventoryCount(e);
    if (count > 0) {
      inventoryCount.put(e.type(), count + 1);
    } else {
      inventoryCount.put(e.type(), 1);
    }
  }

  /**
   * Decrease the inventoryCount for the type of equipment of e by 1.
   * If the inventoryCount for type is now 0, remove the type from the
   * inventoryCount. If the inventoryCount does not contain type of
   * equipment, do nothing. Note: method should be private, but to allow
   * running unit tests on it (and make our lives easier when marking), we made
   * method protected. The method should never be called outside of the
   * class.
   * @param e The type of equipment for which we want to decrease the
   *     inventoryCount
   */
  protected void decreaseInventoryCount(Equipment e) {
    int count = getInventoryCount(e);
    if (count > 1) {
      inventoryCount.put(e.type(), count - 1);
    } else {
      inventoryCount.remove(e.type());
    }
  }

  /**
   * Return the number of times type of equipment occurs in the inventory.
   * If it doesn't occur in the inventory, return -1 (to indicate that something
   * went wrong somewhere).
   * @param e
   * @return
   */
  public Integer getInventoryCount(Equipment e) {
    if (inventoryCount.containsKey(e.type())) {
      return inventoryCount.get(e.type());
    }
    return -1;
  }

  /**
   * Return the String representation of the EquipmentInventory.
   * It should look similarly to the following:
   * [EquipmentInventory: Guitar: 3, Stool: 3, Chair: 1, Keyboard: 2]
   * (after adding 3 guitars, 3 stools, 1 chair and 2 keyboards).
   * The order in which the types are printed does not matter.
   * @return the string representation of the EquipmentInventory
   */
  public String toString() {
    List<String> parts = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : inventoryCount.entrySet()) {
        parts.add(entry.getKey() + ": " + entry.getValue());
    }
    String joinedParts = String.join(", ", parts);
    return "[EquipmentInventory: " + joinedParts + "]";
  }

  public static void main(String[] args) {
    ArrayList<Equipment> list = new ArrayList<>();
    System.out.println("Constructing new EquipmentList\n");
    list.add(new Guitar());
    list.add(new Guitar());
    list.add(new Stool());
    list.add(new Stool());
    list.add(new Stool());
    list.add(new Keyboard());
    list.add(new Keyboard());
    Chair tempChair = new Chair();
    Guitar tempGuitar = new Guitar();
    list.add(tempChair);
    EquipmentInventory answer = new EquipmentInventory(list);
    System.out.println(answer.toString());

    System.out.println("\nremoving Tempchair Variable from equiplist");
    answer.remove(tempChair);
    System.out.println(answer.toString());

    System.out.println("\nadding Tempchair Variable from equiplist");
    answer.add(tempChair);
    System.out.println(answer.toString());

    System.out.println("\nadding TempChair again to test duplicate ");
    answer.add(tempChair);
    System.out.println(answer.toString());

    System.out.println("\nRemoving TempChair");
    answer.remove(tempChair);
    System.out.println(answer.toString());

    System.out.println("\nRemoving TempChair again");
    answer.remove(tempChair);
    System.out.println(answer.toString());

    System.out.println("\ntempChair is subclass of: " + tempChair.equipType());
    answer.add(tempGuitar);
    System.out.println(answer.toString());

    System.out.println("\ntempGuitar is subclass of: " +
                       tempGuitar.equipType());
  }
}
