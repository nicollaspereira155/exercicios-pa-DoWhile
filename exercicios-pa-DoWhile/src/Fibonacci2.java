import java.util.*;

public class Fibonacci2 {
	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int i = 3; 
	        int tAnterior = 1, tAtual = 1, tNovo;
	        int n;
	        
	        System.out.println("Quantos termos da sequência de Fibonacci você quer ver?");
	        n = in.nextInt();
	        System.out.println();
	        System.out.println("Sequência de Fibonacci com " + n + " termos:");
	        
	        if (n <= 0) {
	            System.out.println("Por favor, insira um número maior que 0.");
	        } else if (n == 1) {
	            System.out.print(tAnterior);
	        } else if (n == 2) {
	            System.out.print(tAnterior + ", " + tAtual);
	        } else {
	            System.out.print(tAnterior + ", " + tAtual);
	            
	            do {
	                tNovo = tAnterior + tAtual;
	                System.out.print(", " + tNovo);
	                
	                tAnterior = tAtual;
	                tAtual = tNovo;
	                i++;
	            } while (i <= n);
	        }
	        
	        System.out.println();
	    }
	}