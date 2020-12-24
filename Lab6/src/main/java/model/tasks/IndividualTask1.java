package model.tasks;

import model.base.Task;
import view.InputDataForTasks;

import java.util.Arrays;

public class IndividualTask1 implements Task {

    @Override
    public String runTask() {
        InputDataForTasks task1 = new InputDataForTasks();
        return resultOfIndividualTask1(task1.individualTask1(-20, 20));
    }

    @Override
    public String getTaskInfo() {
        return "Individual task 1";
    }

    public int sumOfNegativeElements(int[] array){
        int sum = 0;
        for (int element: array) {
            if (element < 0) sum += element;
        }
        return sum;
    }

    public int getMinElementIndex(int[] array){
        int min = array[0];
        for (int element: array) {
            if (element < min) min = element;
        }

        int minElementIndex = -1;
        for(int i = 0; i < array.length; i++){
            if (array[i] == min) {
                minElementIndex = i;
                break;
            }
        }
        return minElementIndex;
    }

    public int getMaxElementIndex(int[] array){
        int max = array[0];
        for (int element: array) {
            if (element > max) max = element;
        }

        int maxElementIndex = -1;
        for(int i = 0; i < array.length; i++){
            if (array[i] == max) {
                maxElementIndex = i;
                break;
            }
        }
        return maxElementIndex;
    }

    public int mpBetweenMaxAndMinElements(int[] array, int minElementIndex, int maxElementIndex){
        int mp = 1;
        if (minElementIndex < maxElementIndex) {
            for (int i = minElementIndex + 1; i < maxElementIndex; i++) {
                mp *= array[i];
            }
        } else if (minElementIndex > maxElementIndex){
            for (int i = maxElementIndex + 1; i < minElementIndex; i++) {
                mp *= array[i];
            }
        }
        return mp;
    }

    public String resultOfIndividualTask1(int[] array){
        int negativeSum = sumOfNegativeElements(array);
        int mp = mpBetweenMaxAndMinElements(array, getMinElementIndex(array), getMaxElementIndex(array));
        return "Current array: " + Arrays.toString(array) + "\n" +
                "Sum of negative elements is " + negativeSum + "\n" +
                "Product between minimum and maximum elements is " + mp;

    }
}
