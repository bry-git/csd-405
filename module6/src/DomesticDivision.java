/**
 * Bryson Crandall
 * apr 19
 * csd 405 module 6
 * */

public class DomesticDivision extends Division{

    private String _state;

    public DomesticDivision(String state) {
        _state = state;
    }

    @Override
    public void display() {
        System.out.println("state : " + _state);
    }


}
