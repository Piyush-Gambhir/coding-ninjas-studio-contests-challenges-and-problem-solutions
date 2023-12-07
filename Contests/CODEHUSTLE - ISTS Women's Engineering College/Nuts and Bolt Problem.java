import java.util.*;

import java.util.ArrayList;

public class Solution {
    static void findMatch(ArrayList<String> nuts, ArrayList<String> bolts, int n) {
        // Write your code here.
        Collections.sort(nuts, (nut1, nut2) -> Integer.compare(Integer.parseInt(nut1), Integer.parseInt(nut2)));
        Collections.sort(bolts, (bolt1, bolt2) -> Integer.compare(Integer.parseInt(bolt1), Integer.parseInt(bolt2)));

    }
}