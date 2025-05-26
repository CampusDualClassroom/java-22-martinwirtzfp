package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("GKFFD");
        arrayList.add("TNANA");
        arrayList.add("MPMSL");
        arrayList.add("PSWME");
        arrayList.add("LZMLF");
        arrayList.add("JYEBV");
        arrayList.add("YELNT");
        arrayList.add("JSNKR");
        arrayList.add("JFESF");
        arrayList.add("TMJLL");
        return arrayList;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (String element: customList){
            System.out.println(element);
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
     return customList.add(element);
    }

    public static void main(String[] args) {
        List<String> list = createArrayList();
        addElementToList(list, "AAAAA");
        printElementsAndIndex(list);
    }


}
