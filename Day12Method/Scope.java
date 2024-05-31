package Day12Method;

public class Scope {
    public static void main(String[] args) {
        {
            int s = 4;
            System.out.println(s);
        }
        //System.out.println(s);
    }
}
