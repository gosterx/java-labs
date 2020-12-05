package view;

public class InputDataForTasks {

    OutputService outputService = new OutputService();
    InputService inputService = new InputService();

    public int getInteger() {
        outputService.showMessage("Enter integer: ");
        return Integer.parseInt(inputService.getString());
    }
}
