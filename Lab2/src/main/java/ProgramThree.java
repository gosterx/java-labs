class ProgramThree {
    private static  final double ONE_HUNDRED=100;
    private static final double ONE_HUNDRED_THOUSAND= 100000;

    public static double conversionOfMeters(double distanceCm) {
        return distanceCm / ONE_HUNDRED;
    }

    public static double conversionOfKm(double distanceCm) {
        return distanceCm / ONE_HUNDRED_THOUSAND;
    }
}
