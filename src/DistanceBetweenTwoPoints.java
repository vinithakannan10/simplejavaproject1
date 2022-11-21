public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        double distance;
        x1 = 2;y1= 2;x2 = 4;y2 = 4;
       // formula distance
        // distance = squareRoot of (x2-x1)^2+(y2-y1)^2;
        distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("distance between two points are:"+distance);
    }
}
