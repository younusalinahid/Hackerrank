import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {

    public static void main(String[] args) {

        String[] words = {"mass","as","hero","superhero"};
        List<String> subString = new ArrayList<>();

        for(String word : words){
            for(String subwords : words){
                if(!word.equals(subwords) && subwords.contains(word)){
                    subString.add(word);
                    break;
                }
            }
        }
        System.out.println(subString);
    }
}