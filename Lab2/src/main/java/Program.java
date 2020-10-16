public class Program {
    public static void main(String[] args) {
        InpService controlInp = new InpService();
        PrService controlPr = new PrService();
        /*Задание 1*/
        controlPr.printMsg("Enter mass: ");

        ProgramOne task1 = new ProgramOne(Double.parseDouble(controlInp.inputValueDouble()));
        controlPr.printMsg("Mass in grams: " +
                task1.getWeightGram() +
                "\nMass in kilos: " +
                task1.weight());

        /*Задание 2*/
        controlPr.printMsg("\nEnter amount of bytes: ");
        ProgramTwo task2 = new ProgramTwo(Integer.parseInt(controlInp.inputValueDouble()));
        controlPr.printMsg("Size in bytes: " + task2.getSizeFileByte() +
                "\nSize in kilobytes: " + task2.conversionOfKb() +
                "\nSize in megabytes: " + task2.conversionOfMb());

        /*Задание 3*/
        controlPr.printMsg("\nEnter distance: ");
        ProgramThree task3 = new ProgramThree(Integer.parseInt(controlInp.inputValueDouble()));
        controlPr.printMsg("Distance in sm: " + task3.getDistance() +
                "\nSize in m: " + task3.conversionOfMeters() +
                "\nSize in km: " + task3.conversionOfKm());

        /*Задание 4*/
        Literals literalsTest = new Literals((Integer.parseInt(controlInp.inputValueDouble())), Integer.parseInt(controlInp.inputValueDouble()));
        controlPr.printMsg(literalsTest.getVariableOne() +"\n"+
                literalsTest.getVariableTwo());
        literalsTest.swapLiterals();
        controlPr.printMsg(literalsTest.getVariableOne() +"\n"+
                literalsTest.getVariableTwo());

        /*Задание 5*/
        Sweets gelatins = new Sweets(2, 18);
        Sweets sweets = new Sweets(2, 10.0);
        controlPr.printMsg("\nPrice for kilos(sweets): " + sweets.priceSweetsOneKg() +
                "\nPrice for kilos(gelatins): " + gelatins.priceSweetsOneKg() +
                "\nPrice difference: " + gelatins.getPriceSweets() / sweets.getPriceSweets());
    }
}
