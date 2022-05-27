package com.tehran.util;

import java.util.Scanner;

public class Input<T> {
    private static Scanner scanner = new Scanner(System.in);

    public static <T> Object getInput(T t) {
        if (t.equals(Integer.class))
            return scanner.nextInt();
        else if (t.equals(String.class))
            return scanner.next();
        else if (t.equals(Double.class))
            return scanner.nextDouble();
        else {
            throw new UnsupportedOperationException();
        }
    }
}
