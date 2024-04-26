// Given a number from the user convert into its word representation. Eg: 10 should be Ten.

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int number= sc.nextInt();
        if(number<0 || number>19){
            System.out.println("Enter number in range 0 to 19");
        }
        else{
        String word[] ={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
        System.out.println(word[number]);
        }
    }
}
