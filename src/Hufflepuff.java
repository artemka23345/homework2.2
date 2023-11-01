public class Hufflepuff extends Hogwarts {
    int hardworking;
    int loyal;
    int honor;


    public Hufflepuff(String name, int powerOfMagic, int transgressionDistance, int hardworking, int loyal, int honor) {
        super(name, powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honor = honor;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Трудолюбие: " + getHardworking() + ", " + "Лояльность: " + getLoyal() + ", " + "Честь: " + getHonor());
    }

    @Override
    public void equalsFaculty(Hogwarts h) {
        if (h instanceof Hufflepuff) {
            Hufflepuff g = (Hufflepuff) h;
            int firstStudent = getHardworking() + getLoyal() + getHonor();
            int secondStudent = g.getHardworking() + g.getLoyal() + g.getHonor();
            String msg = "%s  лучший Пуффендуец, чем  %s\n";
            if (firstStudent > secondStudent) {
                System.out.printf(msg, getName(), g.getName());
            } else if (firstStudent < secondStudent) {
                System.out.printf(msg, g.getName(), getName());
            } else {
                System.out.println("Студенты равны");
            }
        } else {
            System.out.println("Не верный тип данных");
        }
    }
}

