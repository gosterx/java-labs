package controller;


import model.base.Task;
import view.InputService;
import view.OutputService;

import java.util.ArrayList;

public class MainController {
    ArrayList<Task> tasks;
    OutputService outputService;
    InputService inputService;

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public MainController(ArrayList<Task> tasks, OutputService outputService, InputService inputService) {
        this.tasks = tasks;
        this.outputService = outputService;
        this.inputService = inputService;
    }

    public void startMainController() {
        while (true) {
            showTasksMenu();
            outputService.showMessage("0 - Exit");
            outputService.showMessage("Choose the number: ");
            int taskNumber = Integer.parseInt(inputService.getString());
            if (taskNumber == 0) break;
            Task currentTask = getTaskByNumber(taskNumber - 1);
            String result = currentTask.runTask();
            outputService.showMessage(result);
        }
    }

    public Task getTaskByNumber(int taskNumber) {
        return tasks.get(taskNumber);
    }

    public void showTasksMenu() {
        int i = 1;
        for (Task task : tasks) {
            showTaskInfo(task, i);
            i++;
        }
    }

    public void showTaskInfo(Task task, int number) {
        outputService.showMessage(number + ") " + task.getTaskInfo());
    }

}
