import java.util.ArrayList;
import java.util.List;

public class Seconds {

  public static void main(String[] args) {
    List listTocheck = new ArrayList();
    for (int i = 0; i < 100; i++) {
      listTocheck.add(i);
    }

    System.out.println(everySecondGoesBack(listTocheck));
  }

  public static List<Integer> everySecondGoesBack(List<Integer> incomingList) {
    List<Integer> templist = new ArrayList<>();
    for (int i = 0; i < incomingList.size(); i += 2) {
      templist.add(incomingList.get(i));
    }
    return templist;
  }
}
