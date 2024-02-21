package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        // create virtual pet object

        Scanner input = new Scanner(System.in);

        VirtualPet sonic = new VirtualPet();
        sonic.setPetName("Sonic The Hedgehog");
        sonic.setPetBoredomLevel(50);
        sonic.setPetHungerLevel(50);
        sonic.setPetThirstLevel(50);
        String petName = sonic.getPetName();
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
        System.out.println("It is great to meet you " + newFriendsName + "!" + " I can't wait to hang out!");
        sonic.getPetDescription();

        while (true) {

            System.out.println("What should we do today?");
            System.out.println(">> [0] Hang out");
            System.out.println(">> [1] Scarf down some chili dogs.");
            System.out.println(">> [2] Chill and have some Vitamin water.");
            System.out.println(">> [3] Quit.");
            System.out.println("My boredom level is: " + sonic.getPetBoredomLevel());
            System.out.println("My thirst level is: " + sonic.getPetThirstLevel());
            System.out.println("My hunger level is: " + sonic.getPetHungerLevel());
            int choice = input.nextInt();

            if (choice == 3) {
                System.out.println("Sorry to see you go!");
                break;
            }
            int minLevel = sonic.getPetBoredomLevel();
            if (minLevel < 0) {
                sonic.setPetBoredomLevel(minLevel + 15);
            }
            int maxLevel = sonic.getPetBoredomLevel();
            if (maxLevel > 100) {
                sonic.setPetBoredomLevel(maxLevel - 15);
            }
            if (choice == 0) {
                sonic.running();
            }
            int minLevel2 = sonic.getPetHungerLevel();
            if (minLevel2 < 0) {
                sonic.setPetHungerLevel(minLevel2 + 15);
            }
            int maxLevel2 = sonic.getPetHungerLevel();
            if (maxLevel2 > 100) {
                sonic.setPetHungerLevel(maxLevel2 - 15);
            }
            if (choice == 1) {
                sonic.feedMe();
            }
            int minLevel3 = sonic.getPetThirstLevel();
            if (minLevel3 < 0) {
                sonic.setPetThirstLevel(minLevel3 + 15);
            }
            int maxLevel3 = sonic.getPetThirstLevel();
            if (maxLevel3 > 100) {
                sonic.setPetThirstLevel(maxLevel3 - 15);

            } else if (choice == 2) {
                sonic.hydration();
            }
            sonic.tick();
        }

        input.close();
    }
}
