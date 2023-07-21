public class Cat2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 3, "рыжий");
        Cat cat2 = new Cat("Мурзик", 5, "черный");

        System.out.println("Информация о коте 1:");
        System.out.println("Имя: " + cat1.getName());
        System.out.println("Возраст: " + cat1.getAge());
        System.out.println("Цвет: " + cat1.getColor());

        System.out.println("\nИнформация о коте 2:");
        System.out.println("Имя: " + cat2.getName());
        System.out.println("Возраст: " + cat2.getAge());
        System.out.println("Цвет: " + cat2.getColor());

        cat1.sayHello();
        cat2.sleep();
    }
}