package shelter;

import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        // create virtual pet object

        Scanner input = new Scanner(System.in);

        VirtualPetShelter sonicsPlace = new VirtualPetShelter();

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
        System.out.println("Let me introduce you to my friends." + sonicsPlace.sonicAndFriends.values());

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
                System.out.println(sonicsPlace.sonicAndFriends.values());
                String answer = input.nextLine();
                String petToPlayWith = answer;
                sonicsPlace.playWithOneFriend(petToPlayWith);
                System.out.println("You played with " + petToPlayWith);
                VirtualPet currentPet = sonicsPlace.findPet(answer);
                System.out.println("Thanks for hanging with " + currentPet + "!");
            }

            else if (choice == 1) {
                sonicsPlace.feedSonicAndFriends();
                System.out.println("Thanks for feeding me and my friends");

            } else if (choice == 2) {
                sonicsPlace.hydrateSonicAndFriends();
                System.out.println("That was refreshing! Thanks!");

            } else if (choice == 3) {
                System.out.println("Which friend would you like to adopt?");
                System.out.println(sonicsPlace.sonicAndFriends.values());
                String answer = input.nextLine();
                String friendToBeAdopted = answer;
                sonicsPlace.sonicAndFriends.remove(friendToBeAdopted);
                System.out.println(friendToBeAdopted + " has been adopted!");

            } else if (choice == 4) {
                String answer = input.nextLine();
                String friendNameToBeAdded = answer;
                System.out.println("Please choose a name for our new friend...");
                String newPetName = input.nextLine();
                System.out.println("Please give a brief description of our new friend...");
                String friendDescription = input.nextLine();
                sonicsPlace.addPet(new VirtualPet.Builder().name(newPetName).description(friendDescription).build());
                System.out.println(sonicsPlace.findPet(newPetName).getPetName() + ", welcome to the family!");

                VirtualPet petToBeAdded = sonicsPlace.addPetaddPet(VirtualPet);
                sonicsPlace.addPet(petToBeAdded);

            } else if (choice == 5) {
                break;
            }

            sonicsPlace.tickAllPets();
        }

        input.close();
    }
}
