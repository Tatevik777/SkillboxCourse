import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Hospital {
    public static final int PATIENTS_COUNT = 30;
    public static final int MIN_TEMP = 32;
    public static final int MAX_TEMP = 40;

    public static void main(String[] args) throws IOException {

        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols();
        otherSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat1 = new DecimalFormat("#.#", otherSymbols);
        String[] patients = new String[PATIENTS_COUNT];
        for (int i = 0; i < patients.length; i++) {
            patients[i] = Float.toString((float) Math.random() * (MAX_TEMP - MIN_TEMP) + MIN_TEMP);
        }

        float average = 0;
        for (int i = 0; i < patients.length; i++) {
            average += Float.parseFloat(patients[i]);
        }
        average /= patients.length;

        System.out.println(
                "Температура пациентов: "
                        + String.join(",", patients)
                        + "\nСредняя температура:"
                        + average
                        + "\nКоличество здоровых пациентов:");
    }
}
