package SortingAlgorithm;

public class dk_plus_dn {
    int stepsArray[];
    public dk_plus_dn(int arr[]){
        stepsArray = new int[arr.length];
        int d=0;
        int max = arr[0];
        for (int j=0; j<arr.length; j++){
            if (arr[j]>max){
                max=arr[j];
            }
        }
        d = String.valueOf(max).length();
        for(int j=0; j< arr.length;j++){
            stepsArray[j]=d*j*max;
        }
    }
    public int[] getArraySteps() {
        return stepsArray;
    }
}
