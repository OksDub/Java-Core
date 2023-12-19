package lesson1;

import static lesson1.Utils.makeAnimalOlder;

public class Main {
    public static void main(String[] args) {
//        Cat cat1 = new Cat("Барсик", "белый", 1);
//
//        System.out.println(cat1);
//        Cat cat2 = new Cat("Морис", "black", 1);
//
//        Cat cat3 = new Cat("Морис", "black", 1);
//
//        System.out.println(cat2.equals(cat3));

//        Wolf wolf = new Wolf("Тревор", "Серый", 6);
//
//        Animal cat4 = new Cat("Морис", "red", 10);
//
//        if (cat4 instanceof Wolf) {
//            Wolf cat5 = (Wolf) cat4;
//        } else {
//            System.out.println("Не является волком!");
//        }
//
//        Animal cat6 = new Cat("Морис", "red", 10);
//        cat6.voice();
//
//        //Создать набор бассейнов и заставить животных проплыть по ним и вывести время на заплыв
//
//        Cat catCompetitor1 = new Cat("Морис", "red", 10);
//        catCompetitor1.setSwimmingSpeed(10);
//        Wolf wolfCompetitor1 = new Wolf("Волк", "серый", 12);
//        wolfCompetitor1.setSwimmingSpeed(12);
//        Turtle turtleCompetitor = new Turtle("Черепаха", "зеленая", 100);
//        turtleCompetitor.setSwimmingSpeed(15);
//
//        Pool[] pools = {new Pool(15), new Pool(20), new Pool(35)};
//
//        for (Pool pool : pools) {
//            pool.getTimeToOvercomePool(catCompetitor1);
//            pool.getTimeToOvercomePool(wolfCompetitor1);
//            pool.getTimeToOvercomePool(turtleCompetitor);
//        }
//
//        makeAnimalOlder(cat2);



        Team[] teamsArray = new Team[4];
        teamsArray[0] = new Team("Андреев Андрей Андреевич", 250);
        teamsArray[1] = new Team("Ильин Илья Ильич", 300);
        teamsArray[2] = new Team("Дмитриев Дмитрий Дмитриевич", 200);
        teamsArray[3] = new Team("Иванов Иван Иванович", 270);

        for (int i = 0; i < teamsArray.length; i++) {
            teamsArray[i].printInfo();

        }
        System.out.println();

        Course course = new Course(42, 10);

        for (Team team : teamsArray) {
            course.doIt(team);
        }

        System.out.println();

        for (int i = 0; i < teamsArray.length; i++) {
            teamsArray[i].showResults();

        }




    }


}
