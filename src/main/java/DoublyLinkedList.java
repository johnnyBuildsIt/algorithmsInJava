class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length = 0;

    public void setHead(Node node) {
        if(this.isEmpty()){
            this.head = node;
            this.tail = node;
            length++;
            return;
        }

        node.next = head;
        head.prev = node;
        this.head = node;
        length++;
    }

    public void setTail(Node node) {
        if(this.isEmpty()) {
            this.tail = node;
            this.head = node;
            length++;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
        length++;
    }

    public void insertBefore(Node node, Node nodeToInsert) {
        // Write your code here.
    }

    public void insertAfter(Node node, Node nodeToInsert) {
        // Write your code here.
    }

    public void insertAtPosition(int position, Node nodeToInsert) {
        // Write your code here.
    }

    public void removeNodesWithValue(int value) {
        // Write your code here.
    }

    public void remove(Node node) {
        // Write your code here.
    }

    public boolean containsNodeWithValue(int value) {
        Node currNode = head;

        if(head == null) return false;

        do{
            if(currNode.value == value) return true;

            currNode = currNode.next;
        } while(currNode != null);

        return false;
    }

    public boolean isEmpty() {
        return head == null && tail == null ? true : false;
    }

    public int get(int index) {
        Node currNode = head;
        for(int i = 0; i < index; i++) {
            currNode = currNode.next;
        }

        return currNode.value;
    }

    public int length() {
        return length;
    }

    public int head() {
        return this.head.value;
    }

    public int tail() {
        return this.tail.value;
    }

    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}



