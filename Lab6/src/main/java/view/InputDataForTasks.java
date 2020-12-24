package view;

import java.util.Random;

public class InputDataForTasks {
    OutputService outputService = new OutputService();
    InputService inputService = new InputService();

    public int[] individualTask1(int min, int max){
        outputService.showMessage("Enter the size of array: ");
        int size = Integer.parseInt(inputService.getString());
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++){
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

}
