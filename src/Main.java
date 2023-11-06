public class Main {

    public static int numberOfVowels (String str){
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static int notDivisibleBy235 (int N){
        int count = 0;
        for (int i = 1; i <= N; i++){
            if (i%2 !=0 && i%3 !=0 && i%5 !=0){
                count++;
            }
        }
        return count;
    }

    public static String camelCaseMe(String str) {
        int length = str.length();
        boolean capitalizeNext = false;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);

            if (ch == '-' || ch == '_') {
                capitalizeNext = true;
            } else if (Character.isLetter(ch)) {
                if (capitalizeNext || i == 0) {
                    result.append(Character.toUpperCase(ch));
                    capitalizeNext = false;
                } else {
                    result.append(Character.toLowerCase(ch));
                }
            }
        }

        return result.toString();
    }
}