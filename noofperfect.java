public class noofperfect {
    public static void main(String[] args) {
        int n = 3;
        int count = 0;
        int num = 1;
        while (count < n) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
