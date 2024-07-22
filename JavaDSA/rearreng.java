public class rearreng {

    public static String mergeStrings(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return null;
        }
        if (str1 == null) {
            return str2;
        }
        if (str2 == null) {
            return str1;
        }

        int len1 = str1.length();
        int len2 = str2.length();
        StringBuilder result = new StringBuilder(len1 + len2);

        int i = 0, j = 0;
        while (i < len1 && j < len2) {
            if (str1.charAt(i) <= str2.charAt(j)) {
                result.append(str1.charAt(i));
                i++;
            } else {
                result.append(str2.charAt(j));
                j++;
            }
        }

        // Append remaining characters from str1
        while (i < len1) {
            result.append(str1.charAt(i));
            i++;
        }

        // Append remaining characters from str2
        while (j < len2) {
            result.append(str2.charAt(j));
            j++;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str1 = "are";
        String str2 = "denim";
        System.out.println("Merged and rearranged string: " + mergeStrings(str1, str2));
    }
}