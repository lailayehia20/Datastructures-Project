package SortingAlgorithm;

public class BubbleSort {
    int steps = 0;
    int[] stepsArray;

    public BubbleSort(int[] arr) {
        steps = 0;
        int[] temp = arr;
        stepsArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp = arr;
            steps = 0;
            Sort(temp, i);
            stepsArray[i] = steps;
        }
    }

    void Sort(int[] arr, int n) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    steps += 3;
                }
                steps++;
            }
            steps++;
        }
    }
    public int[] getArraySteps()
    {
        return stepsArray;
    }
}
