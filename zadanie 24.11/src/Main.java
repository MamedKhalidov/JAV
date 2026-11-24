import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void tablica(int[] tab) {
    Random random = new Random();

        for(int i = 0; i < 50; i++) {
            tab[i] = random.nextInt(100) + 1;
        }
        }

        public static int wyszukaj(int[] tab, int szukana) {
        tab[50] = szukana;

        int i;
        for(i = 0; tab[i] != szukana; i++) {

        }
        if(i == 50) {
            return -1;
        } else {
            return i;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tab = new int[51];

        tablica(tab);
        System.out.println("Podaj liczbe do wyszukania: ");
        int szukana = scanner.nextInt();
        int indeks = wyszukaj(tab, szukana);

        System.out.println("zawartosc tablicy");

        for(int i = 0; i <50; i++) {
            System.out.println(tab[i]);

            if(i < 49) {
                System.out.print(", ");
            }
        }

        System.out.println();

        if(indeks == -1) {
            System.out.println("nie znalzeiono szukanej liczby");
        } else {
            System.out.println("znaleziono liczbe" + szukana + "pod indeksme" + indeks);
        }
        scanner.close();
    }
    }
