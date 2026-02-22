public class OOPSBannerApp {
    public static void main(String[] args) {
        // We use String.join to combine spaces and stars efficiently!
        System.out.println(String.join("", " ****", " ****", " ****", " **** "));
        System.out.println(String.join("", "* *", "* *", "* *", "* "));
        System.out.println(String.join("", "* *", "* *", "* *", "**** "));
        System.out.println(String.join("", "* *", "* *", "*****", "    *"));
        System.out.println(String.join("", "* *", "* *", "* ", "    *"));
        System.out.println(String.join("", "* *", "* *", "* ", "    *"));
        System.out.println(String.join("", " ****", " ****", "* ", " **** "));
    }
}