package Day30OOPs;

public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "AKGEC"; // Set schoolName for all Student instances

        Student s2 = new Student();
        System.out.println(s2.schoolName); // This will print "AKGEC" since schoolName is static

        Student s3 = new Student();
        s3.schoolName = "Abced"; // Now change the school name of all object
        System.out.println(s1.schoolName); // This will print "Abced"

    }
}

class Student {

    // Create a static method or function
    static int returnPerecentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }

    String name;
    int roll;

    static String schoolName; // Static variable shared among all instances of Student

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
