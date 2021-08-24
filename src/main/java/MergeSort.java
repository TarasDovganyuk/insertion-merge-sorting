public class MergeSort {
    public static void intMergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }

        int arrLength = array.length;
        int midIndex = array.length / 2;
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[arrLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftArray[i] = array[i];
        }

        for (int i = midIndex; i < arrLength; i++) {
            rightArray[i - midIndex] = array[i];
        }

        intMergeSort(leftArray);
        intMergeSort(rightArray);

        merge(array, leftArray, rightArray);

    }

    private static void merge(int[] inputArray, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                inputArray[k] = leftArray[i];
                i++;
            } else {
                inputArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArray.length) {
            inputArray[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArray.length) {
            inputArray[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
