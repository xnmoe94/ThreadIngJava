package com.ListHelper;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ListHelper listHelper = new ListHelper();
        listHelper.add("pear");
        listHelper.add("Apple");
        listHelper.add("Bannana");

        listHelper.addIfNoDuplicate("pear");
        listHelper.printContent();
        System.out.println(".........................");

        listHelper.sort();
        listHelper.printContent();
    }
}
