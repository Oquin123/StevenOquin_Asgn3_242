/**
 * Name: Steven Oquin
 * Date: 06/27/2023
 * Class: CMIS 242/6384
 * This program prompts user what type of converter they would like and inputs the desired numbers they would like
 * converted. The program will then use the calculations then outputs the proper conversion.
 */

class Converter {
    private double input;

    public Converter() {
        input = Double.NaN;
    }

    public Converter(double input) {
        this.input = input;
    }

    public double getInput() {
        return input;
    }

    public void setInput(double input) {
        this.input = input;
    }

    public double convert() {
        return input;
    }
}