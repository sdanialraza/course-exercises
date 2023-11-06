public class Main {
    public static void main(String[] args) {
        System.out.println(isTrue(false));
    }

    /**
     * Returns whether the provided boolean is true or not.
     *
     * @param boolean1 - The boolean to check.
     * @returns Whether the provided boolean is true or not.
     * 
     * @author sdanialraza
     * @version 1.0.0
     * @since 1.0.0
     */
    public static Boolean isTrue(Boolean boolean1) {
        return boolean1 ? true : false;
    }
}