import Task1.Controller.DragonController;
import Task1.Model.DragonModel;
import Task1.View.DragonView;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DragonModel model=new DragonModel();
        DragonView view =new DragonView();
        DragonController controller =new DragonController(model,view);
        controller.apdateView();
        Scanner s=new Scanner(System.in);
        controller.numberYear(s.nextInt());
        controller.apdateView();
    }

}
