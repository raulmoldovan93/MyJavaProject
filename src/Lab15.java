import java.util.ArrayList;
import java.util.List;

public class Lab15 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(5);
        myList.add(6);
        myList.add(6);
        myList.add(3);
        myList.add(5);

        appendNumberList(myList, 88);
        System.out.println(myList);

    }

    public static void appendNumberList(List<Integer> list, int number) {
        list.add(number);
    }


}





