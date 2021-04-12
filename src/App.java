import java.lang.System.Logger;
import java.util.Scanner;

import models.Bike;
import models.Motorcyclist;
import utils.controls.implementations.AddAmmunitionMenuItem;
import utils.controls.implementations.AddBikeMenuItem;
import utils.controls.implementations.ExitMenuItem;
import utils.controls.implementations.FoundAmmunitionByPriceRangeMenuItem;
import utils.controls.implementations.ReadMotorcyclistFromDBMenuItem;
import utils.controls.implementations.SaveMotorcyclistToDBMenuItem;
import utils.controls.implementations.SortAmmunitionByWeightMenuItem;
import utils.controls.interfaces.MenuItemExecutable;
import utils.db.implementations.FileDatabaseManager;
import utils.db.interfaces.DatabaseManager;

public class App {

  private static DatabaseManager databaseManager = new FileDatabaseManager();

  /**
   * Сама суть
   */
  public static void main(String[] args) throws Exception {
    try {
      Scanner scanner = new Scanner(System.in);

      Motorcyclist motorcyclist = new Motorcyclist("Face");
      // motorcyclist.addBike(new Bike("Harlay Davidson", "650 MT", 2007, 150, 40, 6,
      // 200));

      MenuItemExecutable[] menuItems = { new AddBikeMenuItem(motorcyclist, scanner), new AddAmmunitionMenuItem(),
          new SortAmmunitionByWeightMenuItem(), new FoundAmmunitionByPriceRangeMenuItem(),
          new SaveMotorcyclistToDBMenuItem(motorcyclist, databaseManager),
          new ReadMotorcyclistFromDBMenuItem(databaseManager), new ExitMenuItem() };

      boolean n = false;
      while (n == false) {
        // System.out.println("Список действий: \n" + "1 - Добавить новый байк в
        // гараж\n"
        // + "2 - Добавить элемент экипировки\n" + "2 - Осмотреть экипировку\n"
        // + "3 - Отсортировать экипировку по весу\n" + "4 - Найти экипировку по
        // заданному диапазону цены\n"
        // + "5 - Создать файл .txt с информацией об экипировке\n" + "6 - Загрузить
        // имеющийся файл .txt\n"
        // + "7 - Очистить экипировку\n" + "8 - Выход из программы");
        System.out.println("Список действий:");
        for (int i = 0; i < menuItems.length; i++) {
          System.out.println((i + 1) + " - " + menuItems[i].getDisplayName());
        }

        int choice = scanner.nextInt();

        if (choice > menuItems.length) {
          System.out.println("\nНет такого пункта меню.\n");
        } else {
          menuItems[choice - 1].execute();

          // switch (choice) {
          // case 1:
          // MenuItemExecutable executable = new AddBikeMenuItem(motorcyclist, scanner);
          // executable.execute();
          // break;

          // case 2:
          // // RedWings.countTotalCapacity();
          // // RedWings.countTotalPayload();
          // // logger.log(Level.INFO, "Вывод в консоль");
          // // System.out.println(RedWings);
          // break;

          // case 3:
          // // logger.log(Level.INFO, "Сортировка по заданному пара-метру");
          // // RedWings.sortAirlineFlightRange();
          // // logger.log(Level.INFO, "Вывод в консоль после сорти-ровки");
          // // System.out.println("Список отсортирован по дальности полёта:\n" +
          // RedWings);
          // break;

          // case 4:
          // // System.out.println("От: ");
          // // double from = scanner.nextDouble();
          // // System.out.println("До: ");
          // // double to = scanner.nextDouble();
          // // logger.log(Level.INFO, "Вывод самолётов, у которых по-требление горючего
          // // лежит в заданном диапазоне");
          // // System.out.println("Самолёты по потреблению горючего в заданном диапазоне
          // (от
          // // " + from + " до " + to + ": \n"
          // // + Red - Wings.searchByFuelConsumption(from, to));
          // break;

          // case 5:
          // // logger.log(Level.WARNING, "Возможна ошибка при созда-нии файла");
          // databaseManager.saveMotorcyclist(motorcyclist);
          // break;

          // case 6:
          // // logger.log(Level.WARNING, "Возможна ошибка при загруз-ке файла");
          // databaseManager.describeSavedMotorcyclist();
          // break;

          // case 7:
          // // logger.log(Level.INFO, "Очистить список");
          // // companyArrayList.clear();
          // // System.out.println("Список очищен");
          // break;

          // case 8:
          // n = true;
          // break;

          // default:
          // System.out.println("Вы ввели неверную команду");
          // break;
          // }
        }
      }
    } catch (Exception e) {
      // logger.log(Level.WARNING, "Непредвиденная ошибка", e);
      System.out.println("Непредвиденная ошибка: " + e);
    }
  }

}
