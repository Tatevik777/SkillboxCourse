package homework1;

import java.lang.constant.Constable;

import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 555;
        System.out.println(sumDigits(5555));


    }

    public static int sumDigits(Integer number) {
        //@TODO: write code here
        //  int sum = 0;
        //while (number > 0) {
        //  sum += number % 10;
        //number/=10;
        //}
        String s = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(valueOf(s.charAt(i)));
        }
        return sum;


    }
}
