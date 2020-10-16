class ProgramTwo {
    private final int MEGABYTE_COEFFICIENT = 1024;

    private int sizeFileByte;

    ProgramTwo(int size) {
        this.sizeFileByte = size;
    }

    public void setSizeFileByte(int sizeFileByte) {
        this.sizeFileByte = sizeFileByte;
    }

    public int getSizeFileByte() {
        return sizeFileByte;
    }

    public double conversionOfKb() {
        return (double) this.sizeFileByte / MEGABYTE_COEFFICIENT;
    }

    public double conversionOfMb() {
        return (double) this.sizeFileByte / Math.pow(MEGABYTE_COEFFICIENT, 2);
    }




}