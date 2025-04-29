public class TestBST {
    public static void main(String[] args) {
        BST<Integer, String> tree = new BST<>();
        tree.put(50, "A");
        tree.put(30, "B");
        tree.put(70, "C");
        tree.put(20, "D");
        tree.put(40, "E");
        tree.put(60, "F");
        tree.put(80, "G");

        System.out.println("Размер дерева: " + tree.size());

        for (var entry : tree) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }
    }
}
