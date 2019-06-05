import java.util.Scanner;
public class ChangeCurrency {
    public static void main(String[] args) {
        double vnd = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so tien USD: ");

        double usd = sc.nextDouble();
        double change = usd * 23000;
        System.out.println("Gia tri VND la: "+ change);
    }
}
