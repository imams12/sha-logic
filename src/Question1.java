public class Question1 {
    public static void rusak(int n){
        if (n == 0) {
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
        }

        rusak((int) n/2);
    }

    public static void main(String[] args) {
        rusak(1000);
    }
}
