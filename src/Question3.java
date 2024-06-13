public class Question3 {
    public static void calculateChar(String input){
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int symbolCount = 0;

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowercaseCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else {
                symbolCount++;
            }
        }

        System.out.println("uppercase : " + uppercaseCount);
        System.out.println("lowercase : " + lowercaseCount);
        System.out.println("angka : " + digitCount);
        System.out.println("symbol : " + symbolCount);
    }

    public static void main(String[] args) {
        calculateChar("pemrogramanDasarJava1");
    }
}
