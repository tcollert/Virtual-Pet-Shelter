package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        // create virtual pet object

        Scanner input = new Scanner(System.in);

        VirtualPetShelter sonicsPlace = new VirtualPetShelter();
        VirtualPet sonic = new VirtualPet();

        sonic.setSonicsPal1("Tails");
        sonic.setSonicsPal2("Sally");
        sonic.setSonicsPal3("Knuckles");
        sonic.setPetName("Sonic The Hedgehog");
        sonic.setSonicsBoredomLevel(50);
        sonic.setSonicsHungerLevel(50);
        sonic.setSonicsThirstLevel(50);

        sonicsPlace.sonicAndFriends.add("Sonic");
        sonicsPlace.sonicAndFriends.add("Tails");
        sonicsPlace.sonicAndFriends.add("Sally");
        sonicsPlace.sonicAndFriends.add("Knuckles");

        String petName = sonic.getPetName();
        String sonicsPal1 = sonic.getSonicsPal1();
        String sonicsPal2 = sonic.getSonicsPal2();
        String sonicsPal3 = sonic.getSonicsPal3();

        System.out.println("Hey there! My name is " + petName + " What is your name?");
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
        sonic.setSonicsDescription("Fun fact, my friends call me the blue blur. I am super fast and super blue!");
        System.out.println(sonic.getSonicsDescription());
        System.out.println(newFriendsName + ", I would like you to meet my friends. They are: " + sonicsPal1
                + sonicsPal2 + sonicsPal3);

        while (true) {

            System.out.println("What should we do today?");
            System.out.println(">> [0] Hang out with one of us");
            System.out.println(">> [1] Scarf down some chili dogs with the group.");
            System.out.println(">> [2] Chill and have some Vitamin water with us.");
            System.out.println(">> [3] Adopt a friend to spend the day with.");
            System.out.println(">> [4] Bring a new friend for us at Sonic's Place.");
            System.out.println(">> [5] Quit.");
            System.out.println("Check out our levels to help you decide what you want to do first.");
            System.out.println("Sonic's boredom level is: " + sonic.getSonicsBoredomLevel());
            System.out.println("Sonic's thirst level is: " + sonic.getSonicsThirstLevel());
            System.out.println("Sonic's hunger level is: " + sonic.getSonicsHungerLevel());
            int choice = input.nextInt();

            if (choice == 3) {
                System.out.println("Sorry to see you go!");
                break;
            }
            int minLevel = sonic.getSonicsBoredomLevel();
            if (minLevel < 0) {
                sonic.setSonicsBoredomLevel(minLevel + 15);
            }
            int maxLevel = sonic.getSonicsBoredomLevel();
            if (maxLevel > 100) {
                sonic.setSonicsBoredomLevel(maxLevel - 15);
            }
            if (choice == 0) {
                sonic.running();
            }
            int minLevel2 = sonic.getSonicsHungerLevel();
            if (minLevel2 < 0) {
                sonic.setSonicsHungerLevel(minLevel2 + 15);
            }
            int maxLevel2 = sonic.getSonicsHungerLevel();
            if (maxLevel2 > 100) {
                sonic.setSonicsHungerLevel(maxLevel2 - 15);
            }
            if (choice == 1) {
                sonic.feedMe();
            }
            int minLevel3 = sonic.getSonicsThirstLevel();
            if (minLevel3 < 0) {
                sonic.setSonicsThirstLevel(minLevel3 + 15);
            }
            int maxLevel3 = sonic.getSonicsThirstLevel();
            if (maxLevel3 > 100) {
                sonic.setSonicsThirstLevel(maxLevel3 - 15);

            } else if (choice == 2) {
                sonic.hydration();
            }
            sonic.tick();
        }

        input.close();
    }
}
