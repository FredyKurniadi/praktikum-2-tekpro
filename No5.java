import java.util.Scanner;

public class No5 {
    public static void main(String[] args) throws Exception {
        String Input1, Input2;
        Scanner kScanner = new Scanner(System.in);

        Input1 = kScanner.nextLine();
        Input2 = kScanner.nextLine();
        Input1 = Input1.substring(0, 1).toUpperCase() + Input1.substring(1);
        Input2 = Input2.substring(0, 1).toUpperCase() + Input2.substring(1);
        kScanner.close();

        System.out.println((Input1.length() + Input2.length()) + "\n" + ((Input1.compareTo(Input2)) > 0 ? "Yes" : "No")
                + "\n" + Input1 + " " + Input2);
    }
}
