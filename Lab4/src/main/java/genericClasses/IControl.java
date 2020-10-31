package genericClasses;

import java.util.Scanner;

public class IControl {
    static Scanner  s = new Scanner(System.in);
    public static void fillingTheArray(double[] array){
        for(int i=0;i<array.length;i++){
            array[i]= s.nextDouble();
        }
    }

    public static int NumberInput(){
        return s.nextInt();
    }

}
