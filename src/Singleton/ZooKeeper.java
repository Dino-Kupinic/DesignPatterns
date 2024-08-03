package Singleton;

public class ZooKeeper {
  private static ZooKeeper instance;
  private int animalCount;

  private ZooKeeper() {
    this.animalCount = 0;
  }

  public static synchronized ZooKeeper getInstance() {
    if (instance == null) {
      instance = new ZooKeeper();
    }
    return instance;
  }

  public void addAnimal() {
    this.animalCount++;
    System.out.println("Animal added. Total count: " + animalCount);
  }

  public int getAnimalCount() {
    return animalCount;
  }
}
