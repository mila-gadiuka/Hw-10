import com.sun.source.tree.UsesTree;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        task1();
        task2();
        task3();

        scanner.close();
    }

    public static void task1() {
        System.out.print("Введите имя: ");
        String firstName = scanner.nextLine();

        System.out.print("Введите отчество: ");
        String middleName = scanner.nextLine();

        System.out.print("Введите фамилию: ");
        String lastName = scanner.nextLine();

        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2() {
        System.out.print("Введите имя: ");
        String firstName = scanner.nextLine();

        System.out.print("Введите отчество: ");
        String middleName = scanner.nextLine();

        System.out.print("Введите фамилию: ");
        String lastName = scanner.nextLine();

        String fullName = lastName + " " + firstName + " " + middleName;
        String capitalizedFullName = fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + capitalizedFullName);
    }

    public static void task3() {
        System.out.print("Введите имя: ");
        String firstName = scanner.nextLine();

        System.out.print("Введите отчество: ");
        String middleName = scanner.nextLine();

        System.out.print("Введите фамилию: ");
        String lastName = scanner.nextLine();

        String fullName = lastName + " " + firstName + " " + middleName;
        String filterOfTheUnacceptedCharacter = fullName.replace("ё", "е").replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника — " + filterOfTheUnacceptedCharacter);
    }
}