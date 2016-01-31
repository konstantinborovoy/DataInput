import java.util.Scanner;

/**
 * Created by Костя on 31.01.2016.
 */
public class Reader {   //создали новый класс для чтения с клавиатуры


    public void Scan(){ // метод сканер
        int i;
        int k;
        System.out.println("Enter the first number");
        Scanner scn = new Scanner(System.in); // создали ссылку на сканер (стандартная библиотека)
        i = scn.nextInt(); // функция присвоения переменной следующего числа
        System.out.println("Enter the second number");
        k = scn.nextInt();
        System.out.println("first number = "+i + "\n second number = "+k); // \n - спецификатор переводящий строку вниз
    }

}
