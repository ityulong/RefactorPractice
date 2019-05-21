package xaircraft.refactorpractice.object.extract_class;

public class Person {
    private String name;
    private TelephoneNumber mTelephoneNumber = new TelephoneNumber();


    public String getTelephoneNumber() {
        return mTelephoneNumber.getTelephoneNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficeAreaCode() {
        return mTelephoneNumber.getAreCode();
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        mTelephoneNumber.setAreCode(officeAreaCode);
    }

    public String getOfficeNumber() {
        return mTelephoneNumber.getPhoneNumber();
    }

    public void setOfficeNumber(String officeNumber) {
        mTelephoneNumber.setPhoneNumber(officeNumber);
    }
}
