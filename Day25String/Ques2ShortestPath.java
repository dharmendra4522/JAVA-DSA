package Day25String;

public class Ques2ShortestPath {
    public static float getShortestPath(String path){  //Linera tine O(n) because we run one loop
        int x =0, y =0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i); //Direction
            //South
            if(dir == 'S'){
                y--;
            } 
            //North
            else if(dir == 'N'){
                y++;
            } 
            //West
            else if(dir == 'W'){
                x--;
            }
            //East
            else{
                x++;
            }
        }
        //Squre of x and y
        int X2 = x*x;
        int Y2 = y*y;

        //Type casting becase the sqrt function return Double data type value
        return (float)Math.sqrt(X2 + Y2);
    } 
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
