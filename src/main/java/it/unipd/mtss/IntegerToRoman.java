////////////////////////////////////////////////////////////////////
// [Samuele] [Perozzo] [2110989]
// [Lorenzo] [Grolla] [2105498]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 3) {
            throw new IllegalArgumentException("Number must be between 1 and 3");
        }
        String res = "";
        for (int i = 0; i < number; i++) {
            res += "I";
        }
        return res;
    }
}