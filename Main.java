
//Jest to klasa Main
public class Main
{
    byte b = 127; // -128 do 127
    short s = 32767; // -32768 do 32767
    int i = -214783648; // -214783648 do 214783647
    long l = 9223372036854775807l; // -9223372036854775808 do 9223372036854775807
    float f = 3.4444444f; // -3.4*10^-38 do 3.4*10^-38
    double d = 3.777763254454554; // -1.8*10^108 do 1.8*10^108
    char c = 'a'; // większość liter
    String string = "To jest jakiś tekst";

    public static void main (String [] args)
    {
        int wynik = 5;
        System.out.println ("Wynik = "+ wynik);
        System.out.println();

        int wynik2, wynik3, wynik4, wynik5;
        int l1 = 56;
        int l2 = 16;
        wynik2 = l1+l2;
        wynik3 = l1*l2;
        wynik4 = l1/l2;
        wynik5 = l1-l2;
        int wynik6 = l1%l2;

        System.out.println ("Wynik dodawania = "+wynik2);
        System.out.println ("Wynik mnożenia = "+wynik3);
        System.out.println ("Wynik odejmowania = "+wynik5);
        System.out.println ("Wynik dzielenia ="+wynik4);
        System.out.println ("Reszta z dzielenia = "+wynik6);
        wynik6++;
        wynik6++;
        wynik6++;
        System.out.println("Wynik 6 = "+wynik6);
        wynik2--;
        System.out.println("Wynik 2 = "+wynik2);

    }
}
