package view;

import java.util.Scanner;

public class InputService {
    Scanner inputScanner = new Scanner(System.in);

    public String getString(){
        return inputScanner.nextLine();
    }
}
