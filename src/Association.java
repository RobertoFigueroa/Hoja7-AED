public class Association<K, V> {

    private K key;
    private V value;
    private Association left;
    private Association right;

    public Association(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public void setLeft(Association leftItem) {
        this.left = leftItem;
    }

    public void setRight(Association rightItem) {
        this.right = rightItem;
    }

    public Association getLeft() {
        return left;
    }

    public Association getRight() {
        return right;
    }
}
