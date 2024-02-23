package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> sonicAndFriends = new HashMap<String, VirtualPet>();

    VirtualPet sonic = new VirtualPet("Sonic", "The blue blur Hedgehog.");
    VirtualPet tails = new VirtualPet("Tails", "Can fly with his tails.");
    VirtualPet amy = new VirtualPet("Amy ", "Is Sonic's girl!");
    VirtualPet blaze = new VirtualPet("Blaze", "The Cat!");

    // adding pets to map
    public void addSonicAndFriends() {
        sonicAndFriends.put(sonic.getPetName(), sonic);
        sonicAndFriends.put(tails.getPetName(), tails);
        sonicAndFriends.put(amy.getPetName(), amy);
        sonicAndFriends.put(blaze.getPetName(), blaze);

    }

    // iterate through pets and display them
    public void allPetStatus(Collection<VirtualPet> pets) {
        System.out.println("\nNAME\t\t|HUNGER\t|THIRST\t|BOREDOM|DESCRIPTION  |");
        System.out.println("------------------------|-------|-------|-------|--------------------|");
        for (VirtualPet pet : pets) {
            System.out.println(pet.getPetName() + "\t\t| " + pet.getPetHungerLevel()
                    + "\t| " + pet.getPetThirstLevel() + "\t| " + pet.getPetBoredomLevel()
                    + "\t| " + pet.getPetDescription() + "\t| ");
        }
        System.out.println("----------------------------------------------------------------------");

    }

    public VirtualPet getSonicAndFriends(String requestedPet) {
        VirtualPet friendsDesc = null;
        for (Map.Entry<String, VirtualPet> sonicAndFriends : sonicAndFriends.entrySet()) {
            String petName = sonicAndFriends.getKey();
            if (requestedPet.equals(petName)) {
                friendsDesc = sonicAndFriends.getValue();

            }
        }
        return friendsDesc;
    }

    public void addPet(VirtualPet petToAdd) {
        sonicAndFriends.put(petToAdd.getPetName(), petToAdd);
    }

    public void adoptPet(VirtualPet petToBeAdopted) {
        sonicAndFriends.remove(petToBeAdopted.getPetName(), petToBeAdopted);
    }

    public VirtualPet findPet(String petName) {
        return sonicAndFriends.get(petName);
    }

    public Collection<VirtualPet> getAllPets() {
        return sonicAndFriends.values();
    }

    public void feedSonicAndFriends() {
        for (Map.Entry<String, VirtualPet> sonicAndFriends : sonicAndFriends.entrySet()) {
            VirtualPet pet = sonicAndFriends.getValue();
            pet.feedMe();
        }
    }

    public void hydrateSonicAndFriends() {
        for (Map.Entry<String, VirtualPet> sonicAndFriends : sonicAndFriends.entrySet()) {
            VirtualPet pet = sonicAndFriends.getValue();
            pet.hydration();
        }
    }

    public void playWithOneFriend(String requestedFriendToPlay) {
        VirtualPet pet = getSonicAndFriends(requestedFriendToPlay);
        pet.running();
    }

    // update tick for all pets
    public void tickAllPets() {
        for (Map.Entry<String, VirtualPet> sonicAndFriends : sonicAndFriends.entrySet()) {
            VirtualPet pet = sonicAndFriends.getValue();
            pet.tick();
        }
    }
}
