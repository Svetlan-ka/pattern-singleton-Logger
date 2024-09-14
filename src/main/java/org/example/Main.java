package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scan = new Scanner(System.in);

        logger.log("Запускаем программу");
        System.out.println("Программа запущена!");

        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int size = scan.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = scan.nextInt();

        List<Integer> list = logger.createRandomList(size, maxValue);
        System.out.println("Заполненный список: " + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int treshold = scan.nextInt();
        Filter filter = new Filter(treshold);
        List<Integer> res = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + res);

        logger.log("Завершаем программу");
    }
}