public class Box2<T extends Number> {
    private T object;

    public Box2(T object){
        this.object = object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public T createNew(T object){
        return object;
    }

}
