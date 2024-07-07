package SortingAlgorithm;

public class nSquared {
    int stepsArray[];

    public nSquared(int[] arr) {
        stepsArray = new int[arr.length];
        for(int i=0; i< arr.length; i++){
            stepsArray[i]= i*i;
        }
    }
    public int[] getArraySteps() {
        return stepsArray;
    }
}
