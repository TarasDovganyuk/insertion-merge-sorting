import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortTest {

    @Test
    void intMergeSort() {
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        int[] actual = {3, 7, 1, 5, 2, 6, 4};

        MergeSort.intMergeSort(actual);

        assertArrayEquals(expected, actual, "Array is not sorted as expected");
    }
}