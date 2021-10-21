package message;

import java.util.ArrayList;
import java.util.List;

public abstract class Message {
    protected final String prefix;
    protected final List<String> storage;

    public Message(String prefix) {
        this.prefix = prefix;
        storage = new ArrayList<>();
    }

    public String getPrefix() {
        return prefix;
    }

    public boolean isNewMessageType(Class<?> c1, Class<?> c2) {
//        String name1 = c1.getCanonicalName();
//        String name2 = c2.getCanonicalName();
//        boolean a = Objects.equals(name1, name2);
//        return !a;
        return false;
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

    protected int countSum(int externalSum, int income, Integer max, Integer min) {
        long sum = (long) externalSum + (long) income;
        long result = checkOverflow(sum, max, min);

        if (result > sum) {
            storage.add(min.toString());
        } else if (result < sum) {
            storage.add(max.toString());
        }
        return (int) result;
    }

    public List<String> getStorage() {
        List<String> copy = copyStorageWithPrefixes();
        storage.clear();
        return copy;
    }

    private List<String> copyStorageWithPrefixes() {
        ArrayList<String> result = new ArrayList<>();
        for (String string : storage) {
            result.add(prefix + string);
        }
        return result;
    }

    abstract void countRepetitive(Object message);
}
