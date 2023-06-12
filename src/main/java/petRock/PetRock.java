package petRock;

import petRock.rocks.Rock;

public class PetRock {

    public static void main(String[] args) {
        run();
    }

    public static void run(){
        Startup.openingMessage();
        Rock rock = new Rock();

        String gender = Startup.identifyRockGender();
        String name = Startup.identifyRockName(gender);

        rock.setGender(gender);
        rock.setName(name);
        Startup.start(rock);

        OptionsMenu.handleMenuOptions(rock);
    }
}
