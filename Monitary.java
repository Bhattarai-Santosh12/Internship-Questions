// import java.text.DecimalFormat;
// import java.util.Scanner;

// public class Monitary {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter any number");
//         double number= sc.nextInt();
//         String s=String.valueOf(number);
//         DecimalFormat formatte=new DecimalFormat("##,##,##,###.00");
//         String formattedNumber = formatte.format(number);
//         // double i=Integer.parseInt(formattedNumber);  
//         System.out.println(formattedNumber);
//     }
// }

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Monitary {
    public static void main(String[] args) {
        double number = 111625.92822;
        String pattern = "#,##,##0.00";

        // Create formatter with Nepali pattern
        DecimalFormat formatter = new DecimalFormat(pattern);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        formatter.setDecimalFormatSymbols(symbols);

        // Format Nepali style
        formatter.setGroupingSize(2);
        String formattedNumber = formatter.format(number);
        System.out.println("Nepali Format: " + formattedNumber); 

        // Reformat International style
        formatter.applyPattern("#,##0.00");
        formatter.setGroupingSize(3); 
        formattedNumber = formatter.format(number);
        System.out.println("International Format: " + formattedNumber);
    }
}
