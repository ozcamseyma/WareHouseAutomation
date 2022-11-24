import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class WhichProduct {

    static List<Product> product = new ArrayList<>();
    static List<Product> checkProduct = new ArrayList<>(); // secilen ürün
    static HashMap<Integer,Product> products = new HashMap<>();
    static ArrayList<Integer> productIds = new ArrayList<>(products.keySet());
    static Scanner scan = new Scanner(System.in);
    static int id;
    static String no;
    static String manufacturer;
    static String amount;
    static String unit;
    static String shelf;

    public void startProduct(){

        System.out.println(productIds);

        System.out.println("*** Start Product ***");
        System.out.println("Başlangıç tercihinizi giriniz: ");
        int start = scan.nextInt();

        switch(start){
            case 1:
                productIdentification();
                startProduct();
                break;
            case 2:
                listProduct();
                startProduct();
                break;
            case 3:
                productEntry();
                startProduct();
                break;
            case 4:
                putItOnTheShelf();
                startProduct();
                break;
            case 5:
                productOutput();
                startProduct();
                break;
            case 6:
                finish();
                break;
            default:
                System.out.println("Yanlış başlangıç!");
                break;

        }



    }


    private void productIdentification(){ // ürün tanımlama


        System.out.println("*** ProductIdentification ***");

        do {

            System.out.print("Ürün ismini giriniz : ");
            scan.nextLine(); // dummy hayalet
            String productName = scan.nextLine().toUpperCase();

            System.out.print("Üretici ismini giriniz : ");
            String productManufacturer = scan.nextLine().toUpperCase();

            System.out.print("Ürünün birimini giriniz : ");
            String productUnit = scan.nextLine().toUpperCase();

            Product product = new Product(id,productName,productManufacturer,productUnit);
            products.put(id,product);
            id++;
            System.out.println("Eklemeyi bitirmek için 0 a basınız \ndevam etmek için 1 e basınız..");

            int devam=scan.nextInt();
            if (devam == 0) {
                System.out.println("Ürün tanımlama bitti...");
                break;
            }


        } while (true);

    }

    private static void listProduct(){ // ürün listele

        System.out.println("id            ürün ismi            üreticisi            miktarı            birimi            raf" +
                "\n*****************************************************************************************************************");

        for (int i = 0; i <products.size(); i++) {
            System.out.printf(products.get(i).productId + "  " + products.get(i).productName + "  " + products.get(i).productManufacturer +
                    "  " + products.get(i).productAmount + "  " + products.get(i).productUnit + "  " + products.get(i).productShelf);
            System.out.println("");
        }
        scan.nextLine(); // dummy
    }

    private static void productEntry(){ // ürün girişi

        System.out.println("*** ProductEntry ***");

        System.out.print("Giriş yapmak istediğiniz ürünün ID sini giriniz : ");
        int wantedID = scan.nextInt();

        boolean flag=true;
        for (Product u : products.values()) {
            if (u.getProductId() == wantedID) {
                System.out.println("Girmek istediğiniz değeri yazınız : ");
                int login = scan.nextInt();
                if (login>=0){
                    u.productAmount += login;
                    System.out.println("Miktar eklendi.");
                } else {
                    System.out.println("Giriş yaparken eksi değer girmeyiniz!");
                }
                flag=false;
                break;
            }
        }
        if (flag){
            System.out.println("Giriş yapmak istediğiniz ürün bulunamadı.");
        }
    }


    private static void putItOnTheShelf(){ // rafa koy
        System.out.println("*** Put İt On The Shelf ***");

        System.out.print("Rafa yerleştirmek istediğiniz ürünün ID sini giriniz : ");
        Integer wantedID = scan.nextInt();

        boolean flag = true;
        for (Product u : products.values()) {
            if (u.getProductId() == wantedID) {
                System.out.println("Hangi rafa yerleştirmek istersiniz : ");
                u.productShelf="shelf"+scan.next();
                System.out.println("Ürün rafa yerleştirildi.");
                flag=false;
                break;
            }
        }
        if (flag){
            System.out.println("Yerleştirmek istediğiniz ürün bulunamadı.");
        }
    }


    private static void productOutput (){ // ürün çıkışı

        System.out.println("*** ProductOutput ***");

        System.out.println("Çıkışını yapmak istediğiniz ürünün ID sini giriniz : ");
        int wantedID = scan.nextInt();

        boolean flag=true;
        for (Product u : products.values()) {
            if (u.getProductId() == wantedID) {
                System.out.println("Çıkarmak istediğiniz değeri yazınız : ");
                int exit = scan.nextInt();
                u.productAmount-=exit;
                System.out.println("Ürün çıkarıldı.");
                if (u.productAmount<0){
                    System.out.println((u.productAmount+exit)+" "+u.productUnit+" "+u.productName+" var - çıkarıldı. " +
                            "\n"+Math.abs(u.productAmount)+" "+u.productUnit+" daha veremem.");
                    u.productAmount=0;
                }
                flag=false;
                break;
            }
        }
        if (flag){
            System.out.println("Yerleştirmek istediğiniz ürün bulunamadı.");
        }


    }


    private static void finish(){ // bitiş

        System.out.println("İŞLEM TAMAM . \nYİNE BEKLERİZ.");

    }



}
