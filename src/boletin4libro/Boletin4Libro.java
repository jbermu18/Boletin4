package boletin4libro;

import java.util.Scanner;

public class Boletin4Libro {
    public Boletin4Libro() {
    }

    public static void main(String[] args) {
        Libro obxLib = new Libro();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el titulo del libro: ");
        String tit = sc.next();
        System.out.println("Introduce el autor del libro: ");
        String aut = sc.next();
        System.out.println("Introduce el año del libro: ");
        int an = sc.nextInt();
        System.out.println("Introduce la valoración del libro: ");
        float val = sc.nextFloat();
        obxLib.amosar(tit, aut, an, val);
    }
}
