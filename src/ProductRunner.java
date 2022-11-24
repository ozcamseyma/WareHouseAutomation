import java.util.Scanner;

public class ProductRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("*************************");
        System.out.println("------Ware House------");
        System.out.println("*************************");
        String transactions = "1.Un\n" + "2.Şeker\n" + "3.Tereyağı\n" + "4.Yumurta\n";

        System.out.println(transactions);
        System.out.println("*************************");

        while (true) {
            System.out.println("Yapmak istediginiz islemin numarasini giriniz : ");
            String WhichProduct = scanner.nextLine();

            if (WhichProduct.equals("1")) {
                System.out.println("Un eklendi.");
            } else if (WhichProduct.equals("2")) {
                System.out.println("Şeker eklendi.");
            } else if (WhichProduct.equals("3")) {
                System.out.println("Tereyağı eklendi.");
            } else if (WhichProduct.equals("4")) {
                System.out.println("Yumurta eklendi.");
            } else {
                System.out.println("Hatalı seçim. Tekrar deneyiniz.");
                break;
            }

        }
    }
}
