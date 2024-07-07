package SortingAlgorithm;

import java.util.Arrays;

class RadixSort {
    int steps = 0;
    int stepsArray[];

    public RadixSort(int arr[]) {
        int temp[] = arr;
        steps=0;
        stepsArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            steps = 0;
            temp = arr;
            radxSort(temp, i);
            stepsArray[i] = steps;
        }
    }


    void countingSort(int array[], int size, int place) {
        int[] output = new int[size];
        int[] count = new int[10];

        Arrays.fill(count, 0);

        for (int i = 0; i < size; i++) {
            count[(array[i] / place) % 10]++;
            steps++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
            steps++;
        }

        for (int i = size - 1; i >= 0; i--) {
            output[count[(array[i] / place) % 10] - 1] = array[i];
            count[(array[i] / place) % 10]--;
            steps += 2;
        }

        for (int i = 0; i < size; i++) {
            array[i] = output[i];
            steps++;
        }
    }

    // Function to get the largest element from an array
    int getMax(int array[], int n) {
        int max = array[0];
        steps++;
        for (int i = 1; i < n; i++)
            if (array[i] > max) {
                max = array[i];
                steps++;
            }
        return max;
    }

    // Main function to implement radix sort
    void radxSort(int array[], int size) {
        // Get maximum element
        int max = getMax(array, size);
        steps++;
        // Apply counting sort to sort elements based on place value.
        for (int place = 1; max / place > 0; place *= 10) {
            countingSort(array, size, place);
            steps++;
        }
    }

    public int[] getArraySteps() {
        return stepsArray;
    }
}


