package utils.controls.implementations;

import utils.controls.interfaces.MenuItemExecutable;
import utils.db.interfaces.DatabaseManager;

public class ReadMotorcyclistFromDBMenuItem implements MenuItemExecutable {

  DatabaseManager databaseManager;

  public ReadMotorcyclistFromDBMenuItem(DatabaseManager databaseManager) {
    this.databaseManager = databaseManager;
  }

  public void execute() {
    databaseManager.describeSavedMotorcyclist();
  }

  public String getDisplayName() {
    return "Прочитать информацию о мотоциклисте из имеющегося файла .txt";
  }

}
