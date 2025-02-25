package Day92DP2Practice;

public class Parantheses {

    static void _printParentheses(char str[], int pos, int n, int open, int close){
        if(close == n){
            for(int i=0; i<str.length; i++){
                System.out.print(str[i]);
            }
            System.out.println();
            return;
        } else{
            if(open > close){
                str[pos] = '}';
                _printParentheses(str, pos+1, n, open, close+1);
            }
            if(open < n){
                str[pos] = '{';
                _printParentheses(str, pos+1, n, open+1, close);
            }
        }
    }

    public static void printParentheses(char str[], int n){
        if(n>0){
            _printParentheses(str, 0, n, 0, 0);
        }
        return;
    }

    public static void main(String[] args) {
        int n = 10;
        char[] str = new char[2 * n];
        printParentheses(str, n);
    }
}