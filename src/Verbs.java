public class Verbs {
    private static String[] verbList = {"is"};

    public static boolean checkIsVerb (String word) {
        for (int i = 0; i < verbList.length; i++) {
            if (verbList[i].equals(word)) {
                return true;
            }
        }
        return false;
    }

    public static void is (String a, String b) {

    }
}
