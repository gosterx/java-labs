package genericClasses;

import java.util.Random;
import java.util.Scanner;

public class IControl {
    static Scanner  s = new Scanner(System.in);
    static Random r=new Random();

    public static void fillingTheArray(double[] array){
        for(int i=0;i<array.length;i++){
            array[i]= s.nextDouble();
        }
    }

    public static int numberInput(){
        return s.nextInt();
    }

    public static double randomNumber(){
        return r.nextDouble();
    }
}
