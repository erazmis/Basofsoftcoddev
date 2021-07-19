/**
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить eго по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента. Если первый меньше второго, 
 * то продвигаются на один элемент вперед. В противном случае производится перестановка 
 * и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
 */

import java.lang.Math;
import java.util.Arrays;

public class OneDimensionalArraysSorting_6 {

        public static void main(String[] args) {
                int[] arr = new int[10];
                for (int i = 0; i < arr.length; i++) {
                        arr[i] = (int)(Math.random() * 10);
                }
                System.out.println("Array: " + Arrays.toString(arr));

                for (int i = 1; i < arr.length; i++) {
                        if (arr[i - 1] > arr[i]) {
                                int buffer = arr[i];
                                arr[i] = arr[i - 1];
                                arr[i - 1] = buffer;
                                if (i > 1) {
                                        i -= 2;
                                }
                        }
                }
                System.out.println("Sorted array: " + Arrays.toString(arr));
        }
}


