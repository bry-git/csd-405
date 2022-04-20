/**
 * Bryson Crandall
 * apr 19
 * csd 405 module 6
 * */

public class UseDivision {

    public static void main(String[] args) {
        InternationalDivision japan = new InternationalDivision("Japan", "Japanese");
        InternationalDivision uk = new InternationalDivision("United Kingdom", "English");

        DomesticDivision nebraska = new DomesticDivision("NE");
        DomesticDivision washington = new DomesticDivision("WA");

        japan.display();
        uk.display();
        nebraska.display();
        washington.display();
    }
}
