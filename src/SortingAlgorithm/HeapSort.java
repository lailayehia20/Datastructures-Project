package SortingAlgorithm;



public class HeapSort {
    int steps = 0;
    int stepsArray[];

    public HeapSort(int[] arr) {
        int temp[] = arr;
        steps = 0;
        stepsArray = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            steps = 0;
            temp=arr;
            sort(temp,i);
            stepsArray[i] = steps;
        }
    }

    public void sort(int arr[],int n) {

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
            steps++;
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            steps += 3;
            heapify(arr, i, 0);
            steps++;


        }
    }

    void heapify(int arr[], int n, int i) {

        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        steps += 3;
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
            steps++;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
            steps++;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
            steps += 3;
        }
    }

    public int[] getArraySteps() {
        return stepsArray;
    }
}
