package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold; //порог

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> filterOut = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < source.size(); i++) {
            int value = source.get(i);
            if (value > treshold) {
                filterOut.add(value);
                logger.log("Элемент " + value + " проходит");
                count++;
            }
            logger.log("Элемент " + value + " не проходит");
        }
        logger.log("Прошло фильтр " + count + " элемента из " + (source.size() - count));
        return filterOut;
    }
}
