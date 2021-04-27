import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DateOfBirth {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату вашего рождения в формате (день/месяц/год)");
        String s = scanner.nextLine().replaceAll("\\D", ".");
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy - EEEE");
        Calendar c = Calendar.getInstance();
        c.setTime(format1.parse(s));
        Calendar date = Calendar.getInstance();
        if (c.after(date)) {
            System.out.println("Введенная дата не наступила!");
        } else {
            while (c.before(date)) {
                System.out.println(format.format(c.getTime()));
                c.add(Calendar.YEAR, 1);
            }
        }
    }
}
