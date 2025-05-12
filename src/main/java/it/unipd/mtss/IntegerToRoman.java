////////////////////////////////////////////////////////////////////
// [Samuele] [Perozzo] [2110989]
// [Lorenzo] [Grolla] [2105498]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {

        String[] roman = {"M","CM","D","CD","C","XC","L",
                        "XL","X","IX","V","IV","I"};
        int[] arab = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

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