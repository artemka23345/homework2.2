public class Gryffindor extends  Hogwarts{
    int nobility;
    int honor;
    int courage;


    public Gryffindor(String name,int powerOfMagic, int transgressionDistance, int nobility, int honor, int courage) {
        super(name,powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public void description(){
       super.description();
        System.out.println("Благородство: " + getNobility() + ", " + "Честь: " + getHonor() + ", " + "Храбрость: " + getCourage());
    }
    @Override
    public void equalsFaculty(Hogwarts h) {//TODO
    }

}
