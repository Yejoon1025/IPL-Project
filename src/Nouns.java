public class Nouns {

    private static String[] nounList = {"Dog", "Cat", "Person", "Apple"};

    public static boolean checkIsNoun (String word) {
        for (int i = 0; i < nounList.length; i++) {
            if (nounList[i].equals(word)) {
                return true;
            }
        }
        return false;
    }
}
