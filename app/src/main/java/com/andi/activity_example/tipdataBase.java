package com.andi.activity_example;

import java.util.ArrayList;

public class tipdataBase {

    ArrayList<modelTip> data = new ArrayList<>();

    public tipdataBase() {
        data.add(new modelTip("Canade", "Toronto", "andi", "test"));
        data.add(new modelTip("USA", "Washington", "michi", "holidays"));
    }

    public ArrayList<modelTip> getData() {
        return data;
    }
}
