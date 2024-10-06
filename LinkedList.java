public class LinkedList {
    Node head;

    //add a new node at the end of the list
    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next= null;

        //check if the head exist
        if(head == null) {
            head = node;
        } else {
            Node n = head;

            while (n.next != null) { 
                n = n.next;
            }
            n.next = node;
        }
    }
    
    //add a new node at the beginning of the list
    public void push(int data) {
        Node node = new Node();
        node.data = data;

        if (head == null) {
            node.next = null;
        } else {
            node.next = head;
        }
        head = node;
    }
    
    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        //check if the list is empty or index is 0
        if (head == null || index == 0) {
            push(data);
        } else {
            Node n = head;

            //check if the index in the range
            int nodeNumber = 0; //how many nodes in the linked list

            while (n != null) {
                nodeNumber += 1;
                n = n.next;
            }
            //index + 1 cause index starts from 0
            if (index + 1 > nodeNumber) {
                System.out.println("ERROR: index is out of the range");
            } else {
                n = head;
                for(int i = 0; i < index - 1; i++) {
                    n = n.next;
                }
                node.next = n.next;
                n.next = node;    
            }
            
        }
    }

    //remove a node from the list by data
    public void remove(int data){
        if (head == null) {
            System.out.println("The list is already empty");
        } else {
            Node n = head;
            while (n.next != null) {
                if (head.data == data) {
                    head = head.next;
                    return;
                }else if (n.next.data == data) {
                    n.next = n.next.next;
                    return;
                }
                n = n.next;
            }
            System.out.println("REMOVE ERROR: Cannot find " + data);
        }
    }

    public void printList() {
        
        if (head == null) {
            System.out.println("The list is empty");
        } else {
            Node n = head;
            while(n.next != null) {
                System.out.println(n.data);
                n = n.next;
            }
    
            //print the last node
            System.out.println(n.data);
        }
        
    }
}