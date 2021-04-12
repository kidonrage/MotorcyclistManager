import java.lang.System.Logger;
import java.util.Scanner;

import models.Bike;
import models.Motorcyclist;
import utils.implementations.FileDatabaseManager;
import utils.interfaces.DatabaseManager;

public class App {

  private static DatabaseManager databaseManager = new FileDatabaseManager();

  /**
   * Сама суть
   */
  public static void main(String[] args) throws Exception {
    try {
      Scanner scanner = new Scanner(System.in);

      Motorcyclist motorcyclist = new Motorcyclist("Face");

      motorcyclist.addBike(new Bike("Harlay Davidson", "650 MT", 2007, 150, 40, 6, 200));

      boolean n = false;
      while (n == false) {
        System.out.println("Список действий: \n" + "1 - Добавить элемент экипировки\n" + "2 - Осмотреть экипировку\n"
            + "3 - Отсортировать экипировку по весу\n" + "4 - Найти экипировку по заданному диапазону цены\n"
            + "5 - Создать файл .txt с информацией об экипировке\n" + "6 - Загрузить имеющийся файл .txt\n"
            + "7 - Очистить экипировку\n" + "8 - Выход из программы");

        int choice = scanner.nextInt();
        switch (choice) {
        case 1:
          // String type;
          // logger.log(Level.WARNING, "Возможна ошибка при добав-лении нового самолёта в
          // список");
          // TypePlanes typeP = new TypePlanes();
          // type = typeP.choiseType();
          // System.out.print("Название самолёта: ");
          // String name = scanner.next();
          // System.out.print("Вместимость самолёта: ");
          // int capacity = scanner.nextInt();
          // System.out.print("Грузоподъёмность самолёта: ");
          // double payload = scanner.nextDouble();
          // System.out.print("Дальность полёта: ");
          // double flightRange = scanner.nextDouble();
          // System.out.print("Потребление горючего (тонн/час): ");
          // double fuelOil = scanner.nextDouble();

          // companyArrayList.add(new AirlineCompany(type, name, capacity, payload,
          // flightRange, fuelOil));
          break;

        case 2:
          // RedWings.countTotalCapacity();
          // RedWings.countTotalPayload();
          // logger.log(Level.INFO, "Вывод в консоль");
          // System.out.println(RedWings);
          break;

        case 3:
          // logger.log(Level.INFO, "Сортировка по заданному пара-метру");
          // RedWings.sortAirlineFlightRange();
          // logger.log(Level.INFO, "Вывод в консоль после сорти-ровки");
          // System.out.println("Список отсортирован по дальности полёта:\n" + RedWings);
          break;

        case 4:
          // System.out.println("От: ");
          // double from = scanner.nextDouble();
          // System.out.println("До: ");
          // double to = scanner.nextDouble();
          // logger.log(Level.INFO, "Вывод самолётов, у которых по-требление горючего
          // лежит в заданном диапазоне");
          // System.out.println("Самолёты по потреблению горючего в заданном диапазоне (от
          // " + from + " до " + to + ": \n"
          // + Red - Wings.searchByFuelConsumption(from, to));
          break;

        case 5:
          // logger.log(Level.WARNING, "Возможна ошибка при созда-нии файла");
          databaseManager.saveMotorcyclist(motorcyclist);
          break;

        case 6:
          // logger.log(Level.WARNING, "Возможна ошибка при загруз-ке файла");
          databaseManager.describeSavedMotorcyclist();
          break;

        case 7:
          // logger.log(Level.INFO, "Очистить список");
          // companyArrayList.clear();
          // System.out.println("Список очищен");
          break;

        case 8:
          n = true;
          break;

        default:
          System.out.println("Вы ввели неверную команду");
          break;
        }
      }
    } catch (Exception e) {
      // logger.log(Level.WARNING, "Непредвиденная ошибка", e);
      System.out.println("Непредвиденная ошибка: " + e);
    }
  }

}
