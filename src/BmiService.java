public class BmiService {
    public double calculate(double weight, double height) {


        double result = height * height;
        double index = weight / result;

        return index;
    }
}
