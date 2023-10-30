public class Hufflepuff extends  Hogwarts{
    int hardworking;
    int loyal;
    int honor;


    public Hufflepuff(String name,int powerOfMagic, int transgressionDistance,  int hardworking, int loyal, int honor) {
        super(name,powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honor = honor;
    }
    @Override
    public void description(){}

    @Override
    public void equalsFaculty(Hogwarts h) {

    }
}
