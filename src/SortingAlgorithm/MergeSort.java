package SortingAlgorithm;



class MergeSort {
        int steps = 0;
        int[] stepsArray;

        public MergeSort(int[] arr)  {
            steps = 0;
            int[] temp = arr;
            stepsArray = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                temp=arr;
                steps = 0;
                sort(temp, 0, i);
                stepsArray[i] = steps;
            }
        }

        void merge(int[] arr, int p, int q, int r) {
            int n1 = q - p + 1;
            int n2 = r - q;

            int[] L = new int[n1];
            int[] R = new int[n2];
            steps += 4;

            for (int i = 0; i < n1; ++i) {
                L[i] = arr[p + i];
                steps++;
            }
            for (int j = 0; j < n2; ++j) {
                R[j] = arr[q + 1 + j];
                steps++;
            }

            int i = 0, j = 0;

            int k = p;
            steps += 2;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                    steps += 2;
                } else {
                    arr[k] = R[j];
                    j++;
                    steps += 2;
                }
                k++;
                steps++;
            }

            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
                steps++;
            }

            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
                steps += 3;
            }
        }

        void sort(int[] arr, int l, int r) {
            if (l < r) {
                int m = l + (r - l) / 2;

                sort(arr, l, m);
                sort(arr, m + 1, r);

                merge(arr, l, m, r);
                steps++;

            }
        }

    public int[] getArraySteps()
    {
            return stepsArray;
        }


    }

