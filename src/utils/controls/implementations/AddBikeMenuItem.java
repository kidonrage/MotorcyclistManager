package utils.controls.implementations;

import java.util.Scanner;

import models.Bike;
import models.Motorcyclist;
import utils.controls.interfaces.MenuItemExecutable;

public class AddBikeMenuItem implements MenuItemExecutable {

  Scanner scanner;
  Motorcyclist motorcyclistToUpdate;

  public AddBikeMenuItem(Motorcyclist motorcyclistToUpdate, Scanner scanner) {
    this.motorcyclistToUpdate = motorcyclistToUpdate;
    this.scanner = scanner;
  }

  public void execute() {
    System.out.print("Производитель: ");
    String manufacturerName = scanner.next();
    System.out.print("Модель: ");
    String modelName = scanner.next();
    System.out.print("Год выпуска: ");
    int year = scanner.nextInt();
    System.out.print("Максимальная скорость (км/ч): ");
    float maxSpeed = scanner.nextFloat();
    System.out.print("Мощность (л. с.): ");
    int power = scanner.nextInt();
    System.out.print("Расход топлива (литров на 100 км): ");
    float fuelConsumption = scanner.nextFloat();
    System.out.print("Вес (кг): ");
    float weight = scanner.nextFloat();

    motorcyclistToUpdate.addBike(new Bike(manufacturerName, modelName, year, maxSpeed, power, fuelConsumption, weight));

    System.out.println("\n* Байк добавлен в гараж! *\n");
  }

  public String getDisplayName() {
    return "Добавить новый байк в гараж";
  }

}
