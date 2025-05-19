/**
 * Производный класс "Млекопитающее".
 */
public class Mammal extends Animal {

  protected int weight;

  public Mammal() {
    super();
    this.weight = 0;
  }

  public Mammal(String name, int age, int weight) {
    super(name, age);
    this.weight = (weight > 0 && weight <= 10000) ? weight : 0;
  }

  @Override
  public String toString() {
    return "Mammal{name='" + name + "', age=" + age + ", weight=" + weight + "}";
  }
}