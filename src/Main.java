import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> stringListA = new ArrayList<>();
        List<String> stringListB = new ArrayList<>();
        List<String> stringListC = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку для списка А " + (i + 1) + ": ");
            String input = scanner.nextLine();
            stringListA.add(input);
        }

        System.out.println("Список А: ");
        for (String str : stringListA) {
            System.out.println(str);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку для Списка Б " + (i + 1) + ": ");
            String input = scanner.nextLine();
            stringListB.add(input);
        }


        System.out.println("Список Б:");
        for (String str : stringListB) {
            System.out.println(str);
        }
        for (int i = 0; i < 5; i++) {
            stringListC.add(stringListA.get(i));
            stringListC.add(stringListB.get(4 - i));
        }


        System.out.println("Список С:");
        for (String str : stringListC) {
            System.out.println(str);
        }

        Comparator<String> lengthComparator = Comparator.comparingInt(String::length);

        stringListC.sort(lengthComparator);

        System.out.println("\nОтсортированный список С по длине слова:");
        for (String str : stringListC) {
            System.out.println(str);
        }
        scanner.close();
    }
}