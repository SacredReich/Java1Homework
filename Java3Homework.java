import java.util.ArrayList;
import java.util.List;

public class Java3Homework {
    public static void main(String[] args) {
        // numberWorks();

        List<String> listPlanet = List.of("Mercury", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus",
                "Jupiter",
                "Earth",
                "Neptune");
        onlyUnique(listPlanet);
    }

    static void numberWorks() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++)
            numbers.add(i);

        System.out.print("Список целых чисел" + " ");
        for (int number : numbers)
            System.out.print(number + " ");

        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }
        System.out.print("\nСписок без четных чисел" + " ");
        for (int number : numbers)
            System.out.print(number + " ");

        int min = numbers.get(0);
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        int max = numbers.get(0);
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.size();

        System.out.println();
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }

    static void onlyUnique(List<String> list) {
        List<String> uniqueList = new ArrayList<>();
        for (String item : list) {
            boolean isDuplicate = false;
            for (String unique : uniqueList) {
                if (item.equals(unique)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueList.add(item);
            }
        }
        System.out.println("Начальные данные: " + list);
        System.out.println("Уникальные данные : " + uniqueList);
    }

}
