//package one;
//
//import javax.security.sasl.SaslClient;
//import java.util.Scanner;
//
//import static one.Speed.*;
//import static one.Speed.FAST;
//import static one.Speed.NORMAL;
//import static one.Speed.SLOW;
//
//public class SpeedTest {
//    public static void main(String[] args) {
//        Speed speedLimitLow = SLOW;
//        Speed speedLimitNormal = NORMAL;
//        Speed speedLimitHigh = FAST;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Dostępne prędkości");
//        System.out.println(speedLimitLow);
//        System.out.println(speedLimitNormal);
//        System.out.println(speedLimitLow);
//        System.out.println("Wybierz prędkość");
//
//        String userChoice = scanner.nextLine();
//
//        Speed[] speeds = values();
//        for(Speed speed:speeds) {
//            System.out.println(speed);
//        }
//
//        Speed speed = Speed.FAST;
//
//        switch (speed) {
//            case SLOW:
//            System.out.println("Poruszasz się z prędkością " + speedLimitLow + ", która wynosi ");
//            case NORMAL:
//                System.out.println("Poruszasz się z prędkością " + speedLimitLow + ", która wynosi ");
//                break;
//            case FAST:
//                System.out.println("Poruszasz się z prędkością " + speedLimitLow + ", która wynosi ");
//                break;
//                default:
//                    System.out.println("Podano złą wartość");
//        }
//    }
//}
