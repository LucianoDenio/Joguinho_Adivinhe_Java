import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Eae Luciano Dênio tudo em paz? Sei que não mas vamos lá");
        System.out.println("Vamos tentar acertar um número meu nobre entre 1 e 100 você tem 10 tentativas");
        int numeroSorteado = new Random().nextInt(100);
        int tentativas = 10;
        for (int i = 1; i <= tentativas; i++) {
            System.out.printf("essa e sua tentativa número %d ", i);
            System.out.print("Chute um número: ");
            int chute = sc.nextInt();
            if(chute == numeroSorteado){
                System.out.println("Parabéns você acertou o número sorteado era o " + numeroSorteado);
                break;
            } else if (chute < numeroSorteado) {
                System.out.println("O número secreto e maior tente novamente. ");
            }else {
                System.out.println("O número secreto é menor tente novamente. ");
            }

        }

        }
    }
