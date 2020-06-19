package modul;
import java.util.Scanner;
 
public class program_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] tab = new char[101];
        double[] tab2 = new double[101];
        int i = -1, j = 0, c = 0, d = 0;
        System.out.println("Podaj wartosc do obliczenia, aby kazdy znak od siebie byl oddzielony spacja np: \n10 * 10 * 10 / 2 * 2 * 2 / 2 + 2 - 5 = ");
        do {
            i++;
            tab2[i] = scanner.nextInt();
            tab[i] = scanner.next().charAt(0);
 
        } while (tab[i] != '=');
        glowna:
        while (tab[j] != '=' && tab[j] != 0 ) {
            if (tab[j] == '*') {
                tab2[j] = tab2[j] * tab2[j + 1];
                c = j;
                d = j;
                do {
                    c++;
                    tab2[c] = tab2[c + 1];
                } while (tab2[c] != 0);
                do {
 
                    tab[d] = tab[d + 1];
                    d++;
 
                } while (tab[d] != '=');
                tab[d] = 0;
                j = 0;
                continue glowna;
            }
 
            if (tab[j] == '/') {
                tab2[j] = tab2[j] / tab2[j + 1];
                c = j;
                d = j;
                do {
                    c++;
                    tab2[c] = tab2[c + 1];
                } while (tab2[c] != 0);
                do {
 
                    tab[d] = tab[d + 1];
                    d++;
 
                } while (tab[d] != '=');
                tab[d] = 0;
                j = 0;
                continue glowna;
 
            }
            j++;
        }
 
        while (tab[0] != '=' && tab[0] != 0) {
            if (tab[0] == '+') {
                tab2[0] = tab2[0] + tab2[1];
                c = 0;
                d = 0;
                do {
                    c++;
                    tab2[c] = tab2[c + 1];
                } while (tab2[c] != 0);
 
                do {
 
                    tab[d] = tab[d + 1];
                    d++;
 
                } while (tab[d] != '=');
                tab[d] = 0;
 
            }
 
            if (tab[0] == '-') {
                tab2[0] = tab2[0] - tab2[1];
                c = 0;
                d = 0;
                do {
                    c++;
                    tab2[c] = tab2[c + 1];
                } while (tab2[c] != 0);
 
                do {
 
                    tab[d] = tab[d + 1];
                    d++;
 
                } while (tab[d] != '=');
                tab[d] = 0;
            }
        }
        System.out.println(tab2[0]);
        scanner.close();
    }
}