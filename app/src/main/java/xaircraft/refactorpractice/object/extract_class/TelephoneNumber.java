package xaircraft.refactorpractice.object.extract_class;

public class TelephoneNumber {
    private String areCode;
    private String phoneNumber;

    public String getAreCode() {
        return areCode;
    }

    public void setAreCode(String areCode) {
        this.areCode = areCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTelephoneNumber() {
        return ("(" + getAreCode() + ")" + getPhoneNumber());
    }
}
