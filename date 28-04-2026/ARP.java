import java.util.*;

class ARP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ip[] = {"1.1.1.1", "2.2.2.2"};
        String mac[] = {"AA", "BB"};

        System.out.print("Enter 1 for ARP, 2 for RARP: ");
        int ch = sc.nextInt();
        sc.nextLine();

        if (ch == 1) {
            System.out.print("Enter IP: ");
            String x = sc.nextLine();
            for (int i = 0; i < ip.length; i++)
                if (ip[i].equals(x))
                    System.out.println("MAC: " + mac[i]);
        } else {
            System.out.print("Enter MAC: ");
            String x = sc.nextLine();
            for (int i = 0; i < mac.length; i++)
                if (mac[i].equals(x))
                    System.out.println("IP: " + ip[i]);
        }
    }
}