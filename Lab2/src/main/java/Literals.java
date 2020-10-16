class Literals {
    private int variableOne;
    private int variableTwo;

    Literals(int variableOne, int variableTwo) {
        this.variableOne = variableOne;
        this.variableTwo = variableTwo;
    }

    public void setVariableOne(int variableOne) {
        this.variableOne = variableOne;
    }

    public int getVariableOne() {
        return this.variableOne;
    }

    public void setVariableTwo(int variableTwo) {
        this.variableTwo = variableTwo;
    }

    public int getVariableTwo() {
        return this.variableTwo;
    }

    public void swapLiterals() {
        this.variableOne = this.variableTwo + this.variableOne;
        this.variableTwo = this.variableOne - this.variableTwo;
        this.variableOne = this.variableOne - this.variableTwo;
    }
}
