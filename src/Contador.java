public class Contador {
    public int contarPares(int n){
        int contador = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) { // verifica se é par
                contador++;
            }
        }

        return contador;
    }}
