public class Main {


    public static void main(String[] args) {
        Grifindor harry = new Grifindor("Гарри Поттер", 95, 99, 90, 98, 89);
        Grifindor hermione = new Grifindor("Гермиона Грейнджер", 90, 92, 88, 96, 99);
        Grifindor ron = new Grifindor("Рон Уизли", 80, 75, 80, 85, 74);


        Hufflepuff zacharias = new Hufflepuff("Захария Смит", 87, 84, 77, 82, 70);
        Hufflepuff sedric = new Hufflepuff("Седрик Диггори", 84, 78, 68, 70, 79);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 63, 68, 76, 68, 56);


        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 77, 78, 81, 67, 56, 71);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 85, 67, 59, 74, 67, 57);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 69, 85, 73, 45, 34, 40);


        Slytherin draco = new Slytherin("Драко Малфой", 93, 97, 97, 99, 98, 88, 98);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 88, 65, 76, 45, 71, 85, 89);
        Slytherin gregory = new Slytherin("Грегори Гойл", 67, 54, 87, 39, 92, 76, 80);

        harry.print();
        hermione.print();
        ron.print();
        zacharias.print();
        sedric.print();
        justinFinchFletchley.print();
        zhouChang.print();
        padma.print();
        marcus.print();
        draco.print();
        graham.print();
        gregory.print();

        zacharias.compareHufflepuff(justinFinchFletchley);
        harry.compareHogwarts(sedric);





    }

        }


