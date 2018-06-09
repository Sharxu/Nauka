import java.util.Scanner;

public class Main {
    public static void main (String args[])
    {
        int a = 7;

        //wszystkie instrukcje sprawdzane razem - stop jeśli jakaś zostanie sprawdzona
        if (a<10)
            System.out.println("a<10");
        else if (a==10)
            System.out.println("a=10");
        else if (a==9)
            System.out.println("a=9");
        else if (a==8)
            System.out.println("a=8");
        else
            System.out.println("a>10");
        //-----------------------------------------------------------------------------
        //System.out.println();
        //System.out.println();

        //wykonają się wszystkie prawdziwe instrukcje
        if (a<10)
            System.out.println("a<10");
        if (a==10)
            System.out.println("a=10");
        if (a==9)
            System.out.println("a=9");
        if (a==8)
            System.out.println("a=8");
        else
            System.out.println("a>10");
        //------------------------------------------------------------------------------

        System.out.println();
        System.out.println();

        if (a<10) {
            System.out.println("a<10");
                if (a==8)
                    System.out.println("a=8");
                else
                    System.out.println("a!=8");
        }
        //-------------------------------------------------------------------------------

        //System.out.println();
        //System.out.println();

        int b = 4;

        switch (b)

        {
            case 1:
                System.out.println("b = 1");
                break;
            case 2:
                System.out.println("b = 2");
                break;
            case 3:
                System.out.println("b = 3");
                break;
            case 4:
                System.out.println("b = 4");
                break;
            case 5:
                System.out.println("b = 5");
                break;
            default:
                System.out.println("Default");
                break;
        }
        //-------------------------------------------------------------------------------
        //System.out.println();
        //System.out.println();

        int c = 10;
        int d;

        d = c < 10 ? -1 : 1;
        System.out.println(d);
        //-------------------------------------------------------------------------------

        //System.out.println();
        //System.out.println();

        for (int i=0; i<10; i++)
        {
            System.out.print(i + " ");
            if (i==5)
                break;
        }
        //-------------------------------------------------------------------------------

        //System.out.println();
        //System.out.println();

        for (int i=0; i<10;i++)
        {
            if (i%2==0) continue;
            System.out.print(i + " ");
        }
        //-------------------------------------------------------------------------------

        //System.out.println();
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        //Skanowanie liter z klawiatury
        String name;
        int wiek;
        System.out.print("Podaj swoje imię: ");
        name = scanner.next();
        System.out.print("Podaj swój wiek: ");
        wiek = scanner.nextInt();
        System.out.println("Masz na imię "+name +" i masz "+wiek+" lat");

        //-------------------------------------------------------------------------------

    }
}
