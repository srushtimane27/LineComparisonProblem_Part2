import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import static java.lang.Math.sqrt;

public class Main {
    public static int a=5;
    public static int b=2;
    public static int c=3;
    public static int d=3;
    public static int computeLineComparison(){

        int add = a+b;
        int mul = c*d;
        System.out.println("add =  " +add);
        System.out.println("mul= " +mul);
        if(add>mul)
            System.out.println("add is greater");
        else
            System.out.println("mul is greater");
        return add;
    }

    public static void main(String[] args) {

        computeLineComparison();
    }
}