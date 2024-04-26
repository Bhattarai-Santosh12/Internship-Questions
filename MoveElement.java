import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoveElement {
    public static void main(String[] args) {
        String[] listArray= {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6"};
        List <String> StrList= Arrays.asList(listArray);
        Collections.shuffle(StrList);
        StrList.toArray(listArray);
        System.out.println("The suffled list of string  are"+StrList);
    }
}
