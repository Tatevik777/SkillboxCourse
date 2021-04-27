import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FIO {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fullName = reader.readLine();

        int firstIndex = fullName.indexOf(" ");
        int lastIndex = fullName.lastIndexOf(" ");

        String firstName = fullName.substring(0, firstIndex);
        String lastName = fullName.substring(firstIndex + 1, lastIndex);
        String otherName = fullName.substring(lastIndex + 1);

        System.out.println("Фамилия: " + firstName);
        System.out.println("Имя: " + lastName);
        System.out.println("Отчество: " + otherName);
    }

}
