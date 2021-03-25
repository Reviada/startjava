public class Cycle {
    public static void main(String[] args) {
        System.out.println("1.All numbers from [0, 20] :");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("2.All numbers from [6, -6] (with iteration step 2) :");
        int result = 6;
        while (result >= -6) {
            System.out.println(result);
            result -= 2;
        }

        int i1 = 10;
        int sum = 0;
        do {
           if (i1 % 2 != 0) {
               sum += i1;
           }   
           i1++;
        } while (i1 <= 20);
        System.out.println("3.Sum of odd numbers = " + sum);
    }
}