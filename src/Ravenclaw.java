public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int powerOFWitchcraft, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, powerOFWitchcraft, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public String toString() {
        return super.toString() +
                "ум - " + intelligence + ", "
                + "мудрость - " + wisdom + ", "
                + "остроумие - " + wit + ", "
                + "кретивность - " + creativity + ". ";
    }
    public int ability (){
        return intelligence + wisdom + wit + creativity;
    }

    public void compareRavenclaw (Ravenclaw ravenclaw) {
        int ability1 = ability();
        int ability2 = ravenclaw.ability();
        if (ability1 > ability2) {
            System.out.println("Студент " + getName() + " лучше студента Когтевран  " + ravenclaw.getName() + " (" + ability1 + " > " + ability2 + ")");
        } else if (ability2 > ability1) {
            System.out.println("Студент Когтевран " + ravenclaw.getName() + " лучше студента" + getName() + " (" + ability2 + " > " + ability1 + ")");
        } else {
            System.out.println("Студенты равны");

        }
    }

}
