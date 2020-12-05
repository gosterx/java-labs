package model.tasks;

import model.base.Task;
import view.InputDataForTasks;

public class TaskB implements Task {

    @Override
    public String runTask() {
        InputDataForTasks inputDataForTasks = new InputDataForTasks();
        int number = inputDataForTasks.getInteger();
        if (hasEven(number)) {
            return number + " has even digit";
        } else {
            return number + " hasn't even digit";
        }
    }

    @Override
    public String getTaskInfo() {
        return "Task B";
    }

    private boolean hasEven(int number) {
        while (number > 0) {
            if (number % 2 == 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
