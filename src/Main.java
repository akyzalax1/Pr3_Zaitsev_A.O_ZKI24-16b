import java.util.ArrayList;
import java.util.Scanner;

/**
 * Главное приложение с меню пользователя.
 */
public class Main {

  public static void main(String[] args) {
    ArrayList<Animal> animals = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int choice;

    do {
      System.out.println("\nМеню:");
      System.out.println("1. Добавить новый элемент");
      System.out.println("2. Удалить элемент по индексу");
      System.out.println("3. Вывод всех элементов");
      System.out.println("4. Сравнение двух элементов");
      System.out.println("5. Завершить");

      choice = readInt(scanner, "Ваш выбор: ", 1, 5);

      switch (choice) {
        case 1:
          addAnimal(scanner, animals);
          break;
        case 2:
          int index = readInt(scanner, "Введите индекс: ", 0, animals.size() - 1);
          animals.remove(index);
          System.out.println("Элемент удален.");
          break;
        case 3:
          for (int i = 0; i < animals.size(); i++) {
            System.out.println(i + ": " + animals.get(i));
          }
          break;
        case 4:
          int i1 = readInt(scanner, "Индекс первого элемента: ", 0, animals.size() - 1);
          int i2 = readInt(scanner, "Индекс второго элемента: ", 0, animals.size() - 1);
          boolean equal = animals.get(i1).equals(animals.get(i2));
          System.out.println("Равны? " + (equal ? "Да" : "Нет"));
          break;
        case 5:
          System.out.println("Выход.");
          break;
      }
    } while (choice != 5);
  }

  private static int readInt(Scanner scanner, String prompt, int min, int max) {
    int value;
    do {
      System.out.print(prompt);
      while (!scanner.hasNextInt()) {
        System.out.print("Введите число: ");
        scanner.next();
      }
      value = scanner.nextInt();
    } while (value < min || value > max);
    return value;
  }

  private static void addAnimal(Scanner scanner, ArrayList<Animal> animals) {
    System.out.println("Тип животного:\n1. Животное\n2. Млекопитающее\n3. Парнокопытное\n4. Птица");
    int type = readInt(scanner, "Выбор: ", 1, 4);

    scanner.nextLine(); // очистка буфера
    System.out.print("Имя: ");
    String name = scanner.nextLine();
    int age = readInt(scanner, "Возраст (0-200): ", 0, 200);

    switch (type) {
      case 1:
        animals.add(new Animal(name, age));
        break;
      case 2:
        int weight = readInt(scanner, "Вес (1-10000): ", 1, 10000);
        animals.add(new Mammal(name, age, weight));
        break;
      case 3:
        weight = readInt(scanner, "Вес (1-10000): ", 1, 10000);
        System.out.print("Тип копыт: ");
        String hoofType = scanner.nextLine();
        animals.add(new Hoofed(name, age, weight, hoofType));
        break;
      case 4:
        int wingspan = readInt(scanner, "Размах крыльев (10-500): ", 10, 500);
        animals.add(new Bird(name, age, wingspan));
        break;
    }

    System.out.println("Элемент добавлен.");
  }
}