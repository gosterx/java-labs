package Task1.Model;

public class DragonModel {
    private int numberOfHeads;
    private int numberOfEyes;
    private int year;
    private static  final int TWO_HUNDRED=200;
    private static final int THREE_HUNDRED=300;

    {
        numberOfHeads=3;
        numberOfEyes=6;
    }

    public void countingTheNumberOfHoals(){
        int byffYear=0;
        while(byffYear!=this.year){
            if(byffYear<TWO_HUNDRED){
                this.numberOfHeads+=3;
                this.numberOfEyes+=6;
            }
            else if(byffYear<THREE_HUNDRED) {
                this.numberOfHeads+=2;
                this.numberOfEyes+=4;
            }
            else {
                this.numberOfHeads+=1;
                this.numberOfEyes+=2;
            }
            byffYear++;
        }
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public void setNumberOfHeads(int numberOfHeads) {
        this.numberOfHeads = numberOfHeads;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public int getNumberOfHeads() {
        return numberOfHeads;
    }

    public int getYear() { return year; }

    public void setYear(int year) { this.year = year; }
}
