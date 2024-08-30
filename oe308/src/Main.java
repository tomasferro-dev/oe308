//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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