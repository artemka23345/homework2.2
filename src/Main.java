public class Main {
    /*
     * 1. Напишите программу, в которой реализован класс hogwarts и четыре класса по названиям факультетов. В классах факультетов
     * опишите свойства каждого, перечисленные выше. Ученики должны быть реализованы в качестве объектов. Должна быть возможность
     * задавать качества учеников через конструктор. Присвойте каждому свойству произвольное числовое значение от 0 до 100.
     * 2. Сделайте метод, который выводит на экран описание студента. В описание надо включать качества, которые присущи всем
     * студентам, плюс качества, которые присущи студенту, потому что он учится на конкретном факультете.
     * 3. Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой двух учеников одного факультета
     * по свойствам. Чтобы сравнить учеников, нужно сложить баллы по каждому свойству, которое присуще ученику данного факультета.
     * Тот ученик, у которого сумма свойств больше, считается лучшим учеником. Метод должен выводить в консоль результат сравнения учеников.
     * Например, у Гермионы благородство = 5 баллов, честь = 5 баллов и храбрость = 6 баллов. У Рона Уизли благородство = 3 балла,
     * честь = 6 баллов и храбрость = 5 баллов.
     * У Гермионы сумма баллов равна 16-ти, а у Рона – 14-ти. Значит метод должен вывести в консоль “Гермиона лучший Гриффиндорец, чем Рон”.
     * 4. Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии, и выводит в консоль
     * сравнительную оценку между двумя учениками.
     */
    public static void main(String[] args) {
        Hogwarts gryffindor = new Gryffindor("Гарри Поттер",3,1,3,6,7);
        Hogwarts gryffindor2 = new Gryffindor("Гермиона Грейнджер",4,3,6,8,4);
        Hogwarts gryffindor3 = new Gryffindor("Рон Уизли",4,2,2,9,8);

        Hogwarts slytherin = new Slytherin("Драко Малфой",2,4,2,4,5,6,3);
        Hogwarts slytherin2 = new Slytherin("Грэхэм Монтегю",2,6,2,7,10,2,2);
        Hogwarts slytherin3 = new Slytherin("Грегори Гойл",6,2,4,4,6,1,8);

        gryffindor.description();
        gryffindor.equalsHogwarts(gryffindor2);
        slytherin.description();

    }
}
