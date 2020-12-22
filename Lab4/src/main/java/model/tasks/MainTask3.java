package model.tasks;


import model.base.Task;
import view.InputDataForTasks;

public class MainTask3 implements Task {

    public String runTask(){
        InputDataForTasks task3 = new InputDataForTasks();
        return resultOfMainTask3(task3.mainTask3());
    }

    public boolean isMultiple(int number){
        int[] array = new int[] {2, 3, 5, 7, 11, 13, 17, 19};
        for (int j : array) {
            if (number % j != 0) return false;
        }
        return true;
    }

    public String resultOfMainTask3(int number){
        if (isMultiple(number)) return "true";
        else return "false";
    }

    public String getTaskInfo(){
        return "Main task №3";
    }
}
