package shelter;

public class VirtualPet {

    private String sonicsDescription;
    private String petName;
    private int sonicsHungerLevel;
    private int tailsHungerLevel;
    private int sallysHungerLevel;
    private int knucklesHungerLevel;
    private int sonicsThirstLevel;
    private int tailsThirstLevel;
    private int sallysThirstLevel;
    private int knucklesThirstLevel;
    private int sonicsBoredomLevel;
    private int tailsBoredomLevel;
    private int sallysBoredomLevel;
    private int knucklesBoredomLevel;
    private String sonicsPal1;
    private String sonicsPal2;
    private String sonicsPal3;

    public String setDescription(String petDescription) {

        this.sonicsDescription = petDescription;

        return sonicsDescription;
    }

    public void feedMe() {
        int feedMe = this.getSonicsHungerLevel();
        int updatedHungerLevel = feedMe - 10;
        this.setSonicsHungerLevel(updatedHungerLevel);
    }

    public void hydration() {
        int hydration = this.getSonicsThirstLevel();
        int updatedThirstLevel = hydration - 10;
        this.setSonicsThirstLevel(updatedThirstLevel);
    }

    public void running() {
        int running = this.getSonicsBoredomLevel();
        int updatedBoredomLevel = running - 10;
        this.setSonicsBoredomLevel(updatedBoredomLevel);
    }

    public String getPetName() {
        return this.petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void tick() {
        // increase this calling object's thirst, hunger, boredom -using getters and
        // setters

        int currentHungerLevel = this.getSonicsHungerLevel();
        this.setSonicsHungerLevel(currentHungerLevel + 1);

        int currentThirstLevel = this.getSonicsThirstLevel();
        this.setSonicsThirstLevel(currentThirstLevel + 1);

        int currentBoredomLevel = this.getSonicsBoredomLevel();
        this.setSonicsBoredomLevel(currentBoredomLevel + 1);
    }

    public String getSonicsPal1() {
        return this.sonicsPal1;
    }

    public void setSonicsPal1(String sonicsPal1) {
        this.sonicsPal1 = sonicsPal1;
    }

    public String getSonicsPal2() {
        return this.sonicsPal2;
    }

    public void setSonicsPal2(String sonicsPal2) {
        this.sonicsPal2 = sonicsPal2;
    }

    public String getSonicsPal3() {
        return this.sonicsPal3;
    }

    public void setSonicsPal3(String sonicsPal3) {
        this.sonicsPal3 = sonicsPal3;
    }

    public String getSonicsDescription() {
        return sonicsDescription;
    }

    public void setSonicsDescription(String sonicsDescription) {
        this.sonicsDescription = sonicsDescription;
    }

    public int getSonicsHungerLevel() {
        return sonicsHungerLevel;
    }

    public void setSonicsHungerLevel(int sonicsHungerLevel) {
        this.sonicsHungerLevel = sonicsHungerLevel;
    }

    public int getTailsHungerLevel() {
        return tailsHungerLevel;
    }

    public void setTailsHungerLevel(int tailsHungerLevel) {
        this.tailsHungerLevel = tailsHungerLevel;
    }

    public int getSallysHungerLevel() {
        return sallysHungerLevel;
    }

    public void setSallysHungerLevel(int sallysHungerLevel) {
        this.sallysHungerLevel = sallysHungerLevel;
    }

    public int getKnucklesHungerLevel() {
        return knucklesHungerLevel;
    }

    public void setKnucklesHungerLevel(int knucklesHungerLevel) {
        this.knucklesHungerLevel = knucklesHungerLevel;
    }

    public int getSonicsThirstLevel() {
        return sonicsThirstLevel;
    }

    public void setSonicsThirstLevel(int sonicThirstLevel) {
        this.sonicsThirstLevel = sonicThirstLevel;
    }

    public int getTailsThirstLevel() {
        return tailsThirstLevel;
    }

    public void setTailsThirstLevel(int tailsThirstLevel) {
        this.tailsThirstLevel = tailsThirstLevel;
    }

    public int getSallysThirstLevel() {
        return sallysThirstLevel;
    }

    public void setSallysThirstLevel(int sallysThirstLevel) {
        this.sallysThirstLevel = sallysThirstLevel;
    }

    public int getKnucklesThirstLevel() {
        return knucklesThirstLevel;
    }

    public void setKnucklesThirstLevel(int knucklesThirstLevel) {
        this.knucklesThirstLevel = knucklesThirstLevel;
    }

    public int getSonicsBoredomLevel() {
        return sonicsBoredomLevel;
    }

    public void setSonicsBoredomLevel(int sonicsBoredomLevel) {
        this.sonicsBoredomLevel = sonicsBoredomLevel;
    }

    public int getTailsBoredomLevel() {
        return tailsBoredomLevel;
    }

    public void setTailsBoredomLevel(int tailsBoredomLevel) {
        this.tailsBoredomLevel = tailsBoredomLevel;
    }

    public int getSallysBoredomLevel() {
        return sallysBoredomLevel;
    }

    public void setSallysBoredomLevel(int sallysBoredomLevel) {
        this.sallysBoredomLevel = sallysBoredomLevel;
    }

    public int getKnucklesBoredomLevel() {
        return knucklesBoredomLevel;
    }

    public void setKnucklesBoredomLevel(int knucklesBoredomLevel) {
        this.knucklesBoredomLevel = knucklesBoredomLevel;
    }
}
