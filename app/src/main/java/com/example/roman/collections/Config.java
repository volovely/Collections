package com.example.roman.collections;

import java.util.ArrayList;

/**
 * Created by Roman on 14.09.2016.
 */
public class Config {
    public final static String[] lNames = {"Volovelskiy", "Vasilenko", "Gorobey"};
    public final static String[] fNames = {"Roman", "Vladislav", "Artem"};
    public final static String[] photos = {"http://minionomaniya.ru/wp-content/uploads/2015/10/%D0%BC%D0%B8%D0%BD%D1%8C%D0%BE%D0%BD%D1%8B-%D0%BA%D0%B0%D1%80%D1%82%D0%B8%D0%BD%D0%BA%D0%B8-%D0%B2-%D1%85%D0%BE%D1%80%D0%BE%D1%88%D0%B5%D0%BC-%D0%BA%D0%B0%D1%87%D0%B5%D1%81%D1%82%D0%B2%D0%B5.jpg",
                                            "http://minionomaniya.ru/wp-content/uploads/2016/01/miniony_kartinki_na_rabochi_stol_1920x1080.jpg",
                                            "https://pp.vk.me/c4384/g37962418/a_86cad53d.jpg"};

    public ArrayList getPersonData(){
        ArrayList arrayList = new ArrayList();
        for(int i = 0; i < fNames.length; i++){
            arrayList.add(new Person(fNames[i], photos[i], lNames[i]));
        }
        return arrayList;
    }
}
