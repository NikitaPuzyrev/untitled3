import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class test_3 {
        public static void main(String[] args)  {
            HashMap<String, String> map = new HashMap<>();
            map.put("I", "1");
            map.put("II", "2");
            map.put("III", "3");
            map.put("VII", "7");
            map.put("VI", "6");
            map.put("IV", "4");
            map.put("V", "5");
            map.put("VIII", "8");
            map.put("IX", "9");
            map.put("X", "10");

            HashMap<String, String> map1 = new HashMap<>();
            map1.put("1", "I");
            map1.put("2", "II");
            map1.put("3", "III");
            map1.put("4", "IV");
            map1.put("5", "V");
            map1.put("6", "VI");
            map1.put("7", "VII");
            map1.put("8", "VIII");
            map1.put("9", "IX");
            map1.put("10", "X");
            for (int i = 1; i < 11; i++) {
                String ii = Integer.toString(i);
                String v = map1.get(ii);
                int k1 = i + 10;
                String k = Integer.toString(k1);
                String vn = "X" + v;
                map1.put(k, vn);

            }
            for (int i = 1; i < 11; i++) {
                String ii = Integer.toString(i);
                String v = map1.get(ii);
                int k1 = i + 20;
                String k = Integer.toString(k1);
                String vn = "XX" + v;
                map1.put(k, vn);

            }
            for (int i = 1; i < 11; i++) {
                String ii = Integer.toString(i);
                String v = map1.get(ii);
                int k1 = i + 30;
                String k = Integer.toString(k1);
                String vn = "XXX" + v;
                map1.put(k, vn);

            }
            for (int i = 1; i < 11; i++) {
                String ii = Integer.toString(i);
                String v = map1.get(ii);
                int k1 = i + 40;
                String k = Integer.toString(k1);
                String vn = "XL" + v;
                map1.put(k, vn);

            }
            for (int i = 1; i < 11; i++) {
                String ii = Integer.toString(i);
                String v = map1.get(ii);
                int k1 = i + 50;
                String k = Integer.toString(k1);
                String vn = "L" + v;
                map1.put(k, vn);

            }
            for (int i = 1; i < 11; i++) {
                String ii = Integer.toString(i);
                String v = map1.get(ii);
                int k1 = i + 60;
                String k = Integer.toString(k1);
                String vn = "LX" + v;
                map1.put(k, vn);

            }
            for (int i = 1; i < 11; i++) {
                String ii = Integer.toString(i);
                String v = map1.get(ii);
                int k1 = i + 70;
                String k = Integer.toString(k1);
                String vn = "LXX" + v;
                map1.put(k, vn);

            }
            for (int i = 1; i < 11; i++) {
                String ii = Integer.toString(i);
                String v = map1.get(ii);
                int k1 = i + 80;
                String k = Integer.toString(k1);
                String vn = "LXXX" + v;
                map1.put(k, vn);

            }
            for (int i = 1; i < 11; i++) {
                String ii = Integer.toString(i);
                String v = map1.get(ii);
                int k1 = i + 90;
                String k = Integer.toString(k1);
                String vn = "XC" + v;
                map1.put(k, vn);   //словарь
            }
            Scanner in = new Scanner(System.in);
            System.out.print("enter a task: ");
            String num = in.nextLine();

            String[] strings = num.split(" ");
            for (String element : strings) {

                // System.out.println(element);
                int sr = strings.length;

            if (sr != 3) {
                try {
                    throw  new IOException();
            }catch (IOException e) {
                System.out.println("wrong format input");

                }
            }
        }
        String sa = strings[0];
        String ms = strings[1];
        String sb = strings[2];
        if (map1.containsKey(sa) && map1.containsKey(sb)) {
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
                }else {
                    System.out.println("Input Error");
                }
            }
            else {
                System.out.println("Input Error element is  big ");
                System.exit(0);
            }
        } else if (map.containsKey(sa) && map.containsKey(sb)) {
            String ars = map.get(sa);
            String brs = map.get(sb);
            int ar = Integer.valueOf(ars);
            int br = Integer.valueOf(brs);

            switch (ms) {
                case "+":
                    int r = br + ar;
                    String rr = Integer.toString(r);
                    System.out.println(map1.get(rr));
                    break;
                case "-":
                    if (ar <= br) {
                        System.out.println("Input Error Roman numerals are only positive");
                        break;
                    } else {
                        int r3 = ar - br;
                        String r3r = Integer.toString(r3);
                        System.out.println(map1.get(r3r));
                        break;
                    }
                case "*":
                    int r4 = ar * br;
                    String r4r = Integer.toString(r4);
                    System.out.println(map1.get(r4r));
                    break;
                case  "/":
                    int r5 = ar / br;
                    String r5r = Integer.toString(r5);
                    System.out.println(map1.get(r5r));
                    break;
                default:
                    System.out.println("Input Error");
            }

        } else{
            System.out.println("Input Error");
        }
    }}