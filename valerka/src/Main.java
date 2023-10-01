import java.util.Scanner;
public class Main {
    public  interface Anon{ // Создаются интерфейсы (Anon) с методами set() и get() для взаимодействия с объектами
        void set();
        void get();
    }
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in); // Создание объекта Scanner для ввода данных
        Anon StatusAggrement = new Anon() { // Создание анонимных классов для объектов StatusAggrement
            int id;
            public String name;
            @Override
            public void set() {
                System.out.print("\nВведите ИД статуса договора: ");
                this.id=scann.nextInt();
                scann.nextLine();
                System.out.print("Введите статус договора: ");
                this.name=scann.nextLine();
            }
            @Override
            public void get() {System.out.println("\n"+id+"| "+name);}
        };
        Anon TypeAggrement = new Anon() { // Создание анонимных классов для объектов TypeAggrement
            int id;
            String name;
            @Override
            public void set() {
                System.out.print("Введите ИД типа договора: ");
                this.id =scann.nextInt();
                scann.nextLine();
                System.out.print("Введите тип договора: ");
                this.name=scann.nextLine();
            }
            @Override
            public void get() {
                System.out.println("\n"+id+"| "+name);
            }
        };
        Anon Person = new Anon() { // Создание анонимных классов для объектов Person
            int id;
            String shifer,inn,type,data;
            @Override
            public void set() {
                System.out.print("\nВведите ИД клиента: ");
                this.id =scann.nextInt();
                scann.nextLine();
                System.out.print("Введите шифр клиента: ");
                this.shifer=scann.nextLine();
                System.out.print("Введите ИНН клиента: ");
                this.inn =scann.nextLine();
                System.out.print("Введите тип клиента: ");
                this.type =scann.nextLine();
                System.out.print("Введите дату регистрации клиента: ");
                this.data =scann.nextLine();
            }
            @Override
            public void get() {System.out.println("\n"+ id +"| Шифр: "+ shifer + ", ИНН: "+inn + ", Тип: "+type+", Дата регистрации: "+data);}
        };
        Anon Agreement = new Anon(){ // Создание анонимных классов для объектов Agreement 
            public String number, dataopen, dataclose;
            public int id, personid,typeid,statusid;
            @Override
            public void set() {
                System.out.print("\nВведите ИД договора: ");
                this.id=scann.nextInt();
                System.out.print("\nВведите ИД клиента: ");
                this.personid=scann.nextInt();
                System.out.print("\nВведите ИД типа договора: ");
                this.typeid=scann.nextInt();
                System.out.print("\nВведите ИД статуса договора: ");
                this.statusid=scann.nextInt();
                scann.nextLine();
                System.out.print("Введите номер договора: ");
                this.number=scann.nextLine();
                System.out.print("Введите дата заключения договора: ");
                this.dataopen =scann.nextLine();
                System.out.print("Введите дату закрытия договора: ");
                this.dataclose =scann.nextLine();;
            }
            @Override
            public void get() {
                System.out.print("\nID договора: " + this.id + "\nID клиента: " + this.personid + "\nID типа договора: "+ this.typeid + "\nID статуса договора: " + this.statusid + "\nНомер договора: " + this.number + "\nДата заключения договора: " + this.dataopen+ "\nДата закрытия договора: "+this.dataclose);
            }
        };
        StatusAggrement.set(); // Использование методов set() и get() для каждого из объектов для ввода и вывода данных о статусе договора, типе договора, клиенте и договоре
        StatusAggrement.get();
        TypeAggrement.set();
        TypeAggrement.get();
        Person.set();
        Person.get();
        Agreement.set();
        Agreement.get();
    }}