import java.util.*;

public class BST<K extends Comparable<K>, V> implements Iterable<Map.Entry<K, V>> {
    private class Node {
        K key;
        V value;
        Node left, right;

        Node(K k, V v) {
            key = k;
            value = v;
        }
    }

    private Node root;
    private int size;

    public void put(K key, V value) {
        Node newNode = new Node(key, value);
        if (root == null) {
            root = newNode;
            size++;
            return;
        }

        Node current = root;
        while (true) {
            int cmp = key.compareTo(current.key);
            if (cmp == 0) {
                current.value = value;
                return;
            } else if (cmp < 0) {
                if (current.left == null) {
                    current.left = newNode;
                    size++;
                    return;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    size++;
                    return;
                }
                current = current.right;
            }
        }
    }

    public V get(K key) {
        Node current = root;
        while (current != null) {
            int cmp = key.compareTo(current.key);
            if (cmp == 0) return current.value;
            else if (cmp < 0) current = current.left;
            else current = current.right;
        }
        return null;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return new Iterator<>() {
            private Stack<Node> stack = new Stack<>();
            private Node current = root;

            {
                while (current != null) {
                    stack.push(current);
                    current = current.left;
                }
            }

            @Override
            public boolean hasNext() {
                return !stack.isEmpty();
            }

            @Override
            public Map.Entry<K, V> next() {
                Node node = stack.pop();
                Map.Entry<K, V> entry = new AbstractMap.SimpleEntry<>(node.key, node.value);
                Node right = node.right;
                while (right != null) {
                    stack.push(right);
                    right = right.left;
                }
                return entry;
            }
        };
    }
}
