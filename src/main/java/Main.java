public class Main {
    public static void main(String[] args) {
        AcademyBugsTest test = new AcademyBugsTest();
        test.setUp();
        test.testAddToCart("ec_add_to_cart_5");
        test.testAddToCart("ec_add_to_cart_4");
        test.testAddToCart("ec_add_to_cart_25");

        test.driver.get("https://academybugs.com/my-cart/");
//        test.tearDown();
    }
}