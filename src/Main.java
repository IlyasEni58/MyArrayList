import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        MyArrayList<Integer> bratva = new MyArrayList<>();

        bratva.add(3);
        bratva.add(4);
        bratva.add(1);
        bratva.add(4);
        bratva.remove(2);

        for(int i = 0; i < bratva.size(); i++){
            System.out.println(bratva.get(i));
        }

//        for(String b : bratva){
//            System.out.println(b);
//        }
    }
}