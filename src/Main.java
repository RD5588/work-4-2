public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 90;
        double height = 1.80;
        double Bmi = service.calculate(weight, height);
        System.out.println(Bmi);
    }
}