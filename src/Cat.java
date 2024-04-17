
public class Cat {
    private String petName;
    private int petAge;
    private int petWeight;

    public Cat(String petName, int petAge, int petWeight) {
        this.petName = petName;
        this.petAge = petAge;
        this.petWeight = petWeight;
    }

    public Cat() {
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        if (!petName.isEmpty()) {
            this.petName = petName;
        } else {
            System.out.println("Ошибка! Я не могу назвать питомца пустая строка! Дайте питомцу имя!");
        }
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        if (petAge >= 0) {
            this.petAge = petAge;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным числом!");
        }
    }

    public int getPetWeight() {
        return petWeight;
    }

    public void setPetWeight(int petWeight) {
        if (petWeight > 0) {
            this.petWeight = petWeight;
        } else {
            System.out.println("Ошибка! Даже самый мальеникий питомец не может не иметь веса! Укажите вес больше 0!");
        }
    }
}
