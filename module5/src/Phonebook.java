import java.util.Scanner;
import java.util.TreeMap;

public class Phonebook
{
    private static TreeMap<String, String> contacts = new TreeMap<>();
    private static String userInput;
    private static final String NAME_REGEX = "^[А-Я][а-я]*$";
    private static final String PHONE_NUMBER_REGEX = "^8[(]\\d{3}[)]\\d{3}[-]\\d{2}[-]\\d{2}";
    private static final String TEST_REGEX = "[7|8]\\d{10}";

    public static void main(String[] args) {

        initContacts();
        while (true) {
            System.out.println("введите фио или номер телефона:");
            userInput = new Scanner(System.in).nextLine();
            if (userInput.matches(PHONE_NUMBER_REGEX)) {
                phoneOperation();
            } else if (userInput.matches(NAME_REGEX)) {
                nameOperation();
            } else if (userInput.matches("LIST")) {
                contacts.forEach((name, phone) -> System.out.println(name + " " + phone));
            } else if (userInput.matches(TEST_REGEX)) {
                System.out.println("Test regex ok!");

            } else {
                System.out.println("!> Некорректный ввод.");
            }
        }

    }

    //Метод обработки нового контакта по имени
    private static void nameOperation() {
        if (contacts.containsKey(userInput)) {
            System.out.println("Найден контакт: " + contacts.ceilingEntry(userInput));
        } else {
            System.out.println("Введите номер телефона для нового контакта: ");
            for (int i = 0; i < 3; i++) {
                System.out.println("Попытка " + (i + 1));
                String newTelNum = new Scanner(System.in).nextLine();
                if (newTelNum.matches(TEST_REGEX)) {
                    if(newTelNum.startsWith("7")) {
                        newTelNum = newTelNum.replaceAll("^7","8");
                    }
                    StringBuilder sb = new StringBuilder(newTelNum);
                    sb.insert(1,"(");
                    sb.insert(5,")");
                    sb.insert(9,"-");
                    sb.insert(12,"-");
                    System.out.println(sb.toString());

                    contacts.put(userInput, newTelNum);
                    System.out.println("новый контакт " + userInput + " успешно добавлен в телефонную книгу.");
                    break;
                } else {
                    System.out.println("!> Некорректный номер телефона.");
                }
            }
        }
    }
    // Метод обработки контакта по номеру телефона
    private static void phoneOperation() {
        if (contacts.containsValue(userInput)) {
            System.out.println("Контакт с таким телефоном есть в телефонной книге.");
        } else {
            System.out.println("Введите имя для нового контакта: ");
            for (int i = 0; i < 3; i++) {
                System.out.println("Попытка " + (i + 1));
                String newContactName = new Scanner(System.in).nextLine();
                if (newContactName.matches(NAME_REGEX)) {
                    contacts.put(newContactName, userInput);
                    System.out.println("новый контакт " + newContactName + " успешно добавлен в телефонную книгу.");
                    break;
                } else {
                    System.out.println("!> Некорректное имя.");
                }
            }
        }
    }

    //Заполнение телефонной книги контактами
    private static void initContacts() {
        contacts.put("Олег", "8(911)524-87-99");
        contacts.put("Виктор", "8(921)474-57-85");
        contacts.put("Аня", "8(905)421-74-56");
    }
}
