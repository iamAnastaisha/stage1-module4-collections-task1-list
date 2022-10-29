package com.epam.mjc.collections.list;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        if (5 * Math.pow(Integer.parseInt(a), 2) + 3 > 5 * Math.pow(Integer.parseInt(b), 2) + 3) {
            return 1;
        } else if (5 * Math.pow(Integer.parseInt(a), 2) + 3 < 5 * Math.pow(Integer.parseInt(b), 2) + 3) {
            return -1;
        } else {
            if (Integer.parseInt(a) >= Integer.parseInt(b)) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
