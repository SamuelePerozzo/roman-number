////////////////////////////////////////////////////////////////////
// [Samuele] [Perozzo] [2110989]
// [Lorenzo] [Grolla] [2105498]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 6) {
            throw new IllegalArgumentException("Number must be between 1 and 6");
        }

        String[] roman = {"V","IV","I"};
        int[] arab = {5,4,1};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arab.length; i++) {
            while (number >= arab[i]) {
                result.append(roman[i]);
                number -= arab[i];
            }
        }

        return result.toString();
    }
}