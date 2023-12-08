package com.sunil.crudexample.http;

public class Extract {

    public static void main(String[] args) {

//        String str = "(2006-2007)";
        // (2016- )
        // (2015)
        String str = "(II) (2006-2010)";


        str = str.replace("(I)", "");
        str = str.replace("(II)", "");
        str = str.substring(str.indexOf("(")+1, str.indexOf(")"));
        System.out.println(str);
    }
}
