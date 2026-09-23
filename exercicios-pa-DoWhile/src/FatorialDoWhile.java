import java.util.Scanner;

public class FatorialDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int resultado = 1;
        
        System.out.println("Digite o numero que deseja fatorar: ");
        int n = in.nextInt();
        
        if (n < 0) {
            System.out.println("Não existe fatorial de número negativo.");
        } else if (n == 0) {
            System.out.println("O resultado é: 1");
        } else {
            int temp = n;
            do {
                resultado = resultado * temp;
                temp--;
            } while (temp > 0);
            
            System.out.println("O resultado é: " + resultado);
        }
        
        in.close();
    }
}