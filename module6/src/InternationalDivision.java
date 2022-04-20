/**
 * Bryson Crandall
 * apr 19
 * csd 405 module 6
 * */

public class InternationalDivision extends Division{

    private final String _country;
    private final String _language;

    public InternationalDivision(String country, String language) {
        _country = country;
        _language = language;
    }

    @Override
    public void display() {
        System.out.println("country: : " +_country + "\n" + "language : " + _language);
    }
}
