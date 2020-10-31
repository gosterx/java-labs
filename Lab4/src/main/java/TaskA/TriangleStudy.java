package TaskA;

public class TriangleStudy {
    private  double oneSide;
    private  double twoSide;
    private  double threeSide;

    TriangleStudy(double oneSide,double twoSide,double threeSide){
        this.oneSide=oneSide;
        this.threeSide=twoSide;
        this.twoSide=threeSide;
    }

    public boolean studyOfTheParties(){
        return this.oneSide+this.twoSide>this.threeSide ||
            this.oneSide+this.threeSide>this.twoSide ||
            this.twoSide+this.threeSide>this.oneSide;

    }

    public double getThreeSide() {
        return threeSide;
    }

    public void setThreeSide(double threeSide) {
        this.threeSide = threeSide;
    }

    public void setOneSide(double oneSide) {
        this.oneSide = oneSide;
    }

    public double getOneSide() {
        return oneSide;
    }

    public double getTwoSide() {
        return twoSide;
    }

    public void setTwoSide(double twoSide) {
        this.twoSide = twoSide;
    }

}
