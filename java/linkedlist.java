
class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void printlist() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    // insertion in the linked list

    // at front
    public void push(int data) {
        Node newnode = new Node(data);

        newnode.next = head;
        head = newnode;
    }

    // anywhere
    public void insertAfter(Node prev_node, int data) {
        if (prev_node == null) {
            System.out.println("the given previos node cannot be null");
            return;
        }
        Node newnode = new Node(data);
        newnode.next = prev_node.next;
        prev_node.next = newnode;

    }

    public void append(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newnode;
        return;
    }

    public void deletNode(int key) {

        Node temp = head, prev = null;

        while (temp != null && temp.data == key) {
            head = temp.next; // deleting the head
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // if linked list is empty
        if (temp == null)
            return;

        // deleting the node
        prev.next = temp.next;
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            return;
        }
        Node node = head, prev = null;
        int i = 0;

        if (position == 0) {
            head = node.next;
            return;
        }

        while (node != null && i != position) {
            prev = node;
            node = node.next;
            i++;
        }
        if (node == null) {
            return;
        }
        prev.next = node.next;
    }

    public void deletelist() {
        head = null;
    }

    public int getCountRecursively(Node node) {

        if (node == null) {
            return 0;

        }

        return 1 + getCountRecursively(node.next);
    }

    public int length() {
        return getCountRecursively(head);
    }

    public void searchIterative(int key) {
        Node temp = head;
        if (head == null) {
            return;
        }
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }

        if (temp.data == key) {
            System.out.println("yes the element " + key + " consist in the linked list");
        }
    }

    public boolean searchRecursively(Node head, int key) {

        if (head == null) {
            return false;
        }
        while (head.data == key) {
            return true;
        }

        return searchRecursively(head.next, key);
    }

    public void nthnodeIterative(int n) {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            temp = temp.next;
            count++;
        }
        if (count < n) {
            return;
        }

        temp = head;
        // nth node from the last it means count - n +1 node from the beginning
        for (int i = 1; i < count - n + 1; i++) {
            temp = temp.next;
        }

        System.out.println("the nth element from the last is " + temp.data);
    }

    public void getnthnodeFromlast(int n) {
        Node main_ptr = head;
        Node ref_prt = head;

        int count = 0;

        if (head != null) {
            while (count < n) {
                if (ref_prt == null) {
                    System.out.println("the n is greater than the size of list");
                    return;
                }
                ref_prt = ref_prt.next;
                count++;
            }
            while (ref_prt != null) {
                main_ptr = main_ptr.next;
                ref_prt = ref_prt.next;
            }
            System.out.println("the nth element from the last is " + main_ptr.data);
        }
    }

    public void printMiddle() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        temp = head;
        count = count / 2;
        while (count != 0) {
            temp = temp.next;
            count--;
        }

        if (temp == null) {
            return;
        }
        System.out.println(temp.data);
    }

    public void printMiddle2() {
        Node fast = head;
        Node slow = head;
        if (head != null) {
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println(slow.data + " is the middle element");
        }
    }

    // copied
    public void printMiddle3(Node head) {
        int count = 0;
        Node mid = head;

        while (head != null) {

            // Update mid, when 'count'
            // is odd number
            if ((count % 2) == 1)
                mid = mid.next;

            ++count;
            head = head.next;
        }

        // If empty list is provided
        if (mid != null)
            System.out.println("The middle element is [" + mid.data + "]\n");
    }

    static int frequency = 0;

    public int countelement(Node head, int key) {
        if (head == null) {
            return frequency;
        }
        if (head.data == key) {
            frequency++;
        }
        return countelement(head.next, key);
    }

    public void reverse() {
        if (head == null) {
            return;
        }
        Node current = head;
        Node prev = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list.head.next = second;
        second.next = third;

        // list.printlist();
        list.push(0);
        list.push(2);
        // list.printlist();
        list.insertAfter(second, 2);
        // list.printlist();
        list.append(5);

        // list.printlist();
        list.deletNode(2);
        list.deletNode(10);
        // list.printlist();
        list.deleteAtPosition(10);
        // list.printlist();

        // System.out.println(list.length());
        // list.searchIterative(10);

        boolean a = list.searchRecursively(list.head, 10);

        if (a == true) {
            System.out.println("yes");
        }

        // list.printlist();
        // list.nthnodeIterative(10);

        list.printMiddle2();
        list.printlist();

        int countNoOfTImeElement = list.countelement(list.head, 2);
        System.out.println(countNoOfTImeElement);
        System.out.println("yes");
        list.reverse();
        list.printlist();
    }
}