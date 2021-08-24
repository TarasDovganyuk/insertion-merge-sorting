import java.util.Comparator;

public class InsertionSort {

    public static <T> void objectsInsertionSort(T[] array, Comparator<T> comparator) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must not null and contain at least 2 elements");
        }
        for (int i = 1; i < array.length; i++) {
            T curr = array[i];
            int j = i - 1;
            while (j >= 0 && comparator.compare(curr, array[j]) < 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = curr;
        }
    }

    public static void intInsertionSort(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must not null and contain at least 2 elements");
        }

        for(int i = 1; i < array.length; i++) {
            int curr = array[i];
            int j = i - 1;

            while(j >= 0 && curr < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = curr;
        }
    }
}
