package Day26LiveClassString;

public class WhyImmutable {
    public static void main(String[] args) {
        String s1 = "hello";
        String s1Intern = s1.intern();

        String s3 = new String("hello");
        String s3Intern = s3.intern();
        
        if(s1Intern == s3Intern){
            System.out.println("Yaya, we are equal");
        } else {
            System.out.println("We aren't equal");
        }

        StringBuffer s4 = new StringBuffer("Hi"); // mutable strings
        s4.append("yyy"); 

        System.out.println(s4);
    }
}
// first adderss compairs abd character by character