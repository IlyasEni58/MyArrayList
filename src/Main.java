import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        MyArrayList<String> exemple = new MyArrayList<>();

        exemple.add("2");
        exemple.add("4");
        exemple.add("1");
        exemple.add("3");
        exemple.removeAt(2);
        exemple.clear();


        for(int i = 0; i < exemple.size(); i++){
            System.out.println(exemple.get(i));
        }

//        for(String b : bratva){
//            System.out.println(b);
//        }
    }
}