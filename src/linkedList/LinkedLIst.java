package linkedList;

public class LinkedLIst {
    // head Node for every linked list
    Node head;      // points to head of the list

    // initialize data and next here
    public Node initializer(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        return node;
    }
    // deletion at any position
    public void deleteAtPosition(int pos){
        Node ptr = head;
        if(head == null){
            System.out.println("Link is already empty");
        }
        if(pos == 1){
            deleteAtBegin();
        }
        else{
            int count = 1;
            while((pos-1) > count){
                ptr = ptr.next;
                count++;
            }
            ptr.next = ptr.next.next;
        }


    }
    // deletion at end
    // null pointer exception
    public void deleteAtEnd(){
        Node ptr = head;
        while(ptr.next.next != null){
            ptr = ptr.next;
        }
        ptr.next = null;
    }

    // deletion at beginning
    // if else reuired
    public int deleteAtBegin(){
        Node ptr = head;
        // if list is empty
        if(head == null){
            System.out.println("List is already empty");
            return -1;
        }
        // if only one node in list
        if(head.next == null){
            Node deletedNode = head;
            head = null;
            return deletedNode.data;
        }
        else{
            ptr = ptr.next;
            Node deletedNode = head;
            head = ptr;
            return deletedNode.data;
        }
    }

    // insert at any position
    public void  insertAtposition(int data , int pos){
        Node node = initializer(data);
        if(head == null){
            head = node;
        }
        if(pos == 1){
            insertAtBegin(data);
        }
        else{
            Node ptr = head;
            while(pos-- > 2){
                ptr = ptr.next;
            }
            node.next = ptr.next;
            ptr.next = node;
        }

    }

    // insert at beginning method
    // required ?(if,else)
    public void insertAtBegin(int data){
        Node node = initializer(data);
        if(head == null){
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }

    // insert at end method
    public void insert(int data){
        Node node = initializer(data);
        // if head is null than it is the first node
        if(head==null){
            head = node;
        }
        else{
            Node ptr = head;
            while(ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = node;
        }
    }
    // traverse the list
    public void show(){
        Node ptr = head;
        while(ptr!=null){
           System.out.print(ptr.data+"->");
           ptr = ptr.next;
        }
        System.out.print("null");
    }

}
