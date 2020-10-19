class ProgramTwo {
    private static final int MEGABYTE_COEFFICIENT = 1024;

    public static  double conversionOfKb(double sizeFileByte) {
        return sizeFileByte / MEGABYTE_COEFFICIENT;
    }

    public static double conversionOfMb(double sizeFileByte) {
        return sizeFileByte / Math.pow(MEGABYTE_COEFFICIENT, 2);
    }
}