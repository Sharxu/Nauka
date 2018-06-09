public class Main {
    public static void main(String[] args) {
        //tablica jednowymiarowa
        int tab[] = new int[7]; // [x] <--- taka sama liczba musi być w pętli
        tab[0] = 6;
        tab[1] = 9;
        tab[2] = 2;
        tab[3] = 6;
        tab[4] = 4;
        int z = 0;
        //pętla for
        for (int i = 0; i < tab.length; i++) // i<x <--- to co w new int [x] // dla tablic i<tab.length
        {

            System.out.println("Element tablicy "+z +" = " + tab[i]);
            z++;
        }

        System.out.println(); //wolna linia
        System.out.println(); //wolna linia

        int q = 0;
        for (int x : tab) {
            System.out.println("Tab ["+q+"] = "+x);
            q++;
        }

        System.out.println();
        System.out.println();

        //pętla while
        int n = 10;
        while (n > 0) {
            System.out.println("Cokolwiek " + n);
            n--;
        }

        System.out.println();
        System.out.println();

        //pętla do
        do {
            System.out.println("Tekst");
            n++;
        }
        while (n < 5);
        {
            System.out.println("Koniec");
        }

        System.out.println();
        System.out.println();
        System.out.println();

        //tablice wielowymiarowe

        int table[][] = {{2, 3, 4}, {1, 2, 3}};

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.println(table[i][j]);
            }

        }

        System.out.println();
        System.out.println();
        //pętla zewnętrzna wykona sie 1, a następnie po całym cyklu pętli wewnętrznej i znowu
        for (int a=5; a>0; a--)
        {
            for (int b=5; b<10; b++)
                System.out.println("Zmienna a = "+a +", zmienna b = "+b);

        }
    }
}