package model.tasks;

import model.base.Task;
import view.InputDataForTasks;

public class TaskE implements Task {

    @Override
    public String runTask() {
        InputDataForTasks inputDataForTasks = new InputDataForTasks();
        int number = inputDataForTasks.getInteger();
        return number + " element of fibonacci sequence is " + fib(number);
    }

    @Override
    public String getTaskInfo() {
        return "Task E";
    }

    private int fib(int number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fib(number - 1) + fib(number - 2);
    }
}
