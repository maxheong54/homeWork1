//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat catGennady = new Cat("Геннадий", 2, 4);
        Cat catBoris = new Cat("Борис", 22, 4);

        ClassLoader classLoader = Cat.class.getClassLoader();
        System.out.println("Имя класса: FirstExercise" + "\nКласс загрузил: " + classLoader);

        System.out.println();

        CatInfo.printCatProfile(catBoris.getPetName(), catBoris.getPetAge(), catBoris.getPetWeight());
        System.out.println();
        CatInfo.printCatProfile(catGennady.getPetName(), catGennady.getPetAge(), catGennady.getPetWeight());

        System.out.println();
        System.out.println("Возраст кота " + catBoris.getPetName() + " эквивалентен человеческим " + CatInfo.catAgeIntoHuman(catBoris.getPetAge()) + " годам!");
        System.out.println("Возраст кота " + catGennady.getPetName() + " эквивалентен человеческим " + CatInfo.catAgeIntoHuman(catGennady.getPetAge()) + " годам!");
    }
}