package model.tasks;


import model.base.Task;
import view.InputDataForTasks;

public class IndividualTask1 implements Task {

    public String runTask(){
        InputDataForTasks task4 = new InputDataForTasks();
        return resultOfIndividualTask1(task4.individualTask1());
    }

    public boolean isTriangle(int[] array){
        int a = array[0];
        int b = array[1];
        int c = array[2];

        return a + b > c && a + c > b && b + c > a;
    }

    public String resultOfIndividualTask1(int[] array){
        if (isTriangle(array)) return "true";
        else return "false";
    }

    public String getTaskInfo(){
        return "Individual task №1";
    }

}
