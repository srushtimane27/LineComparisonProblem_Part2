import static java.lang.Math.sqrt;

public class LineComparisionUC2 {
    public static int x1=84;
    public static int y1=52;
    public static int x2=5;
    public static int y2=8;
    public static int x3=8;
    public static int y3=7;
    public static int x4=10;
    public static int y4=15;



    public static int computeLineComparison(){

        int length1 = (int) sqrt((x2-x1)^2+(y2-y1)^2);
        int length2 = (int) sqrt((x4-x3)^2 +(y4-y3)^2);

        System.out.println("length 1 = " +length1);
        System.out.println("length 2 = " +length2);

        if(length1 == length2)
            System.out.println("Two lines are equal");
        else
            System.out.println("Two lines are not equal");


        return 0;


    }

    public static void main(String[] args) {
        computeLineComparison();
    }
}
