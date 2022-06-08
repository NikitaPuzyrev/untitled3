import java.io.IOException;
import java.util.Scanner;

public class test_2 {
    public static void main(String[] args) throws IOException {


        String ara = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10";
        String rom = "I, II, III, IV, v, VI, VII, VIII, IX, X";

        Scanner in = new Scanner(System.in);
        System.out.print("enter a task: ");
        String num = in.nextLine();

        String[] strings = num.split(" ");
        for (String ignored : strings) {
            // System.out.println(element);
            int sr = strings.length;

            if (sr != 3) {
                throw new IOException("wrong format input");

            }
        }
            String sa = strings[0];
            String ms = strings[1];
            String sb = strings[2];
            if (ara.contains(sa) && ara.contains(sb)) {
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
                        System.out.println("Input Error");
                    }
                }
                else {
                    throw new IOException("wrong format input");
                }
            } else if (rom.contains(sa)  && rom.contains(sb)) {
                String ars = A_ROM_Map.map(sa);
                String brs = A_ROM_Map.map(sb);
                int ar = Integer.valueOf(ars);
                int br = Integer.valueOf(brs);

                switch (ms) {
                    case "+":
                        int r = br + ar;
                        String rr = Integer.toString(r);
                        System.out.println(A_ROM_Map.map1(rr));
                        break;
                    case "-":
                        if (ar <= br) {
                            throw new IOException("Input Error Roman numerals are only positive");

                        } else {
                            int r3 = ar - br;
                            String r3r = Integer.toString(r3);
                            System.out.println(A_ROM_Map.map1(r3r));
                            break;
                        }
                    case "*":
                        int r4 = ar * br;
                        String r4r = Integer.toString(r4);
                        System.out.println((A_ROM_Map.map1(r4r)));
                        break;
                    case  "/":
                        int r5 = ar / br;
                        String r5r = Integer.toString(r5);
                        System.out.println((A_ROM_Map.map1(r5r)));
                        break;
                    default:
                        throw new IOException("wrong format input");
                }

            } else{
                throw new IOException("wrong format input");
        }
    }}














