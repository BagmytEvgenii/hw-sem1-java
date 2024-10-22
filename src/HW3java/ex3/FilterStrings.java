package HW3java.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
class FilterStrings {
    public static String[] filterShortStrings(String[] arr) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : arr){
            if (s.length() > 3){
                result.add(s);
            }
        }

        String[] resultArray = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}
