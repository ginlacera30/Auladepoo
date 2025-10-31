public class Matematica {
    public void fatorial(int n) {
        int resultado = n;

        for (int i = 1; i < n; i++) {
            resultado *= i;
            System.out.println(resultado);
        }}
    public double potencia(double base, int exp) {
        double resultado = 1;

        for (int i = 1; i <= exp; i++) {
            resultado *= base;
        }

        return resultado;
    }

        public double raizQuadrada(double n) {
            return n * n ;
    }}


