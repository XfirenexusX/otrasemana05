import java.util.Scanner;

public class DivisionSegura {

    public static double dividir(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return (double) numerador / denominador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el numerador: ");
            int num = scanner.nextInt();

            System.out.print("Ingrese el denominador: ");
            int den = scanner.nextInt();

            double resultado = dividir(num, den);
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Proceso terminado.");
        }
    }
}