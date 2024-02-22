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
        VirtualPet sally = new VirtualPet("Sally", "Is Sonic's girl!");
        VirtualPet knuckles = new VirtualPet("Knuckles", "Has a temper!");

        sonicsPlace.addPet(sonic);
        sonicsPlace.addPet(tails);
        sonicsPlace.addPet(sally);
        sonicsPlace.addPet(knuckles);

        System.out.println("Hey there! My name is " + sonic + " What is your name?");
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

        while (true) {

            System.out.println("What should we do today?");
            System.out.println(">> [0] Hang out with one of us");
            System.out.println(">> [1] Scarf down some chili dogs with the group.");
            System.out.println(">> [2] Chill and have some Vitamin water with us.");
            System.out.println(">> [3] Adopt a friend to spend the day with.");
            System.out.println(">> [4] Bring a new friend for us at Sonic's Place.");
            System.out.println(">> [5] Quit.");
            System.out.println("Check out our levels to help you decide what you want to do first.");

            Collection<VirtualPet> collection = sonicsPlace.getAllPets();

            int choice = input.nextInt();

            sonicsPlace.allPetStatus(collection);

            if (choice == 0) {
                System.out.println("Awesome! Who would you like to hang out with today? ");
                boolean pickAFriend = false;

                while (!pickAFriend) {
                    for (VirtualPet pet : collection) {
                        System.out.println("[" + pet.getPetName() + "] " + pet.getPetDescription());
                    }
                    String answer = input.nextLine();
                    VirtualPet currentPet = sonicsPlace.findPet(answer);

                    if (collection.contains(currentPet)) {
                        sonicsPlace.playWith(answer, 2);
                        System.out.println("Thanks for hanging out with " + currentPet.getPetName() + "!");
                        pickAFriend = true;
                    } else if (answer.toLowerCase().equals("quit")) {
                        break;
                    }

                    if (choice == 5) {
                        break;
                    }

                    sonicsPlace.updateAllTick(collection);
                }

                input.close();
            }
        }
    }
}
