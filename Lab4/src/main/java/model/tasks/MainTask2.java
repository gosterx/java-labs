package model.tasks;


import model.base.Task;
import view.InputDataForTasks;

public class MainTask2 implements Task {

    public String runTask(){
        InputDataForTasks task2 = new InputDataForTasks();
        return resultOfMainTask2(task2.mainTask2());
    }

    public String getTaskInfo(){
        return "Main task №2";
    }

    public int findMaxNumber(int[] array){
        int maxNumber = array[0];
        for (int number: array) {
            if (number > maxNumber) maxNumber = number;
        }
        return maxNumber;
    }

    public String resultOfMainTask2(int[] array){
        int maxNumber = findMaxNumber(array);
        return "Max number is " + maxNumber;
    }

}
