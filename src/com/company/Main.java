package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        NumberUtils NUtils = new NumberUtils();
        int FROM = 1, TO = 100;
        for ( int i = FROM; i <= (TO); i++ ){
            System.out.println(NUtils.getConvertedString(i));
        }
    }
}
