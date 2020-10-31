package Task2;

public class GreaTestMain {
    public static void main(String[] args) {
        PControl.printMsg("\n" +
                "Enter the number of numbers: ");
        int size= IControl.sizeNumberInput();
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
