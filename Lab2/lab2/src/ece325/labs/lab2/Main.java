import ece325.labs.lab2.Chair;
import ece325.labs.lab2.Equipment;
import ece325.labs.lab2.EquipmentInventory;
import ece325.labs.lab2.Guitar;
import ece325.labs.lab2.Keyboard;
import ece325.labs.lab2.Stool;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Equipment> list = new ArrayList<>();
    System.out.println("Constructing new EquipmentList\n");
    list.add(new Guitar());
    list.add(new Guitar());
    list.add(new Guitar());
    list.add(new Keyboard());
    list.add(new Keyboard());
    list.add(new Stool());
    list.add(new Stool());
    list.add(new Stool());
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

    // EquipmentInventory.main(new String[] {});
  }
}
