package utils.db.implementations;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;

import models.Motorcyclist;
import utils.db.interfaces.DatabaseManager;

public class FileDatabaseManager implements DatabaseManager {

  String fileName = "motorcyclist.txt";
  String filePath = System.getProperty("user.dir") + "/src/" + fileName;

  public void describeSavedMotorcyclist() {
    new Thread(() -> {
      try {
        FileReader newReadFile = new FileReader(filePath);
        Scanner scanner = new Scanner(newReadFile);
        while (scanner.hasNextLine()) {
          System.out.println(scanner.nextLine());
        }
        scanner.close();
        newReadFile.close();
      } catch (Exception e) {
        System.out.println("Что то пошло не так при чтении мотоциклиста из файла.");
      }
    }).start();
  }

  public void saveMotorcyclist(Motorcyclist motorcyclist) {
    new Thread(() -> {
      try {

        FileWriter fw = new FileWriter(filePath);

        fw.write(motorcyclist.toString());
        fw.close();

        System.out.println("\nФайл " + fileName + " создан.");
      } catch (Exception e) {
        System.out.println("Не удалость создать файл с описанием мотоциклиста.");
      }
    }).start();
  }

}
