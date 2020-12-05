import controllers.MainController;
import model.base.Task;
import model.tasks.*;
import view.InputService;
import view.OutputService;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        OutputService outputService = new OutputService();
        InputService inputService = new InputService();

        ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(new TaskA());
        tasks.add(new TaskB());
        tasks.add(new TaskC());
        tasks.add(new TaskD());
        tasks.add(new TaskE());

        MainController mainController = new MainController(tasks, outputService, inputService);
        mainController.startMainController();
    }
}
