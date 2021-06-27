package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* n1
        System.out.println(n1(1, 3));
        System.out.println(n1(2, 3));
        System.out.println(n1(3, 5));
        System.out.println(n1(5, 46));
         */

        /* n2
        System.out.println(n2("Donald Trump"));
        System.out.println(n2("\"Rosie O'Donnell"));
        System.out.println(n2("Seymour Butts"));
         */

        /* n3
        System.out.println(n3(1500, 50));
        System.out.println(n3(89, 20));
        System.out.println(n3(100, 75));
         */

        /* n4
        int[] Array1 = new int[]{10, 4, 1, 4, -10, -50, 32, 21};
        System.out.println(n4(Array1));
        int[] Array2 = new int[]{44, 32, 86, 19};
        System.out.println(n4(Array2));
         */

        /* n5
        System.out.println(n5(3, 4, 3));
        System.out.println(n5(1, 1, 1));
        System.out.println(n5(3, 4, 1));
         */

        /* n6
        System.out.println(n6("Hello World"));
        System.out.println(n6("The quick brown fox."));
        System.out.println(n6("Edabit is really helpful!"));
         */

        /* n7
        System.out.println(n7(147, 33, 526));
        System.out.println(n7(33, 72, 74));
        System.out.println(n7(1, 5, 9));
         */

        /* n8
        System.out.println(n8("ooxx"));
        System.out.println(n8("xooxx"));
        System.out.println(n8("ooxXm"));
        System.out.println(n8("zpzpzpp"));
        System.out.println(n8("zzoo"));
         */

        /* n9
        System.out.println(n9("There is a bomb."));
        System.out.println(n9("\"Hey, did you think there is a BOMB?"));
        System.out.println(n9("This goes boom!!!"));
         */

        /* n10
        System.out.println(n10("a", "a"));
        System.out.println(n10("AA", "B@"));
        System.out.println(n10("EdAbIt", "EDABIT"));
         */
    }

    public static int n1(int p11,int p12) {
        return p12 * 2 - p11 + 1;
    }

    public static String n2(String p2) {
        String[] words = p2.split(" ");
        return words[1] + " " + words[0];
    }

    public static double n3(double p31,double p32) {
        return (100 - p32) * p31 / 100;
    }

    public static int n4(int[] p4) {
        IntSummaryStatistics stat = Arrays.stream(p4).summaryStatistics();
        int min = stat.getMin();
        int max = stat.getMax();
        return max - min;
    }

    public static int n5(int p51, int p52, int p53) {
        if (p51 == p52 && p52 == p53)
            return 3;
        if (p51 == p52 || p51 == p53 || p52 == p53)
            return 2;
        return 0;
    }

    public static String n6(String p6) {
        char[] text = p6.toCharArray();
        String ans = "";
        for (int i = 0; i < p6.length(); i++)
            ans = ans + text[p6.length() - 1 - i];
        return ans;
    }

    public static int n7(int p71, int p72, int p73) {
        int[] zp = {p71, p72, p73};
        IntSummaryStatistics stat = Arrays.stream(zp).summaryStatistics();
        int min = stat.getMin();
        int max = stat.getMax();
        return max - min;
    }

    public static boolean n8(String p8) {
        int kO = 0;
        int kX = 0;
        char[] text = p8.toCharArray();
        for (int i = 0; i < p8.length(); i++) {
            if (text[i] == 'o' || text[i] == 'O')
                kO = kO + 1;
            if (text[i] == 'x' || text[i] == 'X')
                kX = kX + 1;
        }
        if (kO == kX)
            return true;
        return false;
    }

    public static String n9(String p9) {
        p9 = p9.toLowerCase(Locale.ROOT);
        if (p9.contains("bomb"))
            return "ПРИГНИСЬ!";
        return "Расслабься, бомбы нет";
    }

    public static boolean n10(String p101, String p102) {
        int s1 = p101.chars().sum();
        int s2 = p102.chars().sum();
        if (s1 == s2)
            return true;
        return false;
    }
}
