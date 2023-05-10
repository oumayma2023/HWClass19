package HWClass19;

public class PrivateMethod {

    private static void multiply(int a, int b){
        System.out.println(a*b);
    }

    private static void multiply(int a, double b){
        System.out.println(a*b);
    }

    private static void multiply(double a, double b){
        System.out.println(a*b);
    }

    private static void multiply(long a, long b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {

        multiply(50, 2);
        multiply(24, 30.2);
        multiply(13.2, 25.5);
        multiply(54553L, 89786L);
    }
}
