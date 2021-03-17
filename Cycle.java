public class Cycle {
    public static void main(String[] args) {
        System.out.println("1.All numbers from [0, 20] :");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
       }
        System.out.println("2.All numbers from [6, -6] (with iteration step 2) :");
        int i = 2;
        int result = 6;
        while (result >= -6) {
            System.out.println(result);
            result = result - i;
       } 
        System.out.println("3.The sum of odd numbers from [10, 20] :");
        int i1 = 10;
        int sum = 0;
        do {
           if (i1 % 2 != 0) {
               sum += i1;
             System.out.println(i1);
            }   
            i1++;
        } while (i1 <= 20);
             System.out.println("Sum of odd numbers = " + sum);
    }
}