import java.util.Scanner;

public class EB1 {

    String cname, ctype;
    int cno, pre, cur;

    void setInput() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        cname = s.nextLine();

        System.out.print("Enter Customer Type (domestic/commercial): ");
        ctype = s.nextLine();

        System.out.print("Enter Customer Number: ");
        cno = s.nextInt();

        System.out.print("Enter Previous Reading: ");
        pre = s.nextInt();

        System.out.print("Enter Current Reading: ");
        cur = s.nextInt();
    }

    void call() {

        int units = cur - pre;
        int amount = 0;

        if (ctype.equalsIgnoreCase("domestic")) {

            if (units <= 100)
                amount = 0;
            else if (units <= 200)
                amount = (units - 100) * 2;
            else if (units <= 500)
                amount = (100 * 2) + (units - 200) * 4;
            else
                amount = (100 * 2) + (300 * 4) + (units - 500) * 6;

        } else {

            if (units <= 100)
                amount = units * 2;
            else if (units <= 200)
                amount = (100 * 2) + (units - 100) * 4;
            else if (units <= 500)
                amount = (100 * 2) + (100 * 4) + (units - 200) * 6;
            else
                amount = (100 * 2) + (100 * 4) + (300 * 6) + (units - 500) * 7;

        }

        System.out.println("\n------ Electricity Bill ------");
        System.out.println("Customer Name   : " + cname);
        System.out.println("Customer Number : " + cno);
        System.out.println("Customer Type   : " + ctype);
        System.out.println("Units Consumed  : " + units);
        System.out.println("Amount to Pay   : Rs. " + amount);
    }

    public static void main(String[] args) {

        EB1 b = new EB1();
        b.setInput();
        b.call();

    }
}
