package models;

public class Bike {

  /** Производитель */
  private String manufacturerName;
  /** Модель */
  private String modelName;
  /** Год выпуска */
  private int year;
  /** Максимальная скорость (км/ч) */
  private float maxSpeed;
  /** Мощность (л. с.) */
  private int power;
  // Расход топлива (литров на 100 км)
  private float fuelConsumption;
  // Вес (кг)
  private float weight;

  /**
   * Конструктор создает новый мотоцикл модели <code>modelName</code> от
   * производителя <code>manufacturerName</code> года выпуска <code>year</code> с
   * максимальной скоростью <code>maxSpeed</code> км/ч, мощностью
   * <code>power</code> л.с., расходом топлива <code>fuelConsumption</code> литров
   * на 100 км и весом <code>weight</code> кг.
   * 
   * @param manufacturerName Производитель
   * @param modelName        Модель
   * @param year             Год выпуска
   * @param maxSpeed         Максимальная скорость (км/ч)
   * @param power            Мощность (л. с.)
   * @param fuelConsumption  Расход топлива (литров на 100 км)
   * @param weight           Вес (кг)
   */
  public Bike(String manufacturerName, String modelName, int year, float maxSpeed, int power, float fuelConsumption,
      float weight) {
    this.manufacturerName = manufacturerName;
    this.modelName = modelName;
    this.year = year;
    this.maxSpeed = maxSpeed;
    this.power = power;
    this.fuelConsumption = fuelConsumption;
    this.weight = weight;
  }

  /**
   * Возвращает отображаемое имя мотоцикла.
   * 
   * @return отображаемое имя мотоцикла
   */
  public String getDisplayName() {
    return this.manufacturerName + " " + this.modelName;
  }

  /**
   * Возвращает год выпуска.
   * 
   * @return год выпуска
   */
  public int getYear() {
    return this.year;
  }

  /**
   * Возвращает максимальную скорость (км/ч).
   * 
   * @return максимальная скорость (км/ч)
   */
  public float getMaxSpeed() {
    return this.maxSpeed;
  }

  /**
   * Возвращает мощность (в л.с.).
   * 
   * @return мощность (в л.с.)
   */
  public int getPower() {
    return this.power;
  }

  /**
   * Возвращает расход топлива (литров на 100 км).
   * 
   * @return расход топлива (литров на 100 км)
   */
  public float getFuelConsumption() {
    return this.fuelConsumption;
  }

  /**
   * Возвращает вес мотоцикла (в кг).
   * 
   * @return вес мотоцикла (в кг)
   */
  public float getWeight() {
    return this.weight;
  }

  @Override
  public String toString() {
    return "Мотоцикл " + this.getDisplayName() + " " + this.year + " года выпуска с максимальной скоростью "
        + this.maxSpeed + " км/ч, мощностью " + this.power + " л.с., расходом топлива " + this.fuelConsumption
        + " литров на 100 км и весом " + this.weight + " кг.";
  }

}
