package model.tasks;


import model.base.Task;
import view.InputDataForTasks;

public class MainTask1 implements Task
{
    public String runTask(){

        InputDataForTasks task1 = new InputDataForTasks();
        return resultOfMainTask1(task1.mainTask1());
    }

    public int countOfHeads(int years) {
        final int STARTHEAD = 3, COEFTWOHUNDRED = 3, coefUpTreeHundred = 2;
        final int twoHundredYear = 200, threeHundredYear = 300;
        int head = 0;
        if (years < twoHundredYear && years > 0)
        {
            head = years * COEFTWOHUNDRED + STARTHEAD;
        }
        else if (years >= twoHundredYear && years < threeHundredYear)
        {
            head = twoHundredYear * COEFTWOHUNDRED + (years - twoHundredYear) * coefUpTreeHundred + STARTHEAD;
        }
        else if (years >= threeHundredYear)
        {
            head = twoHundredYear * COEFTWOHUNDRED + (threeHundredYear - twoHundredYear) * coefUpTreeHundred + (years - threeHundredYear) + STARTHEAD;
        }

        return head;
    }

    public int countOfEyes(int heads) {
        return heads * 2;
    }

    public String getTaskInfo() {
        return "Main task №1";
    }

    public String resultOfMainTask1(int years){
        int heads = countOfHeads(years);
        return "Count of heads - " + heads + ", count of eyes - " + countOfEyes(heads);
    }
}
