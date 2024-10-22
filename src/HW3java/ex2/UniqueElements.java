package HW3java.ex2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
class UniqueElements {
    public static int[] getUniqueElements(int[] a) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : a){
            if (!result.contains(num)){
                result.add(num);
            }

        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);

        }
        return resultArray;

    }
}
