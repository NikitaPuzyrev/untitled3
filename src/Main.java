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
        int sr = strings.length;
        String sa = strings[0];
        String ms = strings[1];
        String sb = strings[2];

        if (sr != 3) {
            throw new IOException("input");
        }

        if (numbers.contains(sa) && numbers.contains(sb)) {
            int sar = Integer.valueOf(strings[0]);
            int sbr = Integer.valueOf(strings[2]);


            if (sbr < 11 & sar < 11) {
                System.out.println(test.mather(sar, sbr, ms));
            } else {
                throw new IOException(" input");
            }
        } else {
            if (roman.contains(sa) && roman.contains(sb)) {

                int ar = romto_a.get(sa);
                int br = romto_a.get(sb);

                int r = test.mather(ar, br, ms);
                if (r > 0) {
                    System.out.println(map.get(Integer.toString(r)));

                } else {
                    throw new IOException("Result error Roman numerals are only positive");

                }
            } else {
                throw new IOException("wrong format input");
            }
        }
    }

}

