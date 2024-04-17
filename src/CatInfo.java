public class CatInfo {
    public static void printCatProfile(String name, int age, int weight) {
        String yearVar = switch (age) {
            case 1, 21 -> " год";
            case 2, 3, 4, 22, 23, 24 -> " года";
            default -> " лет";
        };
        System.out.println("Информация о котике:");
        System.out.println("Имя кота: " + name);
        System.out.println("Возраст кота: " + age + yearVar);
        System.out.println("Вес кота: " + weight + " кг");
    }

    public static int catAgeIntoHuman(int catAge) {
        if (catAge <= 1) {
            return 15;
        } else if (catAge == 2) {
            return 24;
        } else if (catAge <= 16) {
            return 2 + (catAge - 2) * 4;
        } else {
            return 58 + (catAge - 16) * 3;
        }
    }
}
