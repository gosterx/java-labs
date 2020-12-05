package model.tasks;

import model.base.Task;
import view.InputDataForTasks;

public class TaskD implements Task {

    @Override
    public String runTask() {
        InputDataForTasks inputDataForTasks = new InputDataForTasks();
        int number = inputDataForTasks.getInteger();
        return "Max digit of " + number + " is " + getMaxDigit(number);
    }

    @Override
    public String getTaskInfo() {
        return "Task D";
    }

    private int getMaxDigit(int number) {
        int max = number % 10;
        number /= 10;
        while (number > 0) {
            if (number % 10 > max) {
                max = number % 10;
            }
            number /= 10;
        }
        return max;
    }
}
