import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<Integer>();
        for(int i = 0; i < 50; i++)
        {
            liczby.add(i);
        }
        ArrayList<Integer> wylosowaneLiczby = new ArrayList<Integer>();
        for(int i = 0; i < 6; i++)
        {
            //wylosowaneLiczby.add((int)Math.random() * liczby.size());
        }
        ArrayList<Integer> podaneLiczby = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        while(podaneLiczby.size() < 6)
        {
            System.out.println("Podaj kolejną typowaną liczbę z zakresu <1,49>: ");
            Integer liczba = scanner.nextInt();
            if(podaneLiczby.contains(liczba))
            {
                System.out.println("Wytypowałeś już tą liczbę, podaj inną");
            }
            else if(liczba < 1 || liczba > 49)
            {
                System.out.println("Liczba z poza zakresu, wybierz inną");
            }
            else
            {
                podaneLiczby.add(liczba);
            }
        }
        System.out.println(podaneLiczby);
    }
}