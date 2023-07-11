import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Java2Homework {

    public static void main(String[] args) {

        // I)Напишите метод, который определит тип (расширение) файлов из текущей папки
        // и
        // выведет в консоль результат вида
        // 1 Расширение файла: txt
        // 2 Расширение файла: pdf
        // 3 Расширение файла:
        // 4 Расширение файла: jpg

        // currentExtetions();

        // II) Реализуйте алгоритм сортировки пузырьком числового массива, результат
        // после
        // каждой итерации запишите в лог-файл.

        int[] array = new int[] { 2, 4, 5, 8, 4, 2, 12, 9, 1 };
        bubbleSort(array);
    }

    // 1
    static void currentExtetions() {
        File folder = new File(".");
        File[] files = folder.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    String fileName = files[i].getName();
                    int dotIndex = fileName.lastIndexOf(".");
                    if (dotIndex > 0) {
                        String extension = fileName.substring(dotIndex + 1);
                        System.out.println((i) + " Расширение файла: " + extension);
                    } else {
                        System.out.println((i + 1) + " Расширение файла: ");
                    }
                }
            }
        }
    }

    // 2
    static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    writeLogFile(array);
                }
            }
        }
    }

    static void writeLogFile(int[] array) {
        try {
            FileWriter writer = new FileWriter("log.txt", true);
            for (int i = 0; i < array.length; i++) {
                writer.write(array[i] + " ");
            }
            writer.write("\n");
            writer.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
