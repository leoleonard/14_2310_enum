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
        String lineUppercase = line.toUpperCase();

        Speed choosenSpeed = null;
        try {
            choosenSpeed = Speed.valueOf(lineUppercase);
        } catch (IllegalArgumentException e) {
            for (Speed speed : values) {
                if (speed.getTranslation().equalsIgnoreCase(line)) {
                    choosenSpeed = speed;
                }
            }
        }
        if (choosenSpeed != null) {
            System.out.println("Wartość to " + choosenSpeed + ", prędkość " + choosenSpeed.getKmh() + "km/h");
        } else {
            System.out.println("Nie znaleziono");
        }
    }
}
