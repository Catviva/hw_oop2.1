public abstract class Hogwarts {
    private String name;
    private int powerOFWitchcraft;
    private int transgressionDistance;

    public Hogwarts(String name, int powerOFWitchcraft, int transgressionDistance) {
        this.name = name;
        this.powerOFWitchcraft = powerOFWitchcraft;
        this.transgressionDistance = transgressionDistance;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerOFWitchcraft() {
        return powerOFWitchcraft;
    }

    public void setPowerOFWitchcraft(int powerOFWitchcraft) {
        this.powerOFWitchcraft = powerOFWitchcraft;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String toString() {
        return "Cтудент: " + name + ", "
                + "сила колдовства - " + powerOFWitchcraft + ", "
                + "расстояние трансгрессии - " + transgressionDistance + ", ";
    }

    public int hogwartsAbility(){
        return powerOFWitchcraft + transgressionDistance;
    }

    public void print() {
        System.out.println(this);
    }
    public void compareHogwarts (Hogwarts hogwarts) {
        int ability1 = hogwartsAbility();
        int ability2 = hogwarts.hogwartsAbility();
        if (ability1 > ability2) {
            System.out.println("Студент " + name + " лучше студента " + hogwarts.name + " (" + ability1 + " > " + ability2 + ")");
        } else if (ability2 > ability1) {
            System.out.println("Студент " + hogwarts.name + " лучше студента" + name + " (" + ability2 + " > " + ability1 + ")");
        } else {
            System.out.println("Студенты равны");

        }
    }
    }







