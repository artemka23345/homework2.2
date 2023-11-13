public class Ravenclaw extends  Hogwarts{
    private int smart;
    private int wise;
    private int creativity;


    public Ravenclaw(String name,int powerOfMagic, int transgressionDistance, int smart, int wise, int creativity) {
        super(name,powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public void description(){
        super.description();
        System.out.println("Ум: " + getSmart() + ", " + "Мудрость: " + getWise() + ", " + "Креативность: " + getCreativity());
    }
    @Override
    public void equalsFaculty(Hogwarts h) {
        if (h instanceof Ravenclaw) {
            Ravenclaw r = (Ravenclaw) h;
            int firstStudent = getSmart() + getWise() + getCreativity();
            int secondStudent = r.getSmart() + r.getWise() + r.getCreativity();
            String msg = "%s  лучший Когтевранец, чем  %s\n";
            if (firstStudent > secondStudent) {
                System.out.printf(msg, getName(), r.getName());
            } else if (firstStudent < secondStudent) {
                System.out.printf(msg, r.getName(), getName());
            } else {
                System.out.println("Студенты равны");
            }
        }else {
            System.out.println("Не верный тип данных");
        }
    }
}
