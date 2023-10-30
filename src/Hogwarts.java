public class Hogwarts {
    private int powerOfMagic;
    private int transgressionDistance;
    private String name;


    public Hogwarts(String name,int powerOfMagic, int transgressionDistance) {
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
        this.name = name;
    }
    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void description(){
        System.out.println("Имя: " + getName() +", " + "Мощность магии: " + + getPowerOfMagic() +", "+
                "Расстояние трансгресии: " + getTransgressionDistance());
    }

    public void equalsHogwarts(Hogwarts h) {
        int firstStudent = this.getPowerOfMagic() + this.getTransgressionDistance();;
        int secondStudent = h.getPowerOfMagic() + h.getTransgressionDistance();;
        String msg = "%s обладает бОльшей мощностью магии, чем %s\n";
        if (firstStudent > secondStudent) {
            System.out.printf(msg,getName(),h.getName());
        } else if (firstStudent < secondStudent) {
            System.out.printf(msg,h.getName(),getName());
        }else {
            System.out.println("По мощности магии оба студента равны");
        }
    }
    public void equalsFaculty(Hogwarts h) {
    }
}
