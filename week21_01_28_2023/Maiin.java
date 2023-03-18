package week21_01_28_2023;

import java.awt.*;
import java.util.Scanner;

public class Maiin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Color color = new Color(in.nextInt(), in.nextInt(), in.nextInt());
        System.out.println(color.toString());

    }
}
