import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        int size = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int maxValue = scanner.nextInt();
        logger.log("Создаём и наполняем список");

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            Integer r = random.nextInt(maxValue);
            list.add(r);
        }

        logger.log("Вот случайный список:");
        print(list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        int filterValue = scanner.nextInt();
        logger.log("Запускаем фильтрацию");

        Filter filter = new Filter(filterValue);
        List<Integer> filterList = filter.filterOut(list);

        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список:");
        print(filterList);

        logger.log("Завершаем программу");

    }

    public static void print(List<Integer> list) {
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
