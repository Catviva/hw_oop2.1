public class Grifindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int bravery;

    public Grifindor(String name, int powerOFWitchcraft, int transgressionDistance, int nobility, int honour, int bravery) {
        super(name, powerOFWitchcraft, transgressionDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                "благородство - " + nobility + ", "
                + "честь - " + honour + ", "
                + "храбрость - " + bravery + ". ";
    }
    public int ability() {
        return nobility + honour + bravery;
    }

    public void compareGrifindor (Grifindor grifindor) {
        int ability1 = ability();
        int ability2 = grifindor.ability();
        if (ability1 > ability2) {
            System.out.println("Студент " + getName() + " лучше студента Грифиндор " + grifindor.getName() + " (" + ability1 + " > " + ability2 + ")");
        } else if (ability2 > ability1) {
            System.out.println("Студент Гифиндор " + grifindor.getName() + " лучше студента" + getName() + " (" + ability2 + " > " + ability1 + ")");
        } else {
            System.out.println("Студенты равны");

        }
    }
}


