package Task2;

import genericClasses.IControl;
import genericClasses.PControl;

public class GreaTestMain {
    public static void main(String[] args) {
        PControl.printMsg("\n" +
                "Enter the number of numbers: ");
        int size= IControl.NumberInput();
        double[] array =new double[size];
        PControl.printMsg("Enter numbers:\n");
        IControl.fillingTheArray(array);

        if(SortCollection.checkForEqualityOfAllValues(array)){
            PControl.printMsg("Greatest value: "+ SortCollection.sortArray(array));
        }
        else{
            PControl.printMsg("Value are equal!");
        }
    }
}
