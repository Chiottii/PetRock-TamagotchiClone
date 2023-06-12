package petRock;

import petRock.rocks.Rock;

import java.util.Scanner;

public class Startup {

    private static Scanner scanner = new Scanner(System.in);
    private String rockName;


    public static void openingMessage() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Congrats on your adoption of a new pet rock!");
        System.out.println("You two will have so much fun together!");
        System.out.println("----------------------------------------------");
    }

    public static String identifyRockGender() {
        System.out.println("Lets start by identifying your new friend.");
        System.out.println("Is your pet rock a boy or a girl?");

        String genderOption = "";
        boolean valid = false;
        while (!valid) {
            String selectedGenderOption = scanner.nextLine().toLowerCase();
            if (selectedGenderOption.equals("boy") || selectedGenderOption.equals("girl")) {
                valid = true;
                genderOption = selectedGenderOption;
            } else {
                System.out.println("Try again.");
            }
        }
        return genderOption;
    }

    public static String identifyRockName(String gender) {
        if (gender.equals("boy")) {
            System.out.println("What is his name?");
        } else if (gender.equals("girl")) {
            System.out.println("What is her name?");
        }
        String name = scanner.nextLine();
        return name;
    }

    public static void start(Rock rock){
        System.out.println();
        System.out.println("It is always exciting adopting a new pet. However, it is also a huge responsibility... As we all know, rocks are very high maintenance.");

        if (rock.getGender().equals("boy")) {
            System.out.println("It is important to make sure you keep " + rock.getName() + " happy. If " + rock.getName() + " becomes too unhappy, he might run away.");
        }
        if (rock.getGender().equals("girl")) {
            System.out.println("It is important to make sure you keep " + rock.getName() + " happy. If " + rock.getName() + " becomes too unhappy, she might run away.");
        }

        boolean pause = false;
        while (!pause) {
            System.out.println("Press enter to continue.");
            String proceed = scanner.nextLine();
            pause = true;
        }

        System.out.println("...");
        System.out.println("But you knew that already! Anybody that's adopting a new rock always knows the amount of attention and time that it requires.");
        System.out.println("Good Luck!");

        boolean valid = false;
        while (!valid) {
            System.out.println("Press enter to continue.");
            String proceed = scanner.nextLine();
            valid = true;
        }
    }



}
