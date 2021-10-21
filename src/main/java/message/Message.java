package message;

import java.util.ArrayList;
import java.util.List;

public abstract class Message {
    protected final String prefix;

    public Message(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }

    protected long checkOverflow(long result, int max, int min) {
        if (result > max) {
            return result - max;
        }
        if (result < min) {
            return result + min;
        }
        return result;
    }

    protected int countSum(int externalSum, int income, Integer max, Integer min, List<String> storage) {
        long sum = (long) externalSum + (long) income;
        long result = checkOverflow(sum, max, min);

        if (result > sum) {
            storage.add(min.toString());
        } else if (result < sum) {
            storage.add(max.toString());
        }
        return (int) result;
    }

    public List<String> getStorage(List<String> storage) {
        List<String> copy = copyStorageWithPrefixes(storage);
        storage.clear();
        return copy;
    }

    private List<String> copyStorageWithPrefixes(List<String> storage) {
        ArrayList<String> result = new ArrayList<>();
        for (String string : storage) {
            result.add(prefix + string);
        }
        return result;
    }

    public abstract List<String> accumulate(List<String> storage);
//    public abstract String getMessageString();
}
