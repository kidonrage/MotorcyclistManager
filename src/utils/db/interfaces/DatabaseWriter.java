package utils.db.interfaces;

import models.Motorcyclist;

public interface DatabaseWriter {

  /**
   * Сохраняет описание мотоциклиста в БД
   * 
   * @param motorcyclist объект мотоциклиста
   */
  public void saveMotorcyclist(Motorcyclist motorcyclist);

}
