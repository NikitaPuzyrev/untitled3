import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Map<String, String> map = A_ROM_Map.createArabictoRomanMap();
        Map<String, Integer> romto_a = A_ROM_Map.createRomanArabicMap();
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

        List<String> roman = Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");

        Scanner in = new Scanner(System.in);
        System.out.print("enter a task: ");
        String num = in.nextLine();

        String[] strings = num.split(" ");
        for (String ignored : strings) {

            int sr = strings.length;

            if (sr != 3) {
                throw new IOException("wrong format input");

            }
        }
        String sa = strings[0];
        String ms = strings[1];
        String sb = strings[2];
        if (numbers.contains(sa) && numbers.contains(sb)) {
            int k2 = Integer.valueOf(strings[0]);
            int a2 = Integer.valueOf(strings[2]);

            if (k2 < 11 & a2 < 11) {

                String m = strings[1];
                if (m.equals("+")) {
                    int r = a2 + k2;
                    System.out.println(r);
                } else if (m.equals("-")) {
                    int r = k2 - a2;

                    System.out.println(r);
                } else if (m.equals("*")) {
                    int r = k2 * a2;
                    System.out.println(r);

                } else if (m.equals("/")) {
                    int r = k2 / a2;
                    System.out.println(r);
                } else {
                    throw new IOException("wrong format input");
                }
            } else {
                throw new IOException("wrong format input");
            }
        } else if (roman.contains(sa) && roman.contains(sb)) {

            int ar = romto_a.get(sa);
            int br = romto_a.get(sb);

            switch (ms) {
                case "+":
                    int r = br + ar;
                    String rr = Integer.toString(r);
                    System.out.println(map.get(rr));
                    break;
                case "-":
                    if (ar <= br) {
                        throw new IOException("Input Error Roman numerals are only positive");

                    } else {
                        int r3 = ar - br;
                        String r3r = Integer.toString(r3);
                        System.out.println(map.get(r3r));
                        break;
                    }
                case "*":
                    int r4 = ar * br;
                    String r4r = Integer.toString(r4);
                    System.out.println(map.get(r4r));
                    break;
                case "/":
                    int r5 = ar / br;
                    String r5r = Integer.toString(r5);
                    System.out.println(map.get(r5r));
                    break;
                default:
                    throw new IOException("wrong format input");
            }

        } else {
            throw new IOException("wrong format input");
        }
    }
}