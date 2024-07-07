package SortingAlgorithm;

public class k_plus_n {
    int stepsArray[];
    public k_plus_n(int[] arr){
        int max= arr[0];
        for (int j=0; j<arr.length; j++){
            if (arr[j]>max){
                max=arr[j];
            }
        }
        stepsArray = new int[arr.length];
        for(int i=0; i<arr.length;i++){
            stepsArray[i] = max+i;
        }
    }
    public int[] getArraySteps() {
        return stepsArray;
    }
}
