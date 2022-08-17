package challenge;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Assignment obj = new Assignment();
        System.out.println(obj.repeatSeparator("Word", "X", 3));
        System.out.println(obj.prefixAgain("abXYabc", 1));
        System.out.println(obj.zipZap("tttttttttyuiop"));
        System.out.println(obj.xyBalance("aaxxxxybb"));
    }
}
