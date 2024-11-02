public class Main {
    public static void main(String[] args) {
        // Declaración de diferentes tipos de datos
        long numLong = 123456789L;
        int numInt = 12345;
        short numShort = 1234;
        byte numByte = 100;
        double numDouble = 12345.6789;
        float numFloat = 123.45f;
        char caracter = 'A';
        boolean EsVerdadero = true;

        // Declaración de arrays
        int[] arrayInt = {1, 2, 3, 4, 5};
        char[] arrayChar = {'S', 'A', 'U', 'L'};
        
        // Imprimir valores de cada variable
        System.out.println("Valor de long: " + numLong);
        System.out.println("Valor de int: " + numInt);
        System.out.println("Valor de short: " + numShort);
        System.out.println("Valor de byte: " + numByte);
        System.out.println("Valor de double: " + numDouble);
        System.out.println("Valor de float: " + numFloat);
        System.out.println("Valor de char: " + caracter);
        System.out.println("Valor de boolean: " + EsVerdadero);
        
        // Imprimir valores de los arrays
        System.out.print("Valores del array de int: ");
        for (int num : arrayInt) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Valores del array de char: ");
        for (char c : arrayChar) {
            System.out.print(c);
        }
        System.out.println();
    }
}
