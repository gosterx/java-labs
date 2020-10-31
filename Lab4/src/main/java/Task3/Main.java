package Task3;

import genericClasses.IControl;
import genericClasses.PControl;

public class Main {
    public static void main(String[] args) {
        PControl.printMsg("Enter 2 numbers: ");
        if(WorkWithNumber.ParityStudy(IControl.numberInput(),IControl.numberInput()))
        {
            PControl.printMsg("The number is a multiple of the sequence!");
        }
        else{
            PControl.printMsg("The number is not a multiple!");
        }
    }
}
