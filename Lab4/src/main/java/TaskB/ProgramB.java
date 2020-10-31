package TaskB;

import genericClasses.IControl;
import genericClasses.PControl;

public class ProgramB {
    public static void main(String[] args) {
        PControl.printMsg("Insert the number: ");
        int number = IControl.numberInput();
        switch (number) {
            case 1 -> PControl.printMsg("Monday");
            case 2 -> PControl.printMsg("Thursday");
            case 3 -> PControl.printMsg("Wednesday");
            case 4 -> PControl.printMsg("Thursday");
            case 5 -> PControl.printMsg("Friday");
            case 6 -> PControl.printMsg("Saturday");
            case 7 -> PControl.printMsg("Sunday");
            default -> PControl.printMsg("The number is not in the range 1-7");
        }
    }
}
