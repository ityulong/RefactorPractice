package xaircraft.refactorpractice.function.introduce_parameter_object;

import java.util.Date;

public class DateRange {
    private final Date _start;
    private final Date _end;

    public DateRange(Date start, Date end) {
        this._start = start;
        this._end = end;
    }

    public Date getStart() {
        return _start;
    }

    public Date getEnd() {
        return _end;
    }

    public boolean isBetween(Date itemDate) {
        return itemDate.equals(_start) ||
                itemDate.equals(_end) ||
                itemDate.after(_start) ||
                itemDate.before(_end);
    }
}
