package LAB.LAB2;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Барон", "Лабрадор");
        Dog dog2 = new Dog("Багира", "Хаски");

        System.out.println("Исходные значения:");
        System.out.println("Собака 1:");
        System.out.println("Имя: " + dog1.getName());
        System.out.println("Порода: " + dog1.getBreed());
        System.out.println("Собака 2:");
        System.out.println("Имя: " + dog2.getName());
        System.out.println("Порода: " + dog2.getBreed());

        dog1.setName("Рекс");
        dog2.setBreed("Ратвейлер");

        System.out.println("\nОбновленные значения:");
        System.out.println("Собака 1:");
        System.out.println("Имя: " + dog1.getName());
        System.out.println("Порода: " + dog1.getBreed());
        System.out.println("Собака 2:");
        System.out.println("Имя: " + dog2.getName());
        System.out.println("Порода: " + dog2.getBreed());
    }
}
