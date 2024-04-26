import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagarm {
    public static void main(String[] args) {
        String str1= "act";
        String str2= "cat";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //checking length of string
        if(str1.length()==str2.length()){//checks two string are equal
            char[] charArray1= str1.toCharArray();// converting to array of characters
            char[] charArray2= str2.toCharArray();

            Arrays.sort(charArray1);// sorting character array
            Arrays.sort(charArray2);

            boolean result=Arrays.equals(charArray1, charArray2);// check if both array cointain same elements
            if(result){
                System.out.println(str1 + " and " + str2 +" are anagram string");
            }else{
                System.out.println(str1 + " and " + str2 +" are not anagram string");
            }
        }else{
            System.out.println(str1 + " and " + str2 +" are not anagram string ");
        }
    }
}
