package org.example.matrices;

import java.util.ArrayList;
import java.util.List;

public class NoOfShifts {
    public static void main(String[] args) {
        List<String> strList = new ArrayList();
        strList.add("1010");
        strList.add("0110");
        strList.add("0001");
        System.out.println(find(strList));
    }

    public static int find(List<String> strList) {
        if (strList.size() == 0)
            return -1;
        int noOfCols = strList.get(0).length();
        int minCount = Integer.MAX_VALUE;
        for (int i=0; i<noOfCols; i++) {
            int tempCount = 0;
            for (String row : strList) {
                int noOfShifts = shift(row, i);
                if (noOfShifts == -1)
                    return -1;
                tempCount += noOfShifts;
            }
            minCount = Math.min(minCount, tempCount);
        }
        return minCount;
    }

    public static int shift(String str, int index) {
        if (str.charAt(index) == '1')
            return 0;
        int right = index;
        int left = index;
        for (int i=0; i<str.length(); i++) {
            right++;
            left--;
            if (left < 0)
                left = str.length() - 1;
            if (right > str.length() - 1)
                right = 0;
            if (str.charAt(right) == '1' || str.charAt(left) == '1')
                return i+1;
        }
        return -1;
    }
}
