import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ler o nome dos times
        System.out.print("Digite o nome do primeiro time: ");
        String time1 = sc.nextLine();

        System.out.print("Digite o nome do segundo time: ");
        String time2 = sc.nextLine();

        // Ler os gols de cada time
        System.out.print("Gols do " + time1 + ": ");
        int golsTime1 = sc.nextInt();

        System.out.print("Gols do " + time2 + ": ");
        int golsTime2 = sc.nextInt();

        // Determinar o vencedor ou empate
        if (golsTime1 > golsTime2) {
           System.out.println("Vencedor: " + time1);
        } else if (golsTime2 > golsTime1) {
            System.out.println("Vencedor: " + time2);
        } else {
            System.out.println("EMPATE");
        }

        sc.close();
    }
}
