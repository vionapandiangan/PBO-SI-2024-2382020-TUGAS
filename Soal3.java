public class Soal3 {
    public static void main(String[] args) {
        String camelCaseWord1 = "satuDuaTiga";
        String camelCaseWord2 = "saveChangesInTheEditor";

        System.out.println("Jumlah kata dalam '" + camelCaseWord1 + "': " + countCamelCaseWords(camelCaseWord1));
        System.out.println("Jumlah kata dalam '" + camelCaseWord2 + "': " + countCamelCaseWords(camelCaseWord2));
    }

    public static int countCamelCaseWords(String camelCase) {
        if (camelCase == null || camelCase.isEmpty()) {
            return 0;
        }

        int wordCount = 1;
        for (char ch : camelCase.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                wordCount++;
            }
        }
        return wordCount;
    }
}
