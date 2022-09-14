public class CompositeNumber {
    public static Boolean isComposite(int n) {
        if (n < 4) return false;
        for (int i = 2; i < n; i++) {
           if (n % i == 0) return true;
        }
        return false;     
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        for (int i = a; i <= b; i++) {
            if (isComposite(i)) System.out.print(i + " ");
        }
        System.out.println();
    }
}