package Etapa02;

public class NumeroMaior {
	
	int a;
    int b;
    int c;

    NumeroMaior(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método para encontrar o maior número
    int Maior() {
        if (a > b && a > c) { // se o A for maior que o B e o C
            return a; // retorna o A
        } else if (b > a && b > c) { // se o B for maior que o A e o C
            return b; // retorna C
        } else {
            return c; // se nao for nenhuma das opcoes acima, retorna o C
        }
    }
    
    public static void main(String[] args) {
    	
    	NumeroMaior numeros = new NumeroMaior(8, 15, 40); // os tres numeros forn

         int maior = numeros.Maior();  
         
         System.out.println("O maior número é: " + maior); // exibe o maior numero  entre os tres
    
    }
}

	

