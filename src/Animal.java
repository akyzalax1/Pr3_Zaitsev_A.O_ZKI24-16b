/**
 * Базовый класс "Животное".
 */
public class Animal {

  protected String name;
  protected int age;

  public Animal() {
    this.name = "Unknown";
    this.age = 0;
  }

  public Animal(String name, int age) {
    this.name = (name != null && !name.isEmpty()) ? name : "Unknown";
    this.age = (age >= 0 && age <= 200) ? age : 0;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Animal animal = (Animal) obj;
    return age == animal.age && name.equals(animal.name);
  }

  @Override
  public int hashCode() {
    return age * 31 + name.hashCode();
  }

  @Override
  public String toString() {
    return "Animal{name='" + name + "', age=" + age + "}";
  }
}