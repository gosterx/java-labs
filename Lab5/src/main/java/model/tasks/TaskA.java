package model.tasks;

import model.base.Task;
import view.InputDataForTasks;


public class TaskA implements Task {

    @Override
    public String runTask() {
        InputDataForTasks inputDataForTasks = new InputDataForTasks();
        int number = inputDataForTasks.getInteger();
        return getResultOfTask(getEvenNumbersAmount(number));
    }

    @Override
    public String getTaskInfo() {
        return "Task A";
    }

    public int getEvenNumbersAmount(int number) {
        int evenAmount = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                evenAmount++;
            }
            number /= 10;
        }

        return evenAmount;
    }

    private String getResultOfTask(int evenAmount) {
        return "Amount of even digits: " + evenAmount;
    }
}
