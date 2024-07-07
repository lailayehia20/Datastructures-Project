package SortingAlgorithm;

public class nlogn {
    int stepsArray[];

    public nlogn(int[] arr) {
        stepsArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            stepsArray[i] = (int) (i * Math.log(i));
        }
    }

    public int[] getArraySteps() {
        return stepsArray;
    }
}
