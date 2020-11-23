package trees;


public class tree {

        private static treeNode rootNode = null;


        private boolean searchRecursive(treeNode root, int elem) {
            if(root == null) {
                return false;
            }
            if(elem ==
                    root.data
            ) {
                return true;
            } else {
                int currentRootData =
                        root.data
                        ;
                if (currentRootData >= elem) {
                    return searchRecursive(root.leftPtr, elem);
                } else {
                    return searchRecursive(root.rightPtr, elem);
                }
            }
        }

        public boolean search(int elemToSearch) {
            return  searchRecursive(rootNode, elemToSearch);
        }
        private void recursiveInsert(treeNode root, int elem) {
            if (rootNode == null) {
                rootNode = new treeNode(elem);
            } else {
                int data =
                        rootNode.data
                        ;
                if (data >= elem) {
                    recursiveInsert(root.leftPtr, elem);
                } else {
                    recursiveInsert(rootNode.rightPtr, elem);
                }
            }
        }
        public void insert(int elemToInsert) {
            recursiveInsert(rootNode, elemToInsert);
        }

        private void inOrderTRecursive(treeNode root) {
            if(root == null) {
                return;
            }
            inOrderTRecursive(root.leftPtr);
            System.out.println(
                    root.data
            );
            inOrderTRecursive(root.rightPtr);
        }

        public void inOrderT() {
            inOrderTRecursive(rootNode);
        }
        private void preOrderTRecursive(treeNode root) {
            if(root == null) {
                return;
            }
            System.out.println(
                    root.data
            );
            preOrderTRecursive(root.leftPtr);
            preOrderTRecursive(root.rightPtr);
        }
        public void preOrderT() {
            preOrderTRecursive(rootNode);
        }
        private void postOrderTRecursive(treeNode root) {
            if(root == null) {
                return;
            }
            postOrderTRecursive(root.leftPtr);
            postOrderTRecursive(root.rightPtr);
            System.out.println(
                    root.data
            );
        }
        public void postOrderT() {
            postOrderTRecursive(rootNode);
        }

        public int deleteNode(int elemToDelete) {
            return 0;
        }

    private treeNode searchParent(treeNode root, int key){
        if(root == null){
            return null;
        }
        if(root.leftPtr != null && root.leftPtr.data == key || root.rightPtr != null && root.rightPtr.data == key){
            return root;
        }
        else{
            int currentNodeData = root.data;
            if(currentNodeData >= key){
                return searchParent(root.leftPtr, key);
            } else {
                return searchParent(root.rightPtr, key);
            }
        }
    }



}
