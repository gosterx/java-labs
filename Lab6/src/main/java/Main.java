import controller.MainController;
import model.base.Task;
import model.tasks.IndividualTask1;
import view.InputService;
import view.OutputService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        OutputService outputService = new OutputService();
        InputService inputService = new InputService();

        ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(new IndividualTask1());

        MainController mainController = new MainController(tasks, outputService, inputService);
        mainController.startMainController();
    }
}
