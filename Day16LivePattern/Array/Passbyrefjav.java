package Array;

public class Passbyrefjav {
    static void change(int arr[]){
        arr[0]=44;
        arr[1]=55;
    }
    public static void main(String[] args) {
        int arr[] =new int[2];
        arr[0]=10;
        arr[1]=20;
        
        change(arr);
        System.out.println("After change value:"+arr[0]);
        System.out.println("After change value:"+arr[1]);
        
       

    }
}
