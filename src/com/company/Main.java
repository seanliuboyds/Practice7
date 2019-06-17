package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here\
        String [] helloReplace = {"w", "t", "y", "h", "k"};
        for (int i = 0; i < helloReplace.length; i++) {
            if (helloReplace[i] == "t") {
                helloReplace[i] = "hello";
            }
            System.out.print(", " + helloReplace[i]);
        }
    }
}
