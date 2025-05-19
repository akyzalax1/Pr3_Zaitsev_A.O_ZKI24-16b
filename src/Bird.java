/**
 * Класс "Птица".
 */
public class Bird extends Animal {

  private int wingspan;

  public Bird() {
    super();
    this.wingspan = 0;
  }

  public Bird(String name, int age, int wingspan) {
    super(name, age);
    this.wingspan = (wingspan >= 10 && wingspan <= 500) ? wingspan : 0;
  }

  @Override
  public String toString() {
    return "Bird{name='" + name + "', age=" + age + ", wingspan=" + wingspan + "}";
  }
}