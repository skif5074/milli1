public class Main {
    public static void main(String[] args) {
        BonisMilli service = new BonisMilli();
        int price = 100;
        int milli = service.calculate(price);
        System.out.println("Начисленные мили за купленный билет: " +  milli);
    }
}
