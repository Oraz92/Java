package JavaProgrammingII.Part12.ArraysAndHashTables.List;

public class List<Type> {

    private Type[] list;
    private int freeIndex;

    public List() {
        this.list = (Type[]) new Object[10];
        this.freeIndex = 0;
    }

    public void add(Type value) {
        if (this.freeIndex == this.list.length) {
            grow();
        }

        this.list[this.freeIndex] = value;
        this.freeIndex++;
    }

    private void grow() {
        int newSize = this.list.length + this.list.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < this.list.length; i++) {
            newValues[i] = this.list[i];
        }
        this.list = newValues;
    }

    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return; // not found
        }

        moveToTheLeft(indexOfValue);
        this.freeIndex--;
    }

    public boolean contains(Type value) {
        return indexOfValue(value) >= 0;
    }

    public int indexOfValue(Type value) {
        for (int i = 0; i < this.freeIndex; i++) {
            if (this.list[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public Type value(int index) {
        if (index < 0 || index >= this.freeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.freeIndex + "]");
        }
        return this.list[index];

    }

    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < freeIndex - 1; i++) {
            this.list[i] = this.list[i + 1];
        }
    }

    public Type get(int index) {
        for (int i = 0; i < size(); i++) {
            if (i == index) {
                return this.list[i];
            }
        }
        return null;
    }

    public int size() {
        return this.freeIndex;
    }
}
