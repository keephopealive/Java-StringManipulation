public class StringManipulator {

    public String trimAndConcat(String strA, String strB) {
        strA = strA.trim();
        strB = strB.trim();
        String strC = strA.concat(strB);
        return strC;
    }
    
    public Integer getIndexOrNull(String myString, char myCharMatch) {
        Integer num = myString.indexOf(myCharMatch);
        if ( num >= 0 ){
            return num;
        } else {
            return null;
        }
    }

    public Integer getIndexOrNull(String myString, String myStringMatch) {
        Integer num = myString.indexOf(myStringMatch);
        if ( num >= 0 ){
            return num;
        } else {
            return null;
        }
    }   

    public static String concatSubstring(String myStringA, int myIntA, int myIntB, String myStringB) {
        String newString = "";
        for (Integer a = myIntA; a < myIntB; a++ ){
            newString = newString.concat(String.valueOf(myStringA.charAt(a)));
        }
        newString = newString.concat(myStringB);
        return newString;
    }

}
