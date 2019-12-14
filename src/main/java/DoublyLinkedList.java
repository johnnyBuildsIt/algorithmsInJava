class DoublyLinkedList {
    public Node head;
    public Node tail;
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
        if(nodeToInsert.next != null || nodeToInsert.prev != null) {
            this.remove(nodeToInsert);
        }

        if(node.prev == null) {
            node.prev = nodeToInsert;
            nodeToInsert.next = node;
            head = nodeToInsert;
            length++;
            return;
        }

        nodeToInsert.prev = node.prev;
        nodeToInsert.next = nodeToInsert.prev.next;
        nodeToInsert.prev.next = nodeToInsert;
        nodeToInsert.next.prev = nodeToInsert;
        length++;
    }

    public void insertAfter(Node node, Node nodeToInsert) {
        if(nodeToInsert.next != null || nodeToInsert.prev != null) {
            this.remove(nodeToInsert);
        }

        if(node.next == null) {
            node.next = nodeToInsert;
            nodeToInsert.prev = node;
            tail = nodeToInsert;
            length++;
            return;
        }

        nodeToInsert.next = node.next;
        node.next = nodeToInsert;
        nodeToInsert.prev = node;
        nodeToInsert.next.prev = nodeToInsert;
        length++;
    }

    public void insertAtPosition(int position, Node nodeToInsert) {
        if(nodeToInsert.next != null || nodeToInsert.prev != null) {
            this.remove(nodeToInsert);
        }

        if(this.isEmpty() || position == 1){
            this.setHead(nodeToInsert);
            return;
        }

        Node currNode = head;
        for(int i = 0; i < position - 1; i++) {
            if(currNode.next == null){
                this.insertAfter(currNode, nodeToInsert);
                return;
            }
            currNode = currNode.next;
        }

        this.insertBefore(currNode, nodeToInsert);
        length++;
    }

    public void removeNodesWithValue(int value) {
        Node currNode = head;
        Node nextNode;

        do {
            nextNode = currNode.next;
            if(currNode.value == value) {
                remove(currNode);
            }

            currNode = nextNode;
        } while (currNode != null);
    }

    public void remove(Node node) {
        if(length == 1) {
            head = null;
            tail = null;
            length--;
            return;
        }

        if(node.prev == null) {
            head = node.next;
            head.prev = null;
            node.next = null;
            length--;
            return;
        }

        if(node.next == null) {
            tail = node.prev;
            tail.next = null;
            node.prev = null;
            length--;
            return;
        }

        node.next.prev = node.prev;
        node.prev.next = node.next;
        node.next = null;
        node.prev = null;
        length--;
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

    public int headValue() {
        return this.head.value;
    }

    public int tailValue() {
        return this.tail.value;
    }

    public Node headNode() {
        return this.head;
    }

    public Node tailNode() {
        return this.tail;
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



