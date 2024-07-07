package SortingAlgorithm;



class InsertionSort {
    int[] arraySteps;
    int steps = 0;

    public InsertionSort(int[] array) {
        int size = array.length;
        arraySteps = new int[array.length];
        for (int i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;


            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
                steps += 2;
            }


            array[j + 1] = key;
            steps+=3;
            arraySteps[i] = steps;
        }
    }

    public int[] getArraySteps() {
        return arraySteps;
    }
}
