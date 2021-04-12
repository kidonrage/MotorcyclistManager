package utils.controls.implementations;

import models.Motorcyclist;
import utils.controls.interfaces.MenuItemExecutable;
import utils.db.interfaces.DatabaseManager;

public class SaveMotorcyclistToDBMenuItem implements MenuItemExecutable {

  DatabaseManager databaseManager;
  Motorcyclist motorcyclist;

  public SaveMotorcyclistToDBMenuItem(Motorcyclist motorcyclist, DatabaseManager databaseManager) {
    this.databaseManager = databaseManager;
    this.motorcyclist = motorcyclist;
  }

  public void execute() {
    databaseManager.saveMotorcyclist(motorcyclist);
  }

  public String getDisplayName() {
    return "Создать файл .txt с информацией о мотоциклисте";
  }

}
