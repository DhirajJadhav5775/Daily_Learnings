
public class linkedlist2
{   
    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        current.next = newNode;
    }
    public void printList()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while(current!= null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[])
    {
        linkedlist2 ll = new linkedlist2();
        ll.addFirst("Life");
        ll.addFirst("is");
        ll.addLast("good    ");
        ll.printList();
    }
}
