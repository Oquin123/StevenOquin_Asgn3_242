class TemperatureConverter extends Converter {
    public TemperatureConverter(double fahrenheit) {
        super(fahrenheit);
    }

    @Override
    public double convert() {
        if (Double.isNaN(getInput())) {
            return Double.NaN;
        }
        return ((getInput() - 32) * 5) / 9;
    }
}