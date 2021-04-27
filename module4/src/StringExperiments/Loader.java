package StringExperiments;

public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7531 рублей, а Маша - 30000 рублей";


        int n1 = text.indexOf("Вася");
        int n2 = text.indexOf("рублей");
        String str1 = text.substring(n1, n2); //отсекаем часть сроки начиная с "Вася" заканчивая  первым встречающимся  словом "рублей"


        int n3 = text.indexOf("Маша");
        int n4 = text.lastIndexOf("рублей");
        String str2 = text.substring(n3, n4); //отсекаем часть сроки начиная с "Маша" заканчивая  последним встречающимся  словом "рублей"


        String[] res1; // разделяем строки на массив слов, исключая  пробел
        res1 = str1.split(" ");
        String[] res2;
        res2 = str2.split(" ");

        System.out.println(Integer.parseInt(res1[res1.length - 1]) + Integer.parseInt(res2[res2.length - 1]));

    }
}



