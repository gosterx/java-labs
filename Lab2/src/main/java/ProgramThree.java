class ProgramThree {

    private int distanceCm;

    ProgramThree(int distance) {
        this.distanceCm = distance;
    }

    public void setDistance(int distance) {
        this.distanceCm = distance;
    }

    public int getDistance() {
        return distanceCm;
    }

    public double conversionOfMeters() {
        return (double) this.distanceCm / 100;
    }

    public double conversionOfKm() {
        return (double) this.distanceCm / 100000;
    }

}
