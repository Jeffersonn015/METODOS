package Etapa02;

public class RetornaAB {
    double a;
    double b;
    
    // Construtor
    RetornaAB(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    // Método para calcular a potência de A elevado por B
    double calcular() {
        return Math.pow(a,b);
    }
    
    public static void main(String[] args) {
        
        RetornaAB numeros = new RetornaAB(5,2);

        double resultado = numeros.calcular(); // faz o calculo da potencia

        System.out.println(numeros.a + " elevado a " + numeros.b + " é igual a: " + resultado); // mostra o resultado 
    }
}
