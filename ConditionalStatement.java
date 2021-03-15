public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 23;
        if (age > 20) {
            System.out.println("You are  " + age + "  and your age is over 20 years");
        }  
        boolean maleGender = false;
        if (maleGender) {
            System.out.println("Male gender");
        } else if (!maleGender) {
            System.out.println("Famale gender");
        }
        double height = 1.95;
        if (height < 1.80) {
            System.out.println("Your height  "+ height +  " it is less than 1.80");
        } else {
            System.out.println("Your height  "+ height +  " it is over 1.80");
        }
        char firstLetterName = 'L';
        if (firstLetterName == 'M') {
            System.out.println("Your name starts with М");
        } else if (firstLetterName == 'I') {
            System.out.println("Your name starts with I");
        } else {
            System.out.println("Your name starts with a different letter, but not 'М' and but not 'I'");
        }
    }
}