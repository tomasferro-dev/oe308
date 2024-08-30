public class Main {
    public static <T> void printea(T content) {
        System.out.println(content);
    }
    public static void suma(int a, int b) {
        printea("El resultado de la suma es: ");
        printea(a + b);
    }
    public static void main(String[] args) {
        printea("hola mundito");
        suma(34, 324);
    }
}