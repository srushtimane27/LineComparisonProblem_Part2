import static java.lang.Math.sqrt;

public class LineComparisonUC1 {
    public static int x1 = 10;
    public static int x2 = 2;
    public static int y1 = 5;
    public static int y2 = 8;



    public static int computeLineComparison(){

        int length = (int)sqrt(x2-x1)^2+(y2-y1)^2;
        System.out.println("Length of a line =  " +length);
        return length;
    }

    public static void main(String[] args) {

        computeLineComparison();
    }
}
