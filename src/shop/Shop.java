package shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Shop {
    public Cap cap = new Cap("nike", Arrays.asList("красный", "белый"), 1000);
    public Shorts shorts = new Shorts("kappa", Arrays.asList("черный", "зеленый"), 1000);
    public int numb = 0;

    public Shop() {
        System.out.println("Одежда в наличии:");
        System.out.println("1-" + shorts.name);
        System.out.println("2-" + cap.name);
    }
    public Cloth getCloth(int selectCloth, Cash cash) {
        if (selectCloth == 1) {
            Cash.balance = Cash.balance - shorts.price;
            return shorts;
        } else if (selectCloth == 2) {
            Cash.balance = Cash.balance - cap.price;
            return cap;}
        else {
            return null;
        }

    }

    public void showColorCloth(Cloth cloth) {
        for (int i = 0; i < cloth.color.size(); i++) {
            System.out.println(" номер цвета " + i + "-" + cloth.color.get(i));
        }

    }
}




