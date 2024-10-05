package Day55Gready;

import java.util.*;

public class ChocolaProblem {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4}; // m-1 cuts for vertical
        Integer costHor[] = {4, 1, 2};      // n-1 cuts for horizontal
        
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        // Greedily select cuts
        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] >= costHor[h]) { // Take vertical cut
                cost += costVer[v] * hp;
                vp++;
                v++;
            } else { // Take horizontal cut
                cost += costHor[h] * vp;
                hp++;
                h++;
            }
        }

        // If horizontal cuts are remaining
        while (h < costHor.length) {
            cost += costHor[h] * vp;
            hp++;
            h++;
        }

        // If vertical cuts are remaining
        while (v < costVer.length) {
            cost += costVer[v] * hp;
            vp++;
            v++;
        }

        System.out.println("Minimum cost of cuts = " + cost);
    }
}
