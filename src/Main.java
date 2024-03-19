import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> podaneLiczby = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        while(podaneLiczby.size() < 6)
        {
            System.out.println("Podaj kolejną typowaną liczbę z zakresu <1,49>: ");
            Integer liczba = scanner.nextInt();
            podaneLiczby.add(liczba);
        }
        System.out.println(podaneLiczby);
    }
}