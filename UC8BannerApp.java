package OOPSBannerApp.UC8;

import java.util.HashMap;
import java.util.Map;

public class UC8BannerApp {

    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ******",
                "*      ",
                " ***** ",
                "      *",
                "****** "
        });
    }

    public static void renderBanner(String word) {

        word = word.toUpperCase();

        for (int row = 0; row < 5; row++) {

            for (int col = 0; col < word.length(); col++) {

                char ch = word.charAt(col);

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[row] + "   "); // extra spacing between letters
                } else {
                    System.out.print("         ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }
}