package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String paddedString = stringToBePadded;
        while (paddedString.length() < amountOfPadding) {
            paddedString = " " + paddedString;
        }
        return paddedString;

    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String paddedString = stringToBePadded;
        while (paddedString.length() < amountOfPadding) {
            paddedString =  paddedString + " ";
        }
        return paddedString;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {

        String stringToRepeat = "Hello";
        Integer numberOfTimesToRepeat = 5;
        StringBuilder expected = new StringBuilder();
        for(int i=0 ; i<numberOfTimeToRepeat; i++) {

            expected.append(stringToBeRepeated);

        }
        return expected.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {

        for (int i=0; i<string.length(); i++) {
            char c = string.charAt(i);
            if (!Character.isLetter(c) && !Character.isSpaceChar(c))
                return false;
        }

       return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        for (int i=0; i<string.length(); i++) {
            char c = string.charAt(i);
            if (!Character.isDigit(c) && !Character.isSpaceChar(c))
                return false;
        }

        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
       /* for (int i=0; i<string.length(); i++) {
            char c = string.charAt(i);
            if (!Character.isDigit(c) || !Character.isLetter(c) || !Character.isSpaceChar(c))
                return true;
        }

        return false;

        */
        Boolean isalpha = isAlphaString(string);
        Boolean isnumeric = isNumericString(string);
        Boolean isspecial = true;
        if (isalpha || isnumeric) isspecial = false;

        for (int i = 0; i < string.length(); i++) {
            String strToCheck = String.valueOf(string.charAt(i));
            if (strToCheck.toUpperCase().matches("[A-Z]")) {
                isspecial = false;
            } else if (strToCheck.matches("[0-9]")) {
                isspecial = false;
            }
        }
        return isspecial;

      // return !isNumericString(string) && !isAlphaString(string);
    }
}
