import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("50\n10\n"); //-> 2-е задание
//-------------------------------------------------------------------------
        Scanner ScanRad = new Scanner(System.in);
        System.out.print("введите радиус: ");
        double r = ScanRad.nextDouble();
        System.out.println("диаметр: " + (2 * r));
        //ScanRad.close(); //-> 4-e задание
//-------------------------------------------------------------------------
        Scanner ScanFood = new Scanner(System.in);

        System.out.print("цена конфет: ");
        double c = ScanFood.nextDouble();
        System.out.print("цена печенья: ");
        double p = ScanFood.nextDouble();
        System.out.print("цена яблок: ");
        double y = ScanFood.nextDouble();

        System.out.print("сколько кг конфет: ");
        double kc = ScanFood.nextDouble();
        System.out.print("кг печенья: ");
        double kp = ScanFood.nextDouble();
        System.out.print("кг яблок: ");
        double ky = ScanFood.nextDouble();

        System.out.println("Стоимость: " + (c * kc + p * kp + y * ky)); //-> 5-е задание
        //ScanFood.close();
//-------------------------------------------------------------------------
        Scanner ScanNum = new Scanner(System.in);

        System.out.print("Введите 1-е число: ");
        double a = ScanNum.nextDouble();
        System.out.print("Введите 2-е число: ");
        double b = ScanNum.nextDouble();

        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        System.out.println("Произведение: " + (a * b));
        System.out.println("Частное: " + (a / b)); //-> 7-е задание
//-------------------------------------------------------------------------

        Scanner ScanPeople = new Scanner(System.in);
        System.out.print("Количество жителей: ");
        double people = ScanPeople.nextDouble();
        System.out.print("Площадь территории: ");
        double area = ScanPeople.nextDouble();

        System.out.println("Плотность населения: " + (people / area)); //-> 9-е задание
//-------------------------------------------------------------------------
        Scanner ScanRebro = new Scanner(System.in);
        System.out.print("Длина ребра куба: ");
        double a = ScanRebro.nextDouble();

        System.out.println("Объем куба: " + (a * a * a));
        System.out.println("Площадь боковой поверхности: " + (4 * a * a)); //-> 11-е задание
//-------------------------------------------------------------------------
        Scanner ScanTemp = new Scanner(System.in);
        System.out.print("Температура в Цельсиях: ");
        double c = ScanTemp.nextDouble();

        System.out.println("По Фаренгейту: " + (c * 1.8 + 32));
        System.out.println("По Кельвину: " + (c + 273.15)); //-> 12-е задание
//-------------------------------------------------------------------------
        Scanner ScanScorost = new Scanner(System.in);
        System.out.print("Скорость (км/ч): ");
        double v = ScanScorost.nextDouble();
        System.out.print("Время (ч): ");
        double t = ScanScorost.nextDouble();

        System.out.println("Пройденное расстояние: " + (v * t)); //-> 14-е задание
    }
}
