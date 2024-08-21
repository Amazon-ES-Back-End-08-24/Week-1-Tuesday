public class Main {
    public static void main(String[] args) {

        // Variables - variables

        // tipo nombreDeVariable;
        // tipo nombreDeVariable = valor;

        // primitivos - básicos
        // no primitivos - todos los demás

        // nombre en camelCase minúsculaMayúscula
        int age = 21;
        double price = 19.21;
        boolean isStudent = true;
        char qualification = 'A';
        String name = "Pepito"; // no primitivo
        System.out.println("Mi nombre es " + name + " y tengo " + age + " años.");

        int apples = 12;
        apples = apples + 2;
        apples += 2;
        apples ++; // es lo mismo que apples += 1
        System.out.println(apples);

        int result = (10 + 5) * 2;
        System.out.println(result);

        int age2 = 18;
        boolean isAdult = age2 >= 18;
        boolean isAMinor = age2 < 18;
        boolean isEighteen = age2 == 18;
        System.out.println(isAdult);
        System.out.println(isAMinor);
        System.out.println(isEighteen);


        int number = 10;
        System.out.println(number);

        number += 5;
        System.out.println(number);

        number *= 2;
        System.out.println(number);
    }
}