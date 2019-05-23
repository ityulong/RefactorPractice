package xaircraft.refactorpractice.function.introduce_parameter_object;

import java.util.Date;

public class Entry {
    private double _value;
    private Date   _chargeDate;

    public Entry(double _value, Date _chargeDate) {
        this._value = _value;
        this._chargeDate = _chargeDate;
    }

    public double get_value() {
        return _value;
    }

    public Date get_chargeDate() {
        return _chargeDate;
    }
}
