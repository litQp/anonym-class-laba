import java.util.Scanner;

public class Main {
    public interface Anon {
        void start();
    }

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        Anon StatusAggrement = () -> {
            int id;
            String name;
            System.out.print("\nВведите ИД статуса договора: ");
            id = scann.nextInt();
            scann.nextLine();
            System.out.print("Введите статус договора: ");
            name = scann.nextLine();
            System.out.println("\n" + id + "| " + name);
        };
        Anon TypeAggrement = () -> {
            int id;
            String name;
            System.out.print("Введите ИД типа договора: ");
            id = scann.nextInt();
            scann.nextLine();
            System.out.print("Введите тип договора: ");
            name = scann.nextLine();
            System.out.println("\n" + id + "| " + name);
        };
        Anon Person = () -> {
            int id;
            String shifer, inn, type, data;
            System.out.print("\nВведите ИД клиента: ");
            id = scann.nextInt();
            scann.nextLine();
            System.out.print("Введите шифр клиента: ");
            shifer = scann.nextLine();
            System.out.print("Введите ИНН клиента: ");
            inn = scann.nextLine();
            System.out.print("Введите тип клиента: ");
            type = scann.nextLine();
            System.out.print("Введите дату регистрации клиента: ");
            data = scann.nextLine();

            System.out.println("\n" + id + "| Шифр: " + shifer + ", ИНН: " + inn + ", Тип: " + type + ", Дата регистрации: " + data);
        };
        Anon Agreement = () -> {
            String number, dataopen, dataclose;
            int id, personid, typeid, statusid;

            System.out.print("\nВведите ИД договора: ");
            id = scann.nextInt();
            System.out.print("\nВведите ИД клиента: ");
            personid = scann.nextInt();
            System.out.print("\nВведите ИД типа договора: ");
            typeid = scann.nextInt();
            System.out.print("\nВведите ИД статуса договора: ");
            statusid = scann.nextInt();
            scann.nextLine();
            System.out.print("Введите номер договора: ");
            number = scann.nextLine();
            System.out.print("Введите дата заключения договора: ");
            dataopen = scann.nextLine();
            System.out.print("Введите дату закрытия договора: ");
            dataclose = scann.nextLine();

            System.out.print("\nID договора: " + id + "\nID клиента: " + personid + "\nID типа договора: " + typeid + "\nID статуса договора: " + statusid + "\nНомер договора: " + number + "\nДата заключения договора: " + dataopen + "\nДата закрытия договора: " + dataclose);
        };
        StatusAggrement.start();
        TypeAggrement.start();
        Person.start();
        Agreement.start();
    }
}