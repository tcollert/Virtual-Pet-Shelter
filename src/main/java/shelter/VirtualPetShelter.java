package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> sonicAndFriends = new HashMap<String, VirtualPet>();

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

    public void addPet(VirtualPet pet) {
        sonicAndFriends.put(pet.getPetName(), pet);
    }

    public VirtualPet findPet(String petName) {
        return sonicAndFriends.get(petName);
    }

    public Collection<VirtualPet> getAllPets() {
        return sonicAndFriends.values();
    }

    public void adoptPet(VirtualPet pet) {
        sonicAndFriends.remove(pet.getPetName(), pet);
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
    public void updateAllTick(Collection<VirtualPet> pets) {
        for (VirtualPet pet : pets) {
            pet.tick();
        }

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
}
