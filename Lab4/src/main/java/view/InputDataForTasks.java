package view;

public class InputDataForTasks
{
    OutputService outputService = new OutputService();
    InputService inputService = new InputService();

    public int mainTask1(){
        outputService.showMessage("Enter the dragon's age: ");
        return Integer.parseInt(inputService.getString());
    }

    public int[] mainTask2(){
        outputService.showMessage("Enter the array's length: ");
        int size = Integer.parseInt(inputService.getString());
        int[] array = new int[size];
        outputService.showMessage("Enter the numbers: ");
        for (int i = 0; i < size; i ++){
            array[i] = Integer.parseInt(inputService.getString());
        }
        return array;
    }

    public int mainTask3(){
        outputService.showMessage("Enter the number: ");
        return Integer.parseInt(inputService.getString());
    }

    public int[] individualTask1(){
        int[] array = new int[3];
        outputService.showMessage("Enter the sides of triangle: ");
        for (int i = 0; i < 3; i ++){
            array[i] = Integer.parseInt(inputService.getString());
        }
        return array;
    }

    public int individualTask2(){
        outputService.showMessage("Enter the number of day: ");
        return Integer.parseInt(inputService.getString());
    }

}
