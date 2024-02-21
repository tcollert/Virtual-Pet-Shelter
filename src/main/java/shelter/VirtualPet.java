package shelter;

public class VirtualPet {

    private String petDescription;
    private String petName;
    private int petHungerLevel;
    private int petThirstLevel;
    private int petBoredomLevel;

    public void sonicDescription() {
        String sonicDescription = petDescription;
        sonicDescription(this.getPetDescription);
        this.setPetDescription("little blue lightening bolt");

    }

    public void feedMe() {
        int feedMe = this.getPetHungerLevel();
        int updatedHungerLevel = feedMe - 10;
        this.setPetHungerLevel(updatedHungerLevel);
    }

    public void hydration() {
        int hydration = this.getPetThirstLevel();
        int updatedThirstLevel = hydration - 10;
        this.setPetThirstLevel(updatedThirstLevel);
    }

    public void running() {
        int running = this.getPetBoredomLevel();
        int updatedBoredomLevel = running - 10;
        this.setPetBoredomLevel(updatedBoredomLevel);
    }

    public String getPetName() {
        return this.petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetHungerLevel() {
        return this.petHungerLevel;
    }

    public void setPetHungerLevel(int petHungerLevel) {
        this.petHungerLevel = petHungerLevel;
    }

    public int getPetThirstLevel() {
        return this.petThirstLevel;
    }

    public void setPetThirstLevel(int petThirstLevel) {
        this.petThirstLevel = petThirstLevel;
    }

    public int getPetBoredomLevel() {
        return this.petBoredomLevel;
    }

    public void setPetBoredomLevel(int petBoredomLevel) {
        this.petBoredomLevel = petBoredomLevel;
    }

    public String getPetDescription() {
        return this.petDescription;
    }

    public void setPetDescription(String petDescription) {
        this.petDescription = petDescription;
    }

    public void tick() {
        // increase this calling object's thirst, hunger, boredom -using getters and
        // setters

        int currentHungerLevel = this.getPetHungerLevel();
        this.setPetHungerLevel(currentHungerLevel + 1);

        int currentThirstLevel = this.getPetThirstLevel();
        this.setPetThirstLevel(currentThirstLevel + 1);

        int currentBoredomLevel = this.getPetBoredomLevel();
        this.setPetBoredomLevel(currentBoredomLevel + 1);
    }
}
