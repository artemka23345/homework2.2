public class Ravenclaw extends  Hogwarts{
    int smart;
    int wise;
    int creativity;


    public Ravenclaw(String name,int powerOfMagic, int transgressionDistance, int smart, int wise, int creativity) {
        super(name,powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.creativity = creativity;
    }
    @Override
    public void description(){

    }
}
