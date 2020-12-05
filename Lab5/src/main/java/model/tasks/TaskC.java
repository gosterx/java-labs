package model.tasks;

import model.base.Task;
import view.InputDataForTasks;


public class TaskC implements Task {

    @Override
    public String runTask() {
        InputDataForTasks inputDataForTasks = new InputDataForTasks();
        int number = inputDataForTasks.getInteger();
        if (isPalindrome(number)) {
            return number + " is palindrome";
        } else {
            return number + " isn't palindrome";
        }
    }

    @Override
    public String getTaskInfo() {
        return "Task C";
    }

    private boolean isPalindrome(int number) {
        int reversedNumber = 0, remainder, originalNumber = number;

        while (number > 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
