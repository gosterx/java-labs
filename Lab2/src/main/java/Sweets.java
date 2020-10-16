class Sweets {
    private int weightSweets;
    private double priceSweets;

    Sweets(int weightSweets, double priceSweets) {
        this.priceSweets = priceSweets;
        this.weightSweets = weightSweets;
    }

    public void setPriceSweets(double priceSweets) {
        this.priceSweets = priceSweets;
    }

    public double getPriceSweets() {
        return priceSweets;
    }

    public void setWeightSweets(int weightSweets) {
        this.weightSweets = weightSweets;
    }

    public int getWeightSweets() {
        return weightSweets;
    }

    public double priceSweetsOneKg() {
        return this.priceSweets / this.weightSweets;
    }
}
