class DistanceConverter extends Converter {
    public DistanceConverter(double miles) {
        super(miles);
    }

    @Override
    public double convert() {
        if (Double.isNaN(getInput())) {
            return Double.NaN;
        }
        return getInput() * 1.609;
    }
}