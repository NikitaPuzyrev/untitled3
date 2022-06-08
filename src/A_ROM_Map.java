import java.util.HashMap;

public class A_ROM_Map {
    public static void main(String[] args) {

    }

    public static String map1(String a) {

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
            map1.put(k, vn);
                    }
        String ars = map1.get(a);
        return ars;
    }
    public static String map(String a) {
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
        String ars = map.get(a);
        return ars;
    }
}


