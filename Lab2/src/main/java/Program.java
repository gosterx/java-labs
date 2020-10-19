public class Program {
    public static void main(String[] args) {
        /*Задание 1*/
        PrService.printMsg("Enter mass: ");
        double weight = InpService.inputValueDouble();
        PrService.printMsg("Mass in grams: " +
                weight +
                "\nMass in kilos: " +
                ProgramOne.weightConventor(weight));

        /*Задание 2*/
        PrService.printMsg("\nEnter amount of bytes: ");
        double sizeFileByte = InpService.inputValueDouble();
        PrService.printMsg("Size in bytes: " + sizeFileByte +
                "\nSize in kilobytes: " + ProgramTwo.conversionOfKb(sizeFileByte) +
                "\nSize in megabytes: " + ProgramTwo.conversionOfMb(sizeFileByte));

        /*Задание 3*/
        PrService.printMsg("\nEnter distance: ");
        double distance = InpService.inputValueDouble();
        PrService.printMsg("Distance in sm: " + distance+
                "\nSize in m: " + ProgramThree.conversionOfMeters(distance) +
                "\nSize in km: " + ProgramThree.conversionOfKm(distance));

        /*Задание 4*/
        double a,b;
        PrService.printMsg("\nEnter numbers:");
        a= InpService.inputValueDouble();
        b= InpService.inputValueDouble();
        a=a+b;
        b=a-b;
        a=a-b;
        PrService.printMsg("a: "+ a+"\nb: "+b);

        /*Задание 5*/
        Sweets gelatins = new Sweets(2, 18);
        Sweets sweets = new Sweets(2, 10.0);
        PrService.printMsg("\nPrice for kilos(sweets): " + sweets.priceSweetsOneKg() +
                "\nPrice for kilos(gelatins): " + gelatins.priceSweetsOneKg() +
                "\nPrice difference: " + gelatins.getPriceSweets() / sweets.getPriceSweets());
    }
}
