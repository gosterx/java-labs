package Task2;

import java.util.*;

public class SortCollection {

    public static boolean checkForEqualityOfAllValues(double[] array){
        Set<Double> h= new HashSet<>();
        for(double number:array){
            h.add(number);
        }
        return h.size() != 1;

    }

    public static double sortArray(double[] array){
        double maxNumber= -1000;
         for (double number : array) {
             if (maxNumber < number) {
                 maxNumber = number;
             }
         }
         return maxNumber;
    }
}
