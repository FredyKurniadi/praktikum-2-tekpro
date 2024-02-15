import java.util.ArrayList;
import java.util.Scanner;
import java.math.BigInteger;

public class p2_1 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> input = new ArrayList<String>();
        Scanner kScanner = new Scanner(System.in);
        int Jml = kScanner.nextInt();
        for (int i = 0; i < Jml; i++) {
            input.add(kScanner.next());
        }
        kScanner.close();

        for (int i = 0; i < Jml; i++) {
            BigInteger Temp = new BigInteger(input.get(i));
            Temp = Temp.min(new BigInteger("" + Long.MAX_VALUE));
            if (Temp.compareTo(new BigInteger("1")) >= 1 && input.get(i).length() > 18) {
                System.out.println(input.get(i) + " can't be fitted anywhere.");
            } else {
                Long TempVal = Long.valueOf(input.get(i));
                System.out.println(input.get(i) + " can be fitten in :");
                System.out.println(
                        (Byte.MAX_VALUE >= TempVal && Byte.MIN_VALUE <= TempVal ? "* byte\n" : "")
                                + (Short.MAX_VALUE >= TempVal && Short.MIN_VALUE <= TempVal ? "* short\n" : "")
                                + (Integer.MAX_VALUE >= TempVal && Integer.MIN_VALUE <= TempVal ? "* int\n" : "")
                                + (Long.MAX_VALUE >= TempVal && Long.MIN_VALUE <= TempVal ? "* long\n" : ""));
            }
        }
    }
}

