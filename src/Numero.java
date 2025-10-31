public class Numero {
    public int dobro(int numero ){
        return numero * 2;

    }
    public void ehPrimo(int n) {
        boolean primo = true;

        if (n <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        } if (primo) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo.");
        }
    }}


