public class FindFahrenheit {

    public static void main(String[] args) {
        int c=32;
        double fah=findFahrenheit(c);
        System.out.println("The fahrenheit for the celsius value is :"+fah);
    }

    public static double findFahrenheit(int c){
        double f = ((double)c * 9/5) + 32;
        return f;
    }
}