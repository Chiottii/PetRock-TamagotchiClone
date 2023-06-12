package petRock;

import petRock.rocks.Rock;

import java.util.Scanner;

public class OptionsMenu {

    private static Scanner scanner = new Scanner(System.in);

    public static String getMainOptionsMenu(Rock rock) {
        System.out.println();
        System.out.println("What would you like to do with " + rock.getName() + "?");
        System.out.println();
        System.out.println("(1) Get Mood");
        System.out.println("(2) Pass Time");
        System.out.println("(3) Pet");
        System.out.println("(4) Walk");
        System.out.println("(5) Feed");
        System.out.println("(6) Clean");
        System.out.println();
        System.out.println("Please select an option: ");

        String selectedOption = "";
        boolean valid = false;
        while(!valid) {
            selectedOption = scanner.nextLine().trim();
            if (selectedOption.equals("1")) {
                valid = true;
                selectedOption = "Get Mood";
            } else if (selectedOption.equals("2")) {
                valid = true;
                selectedOption = "Pass Time";
            } else if (selectedOption.equals("3")) {
                valid = true;
                selectedOption = "Pet";
            } else if (selectedOption.equals("4")) {
                valid = true;
                selectedOption = "Walk";
            } else if (selectedOption.equals("5")) {
                valid = true;
                selectedOption = "Feed";
            } else if (selectedOption.equals("6")) {
                valid = true;
                selectedOption = "Clean";
            } else {
                System.out.println("Try again.");
            }
        }
        return selectedOption;
    }

    public static void handleMenuOptions(Rock rock){

        boolean stay = true;
        do {

            String choice = OptionsMenu.getMainOptionsMenu(rock);
            if (choice.equals("Get Mood")) {
                System.out.println(rock.getName() + " is " + rock.getMood() + ".");
            }
            if (choice.equals("Pass Time")) {
                rock.passTime();
                System.out.println("test: Hungriness: " + rock.getHungriness() + " cleanliness: " + rock.getCleanliness() + " tiredness: " + rock.getTiredness() + " happiness: " + rock.getHappiness());
            }
            if (choice.equals("Pet")) {
                rock.pet();
            }
            if (choice.equals("Walk")) {
                rock.walk();
            }
            if (choice.equals("Feed")) {
                rock.feed();
            }
            if (choice.equals("Clean")) {
                rock.clean();
            }

        } while (stay);
    }

}
