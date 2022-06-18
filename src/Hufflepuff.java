public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;


    public Hufflepuff(String name, int powerOFWitchcraft, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, powerOFWitchcraft, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public String toString() {
        return super.toString() +
                "трудолюбие - " + diligence + ", "
                + "верность - " + loyalty + ", "
                + "честность - " + honesty + ". ";
    }
    public int ability() {
        return diligence + loyalty + honesty;
    }
    public void compareHufflepuff (Hufflepuff hufflepuff) {
        int ability1 = ability();
        int ability2 = hufflepuff.ability();
        if (ability1 > ability2) {
            System.out.println("Студент " + getName() + " лучше студента Пуффендуй " + hufflepuff.getName() + " (" + ability1 + " > " + ability2 + ")");
        } else if (ability2 > ability1) {
            System.out.println("Студент Пуффендуй " + hufflepuff.getName() + " лучше студента" + getName() + " (" + ability2 + " > " + ability1 + ")");
        } else {
            System.out.println("Студенты равны");

        }
    }


}
