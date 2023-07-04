// Реализуйте алгоритм сортировки пузырьком числового массива,результат после каждой итерации запишите в лог-файл.

package LESSON2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class DZ2_2 {
    public static void main(String[] args) throws IOException {
        int[] array = { 4, 5, 21, 37, 13, 11, -4 };
        for (int i : array) {
            System.out.printf("%d, ", i);
        }
        listSort(array);
        System.out.printf("\n Отсортированный массив: \n");
        for (int i : array) {
            System.out.printf("%d, ", i);
        }
    }
    public static int[] listSort(int[] arr) {
        File logFile = new File("log.txt");
        try (FileWriter fileWriter = new FileWriter(logFile, true)){
            for (int k = 0; k < arr.length - 1; k++) {
                for (int i = 0; i < arr.length - k - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
                fileWriter.flush();
            }
        }
        catch(IOException ex){
        }
        return arr;  
    }
}

