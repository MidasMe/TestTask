import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Первое задание
        System.out.print("Введите число: ");
        int num = in.nextInt();

        if (num > 7) {
            System.out.println("Привет");
        }
        //Второе задание
        System.out.print("Введите Имя: ");
        String name = in.next();
        if (name.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав!");

        } else{
            System.out.println("Нет такого имени!");
        }
        //Третье задание
        int[] numbers = {1, 2 , 3 ,4 ,5 ,6, 7, 8, 9, 3};
        for (int number : numbers){
            if (number == 3){
                System.out.println(number);
            }
        }

        /* Четвертое задание
            Нет, неправильно. 1 лишняя квадратная скобка, не хватает 1 круглой скобки. Для правильности нужно привести к виду: [((())()(()))]
             */
    }
}