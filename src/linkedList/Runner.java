package linkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedLIst list = new LinkedLIst();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(25);
        list.insert(30);
        //System.out.println("Deleted data is "+list.deleteAtBegin());
        list.deleteAtPosition(5);
        list.show();
    }
}
