package models;

import java.util.ArrayList;
import java.util.List;

public class Motorcyclist {

  String displayName;
  private List<Bike> bikes;
  private List<String> ammunition;

  public Motorcyclist(String displayName) {
    this.displayName = displayName;
    this.bikes = new ArrayList<Bike>();
    this.ammunition = new ArrayList<String>();
  }

  public void addBike(Bike bike) {
    this.bikes.add(bike);
  }

  @Override
  public String toString() {
    String result = "Мотоциклист " + this.displayName + ":";

    // Добавление байков в описание
    result += "\n\nГараж: ";
    if (this.bikes.size() == 0) {
      result += "[Пусто]";
    }
    for (Bike bike : this.bikes) {
      result += "\n – " + bike.toString();
    }

    return result;
  }

}
