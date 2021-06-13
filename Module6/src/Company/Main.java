package Company;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Company bmw = new Company(2000000.00);
        //нанимаем 100 операторов
        List<Employee> empList = new ArrayList<>();
        for (int i = 0; i < 100; i++)
            empList.add(new Operator(bmw));
        //нанимаем 50 менеджеров
        for (int i = 0; i < 50; i++)
            empList.add(new Manager(bmw));
        //нанимаем 7 топменеджеров
        for (int i = 0; i < 7; i++)
            empList.add(new TopManager(bmw));

        bmw.hireAll(empList);

        NumberFormat df = NumberFormat.getInstance(Locale.getDefault());

        System.out.println("===Cписок состоящий из 13 самых высоких зарплат в компании===");
        bmw.getTopSalaryStaff(13).forEach(i -> System.out.println( i.getSalary()));

        System.out.println("===Cписок состоящий из 13 самых низких зарплат в компании===");
        bmw.getLowestSalaryStaff(13).forEach(i -> System.out.println(i.getSalary()));

        System.out.println("===Увольняем 50% сотрудников===");

        System.out.println("Колчество сотрудников в компании до увольнения: " + bmw.getEmployees().size());
        for (int i = 0; i < empList.size() / 2; i++)
            bmw.fire(empList.get(i));
        System.out.println("Колчество сотрудников в компании после увольнения: " + bmw.getEmployees().size());

        System.out.println("===Cписок состоящий из 13 самых высоких зарплат в компании===");

        bmw.getTopSalaryStaff(13).forEach(i -> System.out.println(i.getSalary()));

        System.out.println("===Cписок состоящий из 30 самых низких зарплат в компании===");
        bmw.getLowestSalaryStaff(30).forEach(i -> System.out.println( i.getSalary()));
    }

}
