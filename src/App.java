import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        
        int peso = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Jogo Pedra, Papel e Tesoura");
        System.out.println();
        System.out.println("Escolha um item: 1-Pedra 2-Papel 3-Tesoura");
        int escolhaPessoa = scanner.nextInt();

        if(escolhaPessoa == 1) {
            peso = 1;
        } else if(escolhaPessoa == 2) {
            peso = 2;
        } else if(escolhaPessoa == 3) {
            peso = 3;
        }

        int min = 1;
        int max = 3;

        Random random = new Random();
        int numeroComputador = random.nextInt(max) + min;

        jogo jogo = new jogo();
        System.out.printf("Escolha do jogador %d", peso);
        System.out.println();
        System.out.printf("Escolha do computador %d", numeroComputador);
        System.out.println();
        System.out.printf("O vencedor é o %s", jogo.verificarVencedor(escolhaPessoa, numeroComputador) );

        scanner.close();
    
        
    }
}