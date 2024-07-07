package SortingAlgorithm;


class QuickSort {
    int steps =0;
    int stepsArray[];
     public QuickSort(int arr[]){
         int temp[]=arr;
         steps=0;
         stepsArray = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            steps=0;
            temp =arr;
            quckSort(temp,0,i );
            stepsArray[i]= steps;
        }
    }


     int partition(int array[], int low, int high) {

       //the pivot is the rightmost element
        int pivot = array[high];
        steps++;


        int i = (low - 1);
        steps++;


        for (int j = low; j < high ; j++) {

            if (array[j] <= pivot) {

                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                steps+=4;
            }

        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        steps+=3;
        return (i + 1);

    }

     void quckSort(int array[], int low, int high) {
        if (low < high) {

            int pi = partition(array, low, high);
            steps++;

            quckSort(array, low, pi - 1);


            quckSort(array, pi + 1, high);

        }
    }
    public int[] getArraySteps()
    {
        return stepsArray;
    }
}

