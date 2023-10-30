public class Slytherin extends  Hogwarts {
    int cunning;
    int determination;
    int ambition;
    int resourcefulness;
    int thirstForPower;


    public Slytherin(String name, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

   @Override
    public void description() {
        super.description();
        System.out.println("Хитрость: " + getCunning() + ", " + "Решительность: " + getDetermination() +
                ", " + "Амбициозность: " + getAmbition() + " " + "Находчивость: " + getResourcefulness() +
                " " + "Жажда власти: " + getThirstForPower());

    }
    @Override
    public void equalsFaculty(Hogwarts h) {
        Slytherin s = (Slytherin) h;

    }
}
