public class binarytree {
    public static void main(String[] args) {

    }
}

class Tree {
    Node root;

    public void add(int e) {
        if (root == null) {
            root = new Node();
            root.data = e;
        } else {
            root.add(e);
        }
    }

    public boolean contains(int e) {
        if (root == null) {
            return false;
        } else {
            return root.contains(e);
        }
    }

    public void remove(int e) {
        if (root == null) {
            return;
        }
        else {
            root.remove(e);
        }
    }
}

class Node {
    Node left;
    Node right;
    int data;

    public void remove(int e){
        if (data == e){
            if (left.data > e){
                this.data = left.data;
                left.remove(data);
            }
            else if (right.data > e){

            }
        }
    }
    public void add(int e) {
        if (e > data) {
            if (right == null) {
                right = new Node();
                right.data = e;
            } else {
                right.add(e);
            }

        }
        if (e < data) {
            if (left == null) {
                left = new Node();
                left.data = e;
            } else {
                left.add(e);
            }
        }
    }

    public boolean contains(int e) {
        if (e == data) {
            return true;
        }
        else if (e > data) {
            if (right == null) {
                return false;
            }
            else {
                return right.contains(e);
            }
        } else if (e < data) {
            if (left == null) {
                return false;
            }
            else {
                return left.contains(e);
            }
        }
        return false;
    }
}
