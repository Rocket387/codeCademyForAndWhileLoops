package org.example;

import java.util.ArrayList;

public class whileRemoval {

    public static void main(String[] args) {

        ArrayList<Integer> lst = new ArrayList<Integer>();
        lst.add(45);
        lst.add(4);
        lst.add(5);
        lst.add(54);
        lst.add(13);
        lst.add(2);
        lst.add(90);

        int i = 0;

        while (i < lst.size()) {
            if(lst.get(i) %2 != 0) {
                lst.remove(i);
                System.out.println(lst);
            } else {
                i++;
            }
        }
    }
}
