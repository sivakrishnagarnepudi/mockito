package model;

import java.util.ArrayList;
import java.util.List;

// Define the Node class with a generic type T
public class Node<T> {
    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", children=" + children +
                '}';
    }

    public T data;
    public List<T> children;

    public Node() {
    }
}
