import static java.lang.Math.sqrt;

public class LineComparisonUC3 {
    public static int x1 = 19;
    public static int y1 = 25;
    public static int x2 = 80;
    public static int y2 = 14;
    public static int a1 = 12;
    public static int b1 = 5;
    public static int a2 = 16;
    public static int b2 = 59;

    public static int computeLineComparison(){

        int length1 = (int) sqrt((x2-x1)^2 +(y2-y1)^2);
        int length2 = (int) sqrt((a2-a1)^2 +(b2-b1)^2);

        System.out.println("length1 = " +length1);
        System.out.println("length2 = " +length2);

        if(length1 < length2){
            System.out.println("length2 is greater than length1");
        }else{
            System.out.println("length1 is greater than length 2");
        }

        return length1;
    }

    public static void main(String[] args) {
        computeLineComparison();
    }
}
