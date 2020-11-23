package trees;

public class treeNode {
    public int data;
    public treeNode leftPtr;
    public treeNode rightPtr;

    treeNode(int data) {

        this.data
                = data;
        this.leftPtr = null;
        this.rightPtr = null;
    }
}
