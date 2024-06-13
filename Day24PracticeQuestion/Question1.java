package Day24PracticeQuestion;

class Question1 {
    public static void printnumber(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println("Count of 7 is: "+count);
    }

    public static void main(String[] args) {
        int arr[][] = {{4,7,8},
                       {8,8,7}};
                       
         printnumber(arr);

    }
}