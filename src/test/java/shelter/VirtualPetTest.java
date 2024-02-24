package shelter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VirtualPetTest {

    private VirtualPet underTest;

    @BeforeEach
    public void setup() {
        underTest = new VirtualPet("petName", "petDescription");
    }

    @Test
    public void hungerTest() {
        int check = underTest.getPetHungerLevel();
        assertEquals(50, check);

    }

    @Test
    public void thirstTest() {
        int check = underTest.getPetThirstLevel();
        assertEquals(50, check);

    }

    @Test
    public void boredomTest() {
        int check = underTest.getPetBoredomLevel();
        assertEquals(50, check);
    }

    @Test
    public void tickTest1() {
        underTest.tick();
        assertEquals(51, underTest.getPetHungerLevel());
    }

    @Test
    public void tickTest2() {
        underTest.tick();
        assertEquals(51, underTest.getPetThirstLevel());
    }

    @Test
    public void tickTest3() {
        underTest.tick();
        assertEquals(51, underTest.getPetBoredomLevel());
    }
}
