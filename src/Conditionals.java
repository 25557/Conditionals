 import java.util.Scanner;

    public class Conditionals {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Wat is je leeftijd?");
            int leeftijd = scan.nextInt();

            if (leeftijd < 18) {
                System.out.println("Je mag nog geen alcohol ");
            } else {
                System.out.println("Je bent oud genoeg");
            }
        }
    }









//
//        public static void main(String[] args)  {
//            Boolean teacherTalks = false;
//            if (teacherTalks == true) {
//                System.out.println("Ok, teacher talks");
//            } else {
//                System.out.println("Teacher does not talk");
//            }
//  }
//    }
