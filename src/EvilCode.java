public class EvilCode {
    public static void beEvil(Organization org) {
        Fund f = org.getFund();
        f.name = "Ha ha I changed it!";
        f.clearDonations();
    }
}