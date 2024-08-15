package Day30OOPs;

public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();  
        myAcc.username = "dharm";
        /*password can not access
        myAcc.password = "123456"; */
        myAcc.setPassword("abcdefghi");
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;

    }
}