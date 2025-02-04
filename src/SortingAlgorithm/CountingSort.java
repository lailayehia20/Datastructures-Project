package SortingAlgorithm;

class CountingSort {
    int steps = 0;
    int[] stepsArray;

    public CountingSort(int[] arr) {
        steps=0;
        int temp[] = arr;
        stepsArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            steps = 0;
            temp = arr;
            stepsArray[i] = countSort(temp, i);;
        }
    }

    public int countSort(int array[], int size) {
        int[] output = new int[size + 1];


        int max = array[0];
        steps += 2;
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
                steps++;
            }
            steps++;
        }
        int[] count = new int[max + 1];


        for (int i = 0; i < max; ++i) {
            count[i] = 0;
            steps++;
        }

        for (int i = 0; i < size; i++) {
            count[array[i]]++;
            steps++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
            steps++;
        }


        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
            steps += 2;
        }

        for (int i = 0; i < size; i++) {
            array[i] = output[i];
            steps++;
        }
        return steps;
    }

    public int[] getArraySteps() {
        return stepsArray;
    }
}

