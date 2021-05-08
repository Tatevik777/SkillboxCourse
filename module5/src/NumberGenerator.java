import java.util.*;

public class NumberGenerator {

    public static void main(String[] args) {
        String[] letters = {"C", "M", "T", "B", "A", "P", "O", "H", "E", "Y"};
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 1; k < 199; k++) {
                    String letter = letters[i];
                    String region = String.valueOf(k);
                    if (k < 10) {
                        region = "0" + region;
                        String number = String.format("%s%d%d%d%s%s%s", letter, j, j, j, letter, letter, region);
                        list.add(number);
                    }
                }
            }
            for (int l = 0; l < list.size(); l++) {
                System.out.println(list.get(l));
            }

            Collections.sort(list);
            HashSet<String> set = new HashSet<>(list);
            TreeSet<String> set1 = new TreeSet<>(list);
            while (true) {
                Scanner scanner = new Scanner(System.in);
                String stateNumber = scanner.nextLine();
                long a = System.nanoTime();
                if (list.contains(stateNumber)) {
                    System.out.println("Поиск перебором: номер найден, поиск занял: " + (System.nanoTime() - a) + "нс");
                } else {
                    System.out.println("Поиск перебором: номер не найден, поиск занял: " + (System.nanoTime() - a) + "нс");
                }
                long b = System.nanoTime();
                if (Collections.binarySearch(list, stateNumber) == 0) {
                    System.out.println("Бинарный поиск: номер найден, поиск занял: " + (System.nanoTime() - b) + "нс");
                } else {
                    System.out.println("Бинарный поиск: номер не найден, поиск занял: " + (System.nanoTime() - b) + "нс");
                }
                long c = System.nanoTime();
                if (set.contains(stateNumber)) {
                    System.out.println("Поиск в HashSet: номер найден, поиск занял: " + (System.nanoTime() - c) + "нс");
                } else {
                    System.out.println("Поиск в HashSet: номер не найден, поиск занял: " + (System.nanoTime() - c) + "нс");
                }
                long d = System.nanoTime();
                if (set1.contains(stateNumber)) {
                    System.out.println("Поиск в TreeSet: номер найден, поиск занял: " + (System.nanoTime() - d) + "нс");
                } else {
                    System.out.println("Поиск в TreeSet: номер не найден, поиск занял: " + (System.nanoTime() - d) + "нс");
                }
            }
        }

    }
}
