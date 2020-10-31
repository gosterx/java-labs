package Task1.Controller;

import Task1.Model.*;
import Task1.View.*;

public class DragonController {
    private final DragonModel model;
    private final DragonView view;

    public DragonController(DragonModel model,DragonView view){
        this.model=model;
        this.view=view;
    }

    public void updateView(){
        view.printDragonInfo(Integer.toString(model.getNumberOfHeads()),
                Integer.toString(model.getNumberOfEyes()));
    }
    public void numberYear(int year){
        model.setYear(year);
        model.countingTheNumberOfHoals();
    }
}
