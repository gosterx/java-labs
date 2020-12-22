package model.tasks;


import model.base.Task;
import view.InputDataForTasks;

public class IndividualTask2 implements Task {

    public String runTask(){
        InputDataForTasks task5 = new InputDataForTasks();
        return resultOfIndividualTask2(task5.individualTask2());
    }

    public String dayByNumber(int number){
        switch (number){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Error";
        }
    }

    public String resultOfIndividualTask2(int number){
        return dayByNumber(number);
    }

    public String getTaskInfo(){
        return "Individual task №2";
    }

}
