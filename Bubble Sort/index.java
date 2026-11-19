public class Main{
    static void Tablica(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.print();
    }

    static void Babelkowe(int[] tab){
        for(int i = 0; i < tab.length -1; i++){
            for(int j = 0; j < tab.length -1 -i; j++){
                if(tab[j] > tab[j + 1]){
                    int temp = tab[j];
                    tab[j] = tab[j + 1]
                    tab[j + 1] = temp;
                }
        }
    }
}

public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    for(; n < 5 || n >50;) {
    System.out.print("Podaj liczbe elementow od 5 do 50");
    int n = scanner.nextInt();
}
    int [] tab = new int [n];

    for(int i = 0; i < n; i++) {
        tab[i] = random.nextInt(100) + 1;
    }
    System.out.print("Przed sortowaniem");
    Tablica(tab);
    Babelkowe(tab);

System.out.print("Po sortowaniu");
        Tablica(tab);
        scanner.close();
}
}

