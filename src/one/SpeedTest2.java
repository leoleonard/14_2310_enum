package one;

import java.util.Arrays;
import java.util.Scanner;


public class SpeedTest2 {
    public static void main(String[] args) {
        Speed[] values = Speed.values();
        String valueAsString = Arrays.toString(values);
        System.out.println(valueAsString);

        System.out.println("Podaj wartość");
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Speed speed = Speed.valueOf(line);

        System.out.println("Wartość to " + speed + ", prędkość " + speed.getKmh() + "km/h");
    }
}
