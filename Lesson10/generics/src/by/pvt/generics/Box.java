package by.pvt.generics;




public class Box<T extends Number> {
    private T value;

    public Box(T value) {
        if (value == null) {
            this.value = (T) (Number)0;//optimistic

            //pessimistic
            //throw new IllegalArgumentException("value cannot be null");
        } else {
            this.value = value;
        }
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return super.toString()+" " +
                value.getClass().getName()+":"+
                value.toString();
    }
}
