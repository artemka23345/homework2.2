public class Slytherin extends  Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;


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
        if (h instanceof Ravenclaw) {
            Slytherin s = (Slytherin) h;
            int firstStudent = getCunning() + getDetermination() + getAmbition() + getResourcefulness() + getThirstForPower();
            int secondStudent = s.getCunning() + s.getDetermination() + s.getAmbition() + s.getResourcefulness() + s.getThirstForPower();
            String msg = "%s  лучший Слицеринец, чем  %s\n";
            if (firstStudent > secondStudent) {
                System.out.printf(msg, getName(), s.getName());
            } else if (firstStudent < secondStudent) {
                System.out.printf(msg, s.getName(), getName());
            } else {
                System.out.println("Студенты равны");
            }
        }else {
            System.out.println("Не верный тип данных");
        }
    }

    }

