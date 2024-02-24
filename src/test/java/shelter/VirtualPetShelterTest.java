package shelter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VirtualPetShelterTest {

    private VirtualPetShelter sonicsPlace;

    private VirtualPet sonic;

    @BeforeEach
    public void Setup() {
        sonicsPlace = new VirtualPetShelter();

        sonic = new VirtualPet("Sonic", "The blue blur Hedgehog.");
        VirtualPet tails = new VirtualPet("Tails", "Can fly with his tails.");
        VirtualPet amy = new VirtualPet("Amy ", "Is Sonic's girl!");
        VirtualPet blaze = new VirtualPet("Blaze", "The Cat!");

        // adding pets to map
        sonicsPlace.addPet(sonic);
        sonicsPlace.addPet(tails);
        sonicsPlace.addPet(amy);
        sonicsPlace.addPet(blaze);
    }

    @Test
    public void hungerTest() {
        sonicsPlace.feedSonicAndFriends();

        for (Map.Entry<String, VirtualPet> entry : sonicsPlace.sonicAndFriends.entrySet()) {
            assertEquals(40, entry.getValue().getPetHungerLevel());
        }
    }

    @Test
    public void thirstTest() {
        sonicsPlace.hydrateSonicAndFriends();

        for (Map.Entry<String, VirtualPet> entry : sonicsPlace.sonicAndFriends.entrySet()) {
            assertEquals(40, entry.getValue().getPetThirstLevel());
        }

    }

    @Test
    public void boredomTest() {
        String petName = "sonic";
        sonicsPlace.playWithOneFriend(petName);

        for (Map.Entry<String, VirtualPet> entry : sonicsPlace.sonicAndFriends.entrySet()) {

            if (petName.equals(entry.getKey())) {
                assertEquals(40, entry.getValue().getPetBoredomLevel());
            } else {
                assertEquals(50, entry.getValue().getPetBoredomLevel());

            }
        }
    }

    @Test
    public void tickTest1() {

        Collection<VirtualPet> collection = sonicsPlace.getAllPets();
        sonicsPlace.updateAllTick(collection);

        for (Map.Entry<String, VirtualPet> entry : sonicsPlace.sonicAndFriends.entrySet()) {
            assertEquals(51, entry.getValue().getPetHungerLevel());
            assertEquals(51, entry.getValue().getPetThirstLevel());
            assertEquals(51, entry.getValue().getPetBoredomLevel());
        }

    }

    @Test
    public void testAdopt() {

        sonicsPlace.adoptPet(sonic);

        assertEquals(3, sonicsPlace.sonicAndFriends.size());

    }

    @Test
    public void testAdd() {

        VirtualPet testPet = new VirtualPet("test", "test");
        sonicsPlace.addPet(testPet);

        assertEquals(5, sonicsPlace.sonicAndFriends.size());
    }
}
