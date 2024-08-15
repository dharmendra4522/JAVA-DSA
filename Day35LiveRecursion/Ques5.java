package Day35LiveRecursion;

public class Ques5 {
    static int total = 3;

    public static void toh(char src, char dest, char aux, int n) {

        if (n == 0) {
            return;
        }

        toh(src, aux, dest, n - 1); // 1st faith (choti discs source --> extra tower )

        System.out.println((total - n + 1) + ". disc mover from " + src + " tower to " + dest + " tower");

        toh(aux, dest, src, n - 1); // 2nd faith(choti dest ---> destination tower)
    }

    public static void main(String[] args) {
        toh('A', 'c', 'B', 3);
    }
}
