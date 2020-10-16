class ProgramOne{
    private double weightGram;

    ProgramOne(double weight){
        this.weightGram = weight;
    }
    public double getWeightGram() {
        return weightGram;
    }
    public void setWeightGram(double weight_gram) {
        this.weightGram = weight_gram;
    }
    public double weight(){
        return this.weightGram /1000;
    }
}