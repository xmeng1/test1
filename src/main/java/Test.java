import static java.lang.System.out;

/**
 * <p>Date:    05/02/18
 *
 * @author mengxin
 * @version 1.0
 */
public class Test {
    public static void main(String args[]) {
        Integer arrayLength = Integer.MAX_VALUE;
        Object[] objectProperties = null;
        objectProperties = new Object[2396729];
        out.print(objectProperties.length);
        // for (int i=1; i<1000000000;i=i+1000) {
        //     try {
        //         objectProperties = new Object[arrayLength - i];
        //     } catch (OutOfMemoryError e) {
        //         out.print(e.toString());
        //     }
        //     if (objectProperties != null) {
        //         out.print(objectProperties.length);
        //     }
        // }
    }
}
