package aed;

class Funciones {
    int cuadrado(int x) {
        int res = x * x;
        return (int) res;
    }

    double distancia(double x, double y) {
        double res = Math.sqrt(x * x + y * y);
        return res;
    }

    boolean esPar(int n) {
        boolean res = false;
        if (n % 2 == 0)
            res = true;
        return res;
    }

    boolean esBisiesto(int n) {
        boolean res = false;
        if (n % 100 == 0 && n % 400 != 0)
            res = false;
        else if (n % 4 == 0)
            res = true;
        return res;
    }

    int factorialIterativo(int n) {
        int res = 1;
        for (int i =1; i <= n; i++)
            res = res*i;
        return res;
    }

    int factorialRecursivo(int n) { 
        int res = 1;
        if (n == 1)
            res = res *1;
        else if (n > 1)
            res = n * factorialRecursivo(n-1);
        return res;
    }

    boolean esPrimo(int n) {
        boolean res = true; 
        if (n == 0 || n == 1|| n == -1)
            res = false;
        for (int i = 2; i<n; i++){
            if (n % i == 0)
                res = false;
        }    
        return res;
    }

    int sumatoria(int[] numeros) {
        int res = 0;
        for (int i = 0; i < numeros.length; i++)
            res += numeros[i];
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        int res = 0;
        for (int i = 0; i<numeros.length; i++){
            if (numeros[i] == buscado)
                res = i;
        }
        return res;
    }

    boolean tienePrimo(int[] numeros) {
        boolean res = false;
        for (int i = 0; i< numeros.length; i++){
            if (esPrimo(numeros[i]))
                res = true;
        }
        return res;
    }

    boolean todosPares(int[] numeros) {
        boolean res = true;
        for (int i = 0; i < numeros.length; i++){
            if (esPar(numeros[i]) == false)
                res = false;       
        }
        return res;
    }

    boolean esPrefijo(String s1, String s2) {
        boolean res = true;
        char[] caracteres1 = s1.toCharArray();
        char[] caracteres2 = s2.toCharArray();
        for (int i = 0; i < caracteres1.length; i++){
            if (caracteres1.length > caracteres2.length)
                res = false;
            else if (caracteres1[i] != caracteres2[i])
                res = false;
        }
        return res;
    }

    boolean esSufijo(String s1, String s2) {
        boolean res = true;
        String s1Aux = "";
        String s2Aux = "";
        for (int i = (s1.length())-1; i>=0; i--)
            s1Aux += s1.charAt(i);
        for (int i = (s2.length())-1; i>=0; i--)
            s2Aux += s2.charAt(i);
        if (esPrefijo(s1Aux, s2Aux) == false)
            res = false;
        return res;
    }
}
