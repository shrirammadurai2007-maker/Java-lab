import java.util.*;

public class CityList1 {

    ArrayList<String> city = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);

    CityList1() {
        city.add("Chennai");
        city.add("Madurai");
        city.add("Salem");
    }

    void append() {
        System.out.print("Enter a city to add: ");
        city.add(sc.nextLine());
    }

    void position() {
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        sc.nextLine();

        if (index >= 0 && index <= city.size()) {
            System.out.print("Enter city to insert: ");
            String name = sc.nextLine();
            city.add(index, name);
        } else {
            System.out.println("Invalid index");
        }
    }

    void searching() {
        System.out.print("Enter city to search: ");
        String search = sc.nextLine();

        if (city.contains(search)) {
            System.out.println("City Found");
        } else {
            System.out.println("City Not Found");
        }
    }

    void start() {
        System.out.print("Enter starting letter: ");
        String ch = sc.nextLine();

        System.out.println("Cities starting with " + ch + ":");

        for (String c : city) {
            if (c.startsWith(ch)) {
                System.out.println(c);
            }
        }
    }

    void display() {
        System.out.println("City List: " + city);
    }

    int input() {
        System.out.println("\n1. Append City");
        System.out.println("2. Insert City at Index");
        System.out.println("3. Search City");
        System.out.println("4. Display Cities with Given Letter");
        System.out.println("5. Display All Cities");
        System.out.println("6. Exit");
        System.out.print("Enter Choice: ");

        return sc.nextInt();
    }

    public static void main(String[] args) {

        CityList1 obj = new CityList1();
        obj.sc.nextLine();

        while (true) {

            int choice = obj.input();
            obj.sc.nextLine();

            switch (choice) {

                case 1:
                    obj.append();
                    break;

                case 2:
                    obj.position();
                    break;

                case 3:
                    obj.searching();
                    break;

                case 4:
                    obj.start();
                    break;

                case 5:
                    obj.display();
                    break;

                case 6:
                    System.out.println("Program Ended");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
