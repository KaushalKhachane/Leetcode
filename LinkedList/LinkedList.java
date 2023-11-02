public class LinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    static int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == tail) {
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void printList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("LL is empty");
            return;
        } else {
            System.out.println("Linked List: ");
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print("end\n");
        }

    }

    public void addInMiddle(int idx, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int count = 0;

        while (temp != null) {
            if (count == idx - 1) {
                newNode.next = temp.next;
                ;
                temp.next = newNode;
                break;
            } else {
                temp = temp.next;
                count++;
            }
        }
        size++;
    }

    public int sizeLL() {
        return size;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty can't remove first");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        } else {
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty can't remove last element");
            return -1;
        } else if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        } else {
            Node prev = head;
            for (int i = 0; i < size - 2; i++) {
                prev = prev.next;
            }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }
    }

    public int searchLL(int key) {
        if (size == 0) {
            System.out.println("Empty LL can't search");
            return -1;
        } else {
            int i = 0;
            Node temp = head;
            while (temp != null) {
                if (temp.data == key) {
                    return i;
                }
                temp = temp.next;
                i += 1;
            }
            return i;
        }
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        
        int index = helper(head.next, key);
        if(index == -1){
            return -1;
        }
        return index+1;
    }

    public int recursiveSearch(int key){
        return helper(head, key);
    }

    public void reverseList(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);

        list.addLast(20);
        list.addInMiddle(1, 15);

        list.printList();
        // System.out.println("Removed Element: " + list.removeFirst());
        // System.out.println("Removed Element: " + list.removeFirst());
        // System.out.println("Removed Element: " + list.removeFirst());
        // System.out.println("Removed Element: " + list.removeFirst());

        // System.out.println("Removed Last Element: " + list.removeLast());
        // System.out.println("Removed Last Element: " + list.removeLast());
        list.printList();
        System.out.println("Search Done element found at index(0 based indexing): "+list.recursiveSearch(15));
        if(list.recursiveSearch(35) == -1){
            System.out.println("KEY NOT FOUND!!! ");
        }
        System.out.println("Size: " + list.sizeLL());

        System.out.println("Reverse List: ");
        list.reverseList();
        list.printList();
    }

}
