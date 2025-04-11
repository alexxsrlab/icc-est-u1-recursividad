public class App {
    public static void main(String[] args) throws Exception {

        EjerciciosRecursivos ejercicios = new EjerciciosRecursivos();
        int resultadoFibonacci = ejercicios.fibonacci(5); 
        System.out.println("Fibonacci(6) = " + resultadoFibonacci);

        int resultadoSuma = ejercicios.sumaConsecutivos(5); 
        System.out.println("Suma consecutivos(5) = " + resultadoSuma);
        
        
        int resultado = ejercicios.getPotencia(2, 3);
        System.out.println("Multiplicacion de exponentes = " + resultado);

        
        int numero = ejercicios.sumaDigitos(1234);
        System.out.println("La suma de los dígitos es: " + numero);

      /*   int n = 5;
        int resultadoFinal = factorial(n);
        System.out.println("Resultado: " + resultadoFinal);



    }


    public static int factorial(int n){
        if(n==0){
            System.out.println("Alcance el caso base");
            return 1;
        }

        int resultado = n * factorial(n - 1);
        System.out.println("Calculando factorial de " + n + " * factorial(" + (n - 1) + "-1)");
        return resultado;

    }*/

}
}
