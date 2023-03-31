package day04;

//import fruit.Banana;
//import fruit.Grape;
import fruit.*;
import fruit.warm.PineApple;

import java.util.Scanner;

public class PackagePractice {

    public static void main(String[] args) {

        new fruit.Apple();

        Banana banana = new Banana();
        new Grape();

        new PineApple();

        Scanner sc = new Scanner(System.in);
    }
}
