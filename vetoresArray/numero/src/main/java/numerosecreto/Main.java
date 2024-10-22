package numerosecreto;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        int numeroSecreto = random.nextInt(150) + 1;
        
        // Vetor para armazenar as tentativas do jogador
        int[] tentativas = new int[150]; // Assumimos que o jogador não fará mais de 100 tentativas
        int numTentativas = 0;
        boolean acertou = false;
        
        System.out.println("Bem-vindo ao jogo de adivinhar o número secreto!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");
        
        while (!acertou) {
            System.out.print("Digite sua tentativa: ");
            int tentativa = scanner.nextInt();
            tentativas[numTentativas] = tentativa;
            numTentativas++;
            
            if (tentativa == numeroSecreto) {
                System.out.println("Parabéns! Você acertou em " + numTentativas + " tentativas.");
                acertou = true;         
            } else if (tentativa < numeroSecreto) {
                System.out.println("O número secreto é maior que " + tentativa + ".");
            } else {
                System.out.println("O número secreto é menor que " + tentativa + ".");
            }
        }
        
        // Imprimindo todas as tentativas do jogador
        System.out.println("\nSuas tentativas:");
        for (int i = 0; i < numTentativas; i++) {
            System.out.print(tentativas[i] + "  ");
        }
        System.out.println();
        
        scanner.close();
    }
}