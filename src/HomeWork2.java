public class HomeWork2 {
    public static String permission(int age, int temperature) {
        //return "Возраст человека"+age +"Температура на улице"+temperature;
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30)
            return "Можно идти гулять";
        if (age < 20 && temperature > 0 && temperature < 28)
            return "Можно идти гулять";
        if (age < 45 && temperature > -10 && temperature < 25)
            return "Можно идти гулять!";
        else {
            return "Оставайтесь дома!";
        }
    }




    public static int generateRandomAge() {
        int minAge = 0;
        int maxAge = 100;
        return (int) (Math.random() * (maxAge - minAge + 1)) + minAge;
    }

    public static void main(String[] args) {
        int age = generateRandomAge();
        System.out.println("Случайный возраст: " + age);

        System.out.println(permission(23, 10));
        System.out.println(permission(15, 30));
        System.out.println( permission(10, 0));
        System.out.println(permission(18, 25));
        System.out.println(permission(35, 20));

        System.out.println(permission(generateRandomAge(), 45));
    }
}




