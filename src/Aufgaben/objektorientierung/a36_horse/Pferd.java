package aufgaben.objektorientierung.a36_horse;

public class Pferd {

    String name;
    String race;
    int age;
    double height;
    String gender;
    Color color;
    Sattel sattel;
    Halfter halfter;

    public Pferd(String name, String race, int age,double height, String gender, Color color, Sattel sattel, Halfter halfter) {
        setName(name);
        setRace(race);
        setAge(age);
        setHeight(height);
        setGender(gender);
        setColor(color);
        setSattel(sattel);
        setHalfter(halfter);
    }

    public Pferd(String name, String race, int age, double height, String gender, Color color) {
        setName(name);
        setRace(race);
        setAge(age);
        setHeight(height);
        setGender(gender);
        setColor(color);
    }

    @Override
    public String toString(){
        String output= "Pferd:\n";
        output += String.format("Name: %s\n", getName());
        output += String.format("Rasse: %s\n", getRace());
        output += String.format("Alter %s\n", getAge());
        output += String.format("Stockmaß: %s\n", getHeight());
        output += String.format("Geschlecht: %s\n", getGender());
        if (color != null){
            output += String.format("%s", getColor());
        }
        if (sattel != null){
            output += String.format("_____________________\n%s", getSattel());
        }
        if (halfter != null){
            output += String.format("_____________________\n%s", getHalfter());
        }
        output += String.format("_____________________\n%s", getSattel());
        output += String.format("");
        output += String.format("");


        return output;
    }


    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Sattel getSattel() {
        return sattel;
    }

    public void setSattel(Sattel sattel) {
        this.sattel = sattel;
    }

    public Halfter getHalfter() {
        return halfter;
    }

    public void setHalfter(Halfter halfter) {
        this.halfter = halfter;
    }
}
