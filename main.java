public class main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(15);
        list.insert(16);
        list.insert(17);
        list.insert(18);
        list.insert(19);
        list.insert(20);


       	list.insertAt(5, 38);
        
        list.printList();
        System.out.println("--------------------");
        list.remove(38);
        list.printList();

        System.out.println("--------------------");
        list.removeLast();
        list.printList();
    }
}
