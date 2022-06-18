public class Slytherin extends Hogwarts {
    private int guile;
    private int determination;
    private int ambitiousness;
    private int resourceulness;
    private int lustForPower;

    public Slytherin(String name, int powerOFWitchcraft, int transgressionDistance, int guile, int determination, int ambitiousness, int resourceulness, int lustForPower) {
        super(name, powerOFWitchcraft, transgressionDistance);
        this.guile = guile;
        this.determination = determination;
        this.ambitiousness = ambitiousness;
        this.resourceulness = resourceulness;
        this.lustForPower = lustForPower;
    }

    public int getGuile() {
        return guile;
    }

    public void setGuile(int guile) {
        this.guile = guile;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public void setAmbitiousness(int ambitiousness) {
        this.ambitiousness = ambitiousness;
    }

    public int getResourceulness() {
        return resourceulness;
    }

    public void setResourceulness(int resourceulness) {
        this.resourceulness = resourceulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    public String toString() {
        return super.toString() +
                "хитрость - " + guile + ", "
                + "решительность - " + determination + ", "
                + "амбициозность - " + ambitiousness + ", "
                + "находчивость - " + resourceulness + ", "
                + "жажда власти - " + lustForPower + ". ";
    }
    public int ability () {
        return guile + determination + ambitiousness +resourceulness + lustForPower;
    }

    public void compareSlytherin (Slytherin slytherin) {
        int ability1 = ability();
        int ability2 = slytherin.ability();
        if (ability1 > ability2) {
            System.out.println("Студент " + getName() + " лучше студента Слизерин " + slytherin.getName() + " (" + ability1 + " > " + ability2 + ")");
        } else if (ability2 > ability1) {
            System.out.println("Студент Слизерин " + slytherin.getName() + " лучше студента" + getName() + " (" + ability2 + " > " + ability1 + ")");
        } else {
            System.out.println("Студенты равны");

        }
    }
}
