public class Main {
    public static void main(String[] args) {
        String originalString = "Emanuel, o mais novo estagiário da Target";
        String invertedString = stringIverter(originalString);

        System.out.println(invertedString);
    }

    public static String stringIverter(String str) {
        StringBuilder inverted = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            inverted.append(str.charAt(i));
        }

        return inverted.toString();
    }
}