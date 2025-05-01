public class Calculadora {

    // Método para sumar dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Sobrecarga para sumar tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Sobrecarga para sumar dos números decimales
    public double sumar(double a, double b) {
        return a + b;
    }

    // Sobrecarga para sumar un array de enteros
    public int sumar(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Suma de 5 + 3: " + calc.sumar(5, 3));
        System.out.println("Suma de 2 + 4 + 6: " + calc.sumar(2, 4, 6));
        System.out.println("Suma de 3.5 + 2.7: " + calc.sumar(3.5, 2.7));

        int[] valores = {1, 2, 3, 4, 5};
        System.out.println("Suma de array: " + calc.sumar(valores));
    }
}