package shelter;

import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        // create virtual pet object

        Scanner input = new Scanner(System.in);

        VirtualPetShelter sonicsPlace = new VirtualPetShelter();

        VirtualPet sonic = new VirtualPet("Sonic", "The blue blur Hedgehog.");
        VirtualPet tails = new VirtualPet("Tails", "Can fly with his tails.");
        VirtualPet amy = new VirtualPet("Amy ", "Is Sonic's girl!");
        VirtualPet blaze = new VirtualPet("Blaze", "The Cat!");

        // adding pets to map
        sonicsPlace.addPet(sonic);
        sonicsPlace.addPet(tails);
        sonicsPlace.addPet(amy);
        sonicsPlace.addPet(blaze);

        Collection<VirtualPet> collection = sonicsPlace.getAllPets();

        System.out.println("Hey there! My name is Sonic. What is your name?");
        System.out.println("                     _.-*'\"      \"`*-._                   \r\n" + //
                "                _.-*'                  `*-._              \r\n" + //
                "             .-'                            `-.           \r\n" + //
                "  /`-.    .-'                  _.              `-.        \r\n" + //
                " :    `..'                  .-'_ .                `.      \r\n" + //
                " |    .'                 .-'_.' \\ .                 \\     \r\n" + //
                " |   /                 .' .*     ;               .-'\"     \r\n" + //
                " :   L                    `.     | ;          .-'         \r\n" + //
                "  \\.' `*.          .-*\"*-.  `.   ; |        .'            \r\n" + //
                "  /      \\        '       `.  `-'  ;      .'              \r\n" + //
                " : .'\"`.  .       .-*'`*-.  \\     .      (_               \r\n" + //
                " |              .'        \\  .             `*-.           \r\n" + //
                " |.     .      /           ;                   `-.        \r\n" + //
                " :    db      '       d$b  |                      `-.     \r\n" + //
                " .   :PT;.   '       :P\"T; :                         `.   \r\n" + //
                " :   :bd;   '        :b_d; :                           \\  \r\n" + //
                " |   :$$; `'         :$$$; |                            \\ \r\n" + //
                " |    TP              T$P  '                             ;\r\n" + //
                " :                        /.-*'\"`.                       |\r\n" + //
                ".sdP^T$bs.               /'       \\                       \r\n" + //
                "$$$._.$$$$b.--._      _.'   .--.   ;                      \r\n" + //
                "`*$$$$$$P*'     `*--*'     '  / \\  :                      \r\n" + //
                "   \\                        .'   ; ;                \r\n" + //
                "    `.                  _.-'    ' /                       \r\n" + //
                "      `*-.                      .'                        \r\n" + //
                "          `*-._            _.-*'                          \r\n" + //
                "               `*=--..--=*'");

        String newFriendsName = input.nextLine();
        System.out.println(
                "It is great to meet you " + newFriendsName + "!" + " My friends and I cannot wait to hang out!");
        System.out.println("Let me introduce you to my friends." + sonicsPlace.getSonicAndFriends());

        boolean keepPlaying = true;

        while (true) {

            System.out.println("What should we do today?");
            System.out.println(">> [0] Hang out with one of us");
            System.out.println(">> [1] Scarf down some chili dogs with the group.");
            System.out.println(">> [2] Chill and have some Vitamin water with us.");
            System.out.println(">> [3] Adopt a friend to spend the day with.");
            System.out.println(">> [4] Bring a new friend for us at Sonic's Place.");
            System.out.println(">> [5] quit");

            int choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Awesome! Who would you like to hang out with today? ");
                System.out.println(sonicsPlace.getSonicAndFriends());
                input.nextLine();
                String answer = input.nextLine();
                String pet = answer;
                sonicsPlace.playWithOneFriend(pet);
                System.out.println("You played with " + pet);
            }

            if (choice == 1) {
                sonicsPlace.feedSonicAndFriends();

            } else if (choice == 2) {
                sonicsPlace.hydrateSonicAndFriends();

            } else if (choice == 3) {
                System.out.println("Which friend would you like to adopt?");
                System.out.println(sonicsPlace.getSonicAndFriends());
                input.nextLine();
                String answer = input.nextLine();
                String friendToBeAdopted = answer;
                sonicsPlace.sonicAndFriends.remove(friendToBeAdopted);
                System.out.println(friendToBeAdopted + " has been adopted!");

            } else if (choice == 4) {
                System.out.println("Please choose a name for our new friend...");
                input.nextLine();
                String newPetName = input.nextLine();
                System.out.println("Please give a brief description of our new friend...");
                String friendDescription = input.nextLine();
                sonicsPlace.addPet(new VirtualPet(newPetName, friendDescription));
                System.out.println("Thanks for bringing us a new friend!");
            }

            if (keepPlaying == false) {
                break;
            }
            sonicsPlace.allPetStatus(collection);
            sonicsPlace.updateAllTick(collection);
        }

        input.close();
    }
}
