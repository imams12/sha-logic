public class Question2 {
    public static int roger(int k, int b){
        if (b == 1) return 1;
        else if (k % b == 0) return 1 + roger(k - 1, b);
        else return 0 + roger(k, --b);
    }

    public static void main(String[] args) {
        System.out.println(roger(8, 8));
    }
}
