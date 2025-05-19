/**
 * Класс "Парнокопытное".
 */
public class Hoofed extends Mammal {

  private String hoofType;

  public Hoofed() {
    super();
    this.hoofType = "unknown";
  }

  public Hoofed(String name, int age, int weight, String hoofType) {
    super(name, age, weight);
    this.hoofType = (hoofType != null && !hoofType.isEmpty()) ? hoofType : "unknown";
  }

  @Override
  public String toString() {
    return "Hoofed{name='" + name + "', age=" + age + ", weight=" + weight + ", hoofType='"
        + hoofType + "'}";
  }
}