package TaskA;

import genericClasses.IControl;
import genericClasses.PControl;

public class Program {
    public static void main(String[] args) {
        PControl.printMsg("");
        TriangleStudy triangleStudy=new TriangleStudy(IControl.randomNumber(),IControl.randomNumber(),IControl.randomNumber());
        if(triangleStudy.studyOfTheParties()){
            PControl.printMsg("Is a triangle!"+"\nSide one: "+
                    triangleStudy.getOneSide()+ "\nSide two: "+triangleStudy.getTwoSide()
                    +"\nSide three: " + triangleStudy.getThreeSide());
        }
        else{
            PControl.printMsg("Can't be a triangle!"+"Side one: "+
                    triangleStudy.getOneSide()+ "Side two: "+triangleStudy.getTwoSide()
                    +"Side three: " + triangleStudy.getThreeSide());
        }

    }
}
