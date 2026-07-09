package ao.morgado.features.box;

public class BoxGeneric<T extends Integer> { // with Bounded Types: extends Number without bounder - it'll accept any type

    private T  t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}