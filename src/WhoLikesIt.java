import java.util.ArrayList;
import java.util.List;

public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        List<String> namesList = new ArrayList<>();
        for (String name : names) {
            namesList.add(name);
        }
        switch (namesList.size()) {
            case 0:
                return "no one likes this";
            case 1:
                return namesList.get(0) + " likes this";
            case 2:
                return namesList.get(0) + " and " + namesList.get(1) + " like this";
            case 3:
                return namesList.get(0) + ", " + namesList.get(1) + " and " + namesList.get(2) + " like this";
            default:
                return namesList.get(0) + ", " + namesList.get(1) + " and " + (namesList.size() - 2) + " others like this";
        }
    }
}
