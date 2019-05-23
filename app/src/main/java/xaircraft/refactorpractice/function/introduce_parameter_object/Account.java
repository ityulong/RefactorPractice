package xaircraft.refactorpractice.function.introduce_parameter_object;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    private List<Entry> _entries = new ArrayList<>();

    public void addEntry(Entry entry) {
        _entries.add(entry);
    }

    public double getFlowBetween(DateRange range) {
        double result = 0;
        for (Entry item :
                _entries) {
            Date itemDate = item.get_chargeDate();
            if (range.isBetween(itemDate)) {
                result += item.get_value();
            }
        }
        return result;
    }


}
