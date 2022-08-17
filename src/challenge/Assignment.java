package challenge;
import java.util.regex.Pattern;

public class Assignment {
    public String repeatSeparator(String word, String sep, int n){
        String str = word;
        for (int i = 1; i<=n; i++){
            if (i != n){
                str = str+sep+word;
            }
        }
        return str;
    }

    public Boolean prefixAgain(String word, int n){
        String prefix = word.substring(0,n);
        return word.substring(n).contains(prefix);
    }

    public String zipZap(String word){
        StringBuilder finalStr = new StringBuilder();
        String strPortion;
        for (int idx = 0; idx<word.length(); idx++){
            if (idx+3 < word.length()){
                strPortion = word.substring(idx,idx+3);
            }else{
                strPortion = word.substring(idx,word.length());
            }
            if (strPortion.startsWith("z") && strPortion.endsWith("p")){
                finalStr.append("zp");
                idx+=2;
            } else {
                finalStr.append(strPortion.charAt(0));
            }
        }
        return finalStr.toString();
    }

    public Boolean xyBalance(String word){
        int firstIndexOfX = word.indexOf("x");
        int firstIndexOfY = word.indexOf("y");
        if (firstIndexOfX < firstIndexOfY)
            return true;
        else
            return false;
    }
}
