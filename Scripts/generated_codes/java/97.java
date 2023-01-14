/*
*/
import java.util.*;

class TreeNode {
    int value;
    ArrayList<TreeNode> children;

    public TreeNode(int value) {
        this.value = value;
        children = new ArrayList<>();
    }
}

public class Solution {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int nodesCount = sc.nextInt();

        // create the tree from the input
        TreeNode root = new TreeNode(sc.nextInt());

        for (int level = 1; level <= nodesCount - 1; level++) {
            int value = sc.nextInt();
            TreeNode node = new TreeNode(value);

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()) {
                TreeNode currentNode = queue.remove();
                if(currentNode.children.size() == 0) {
                    currentNode.children.add(node);
                    break;
                } else {
                    if(currentNode.children.size() == 1) {
                        queue.add(currentNode.children.get(0));
                    } else if (currentNode.children.size() == 2) {
                        queue.add(currentNode.children.get(0));
                        queue.add(currentNode.children.get(1));
                    }
                }
            }
        }

        int queriesCount = sc.nextInt();
        for (int i = 0; i < queriesCount; i++) {
            int nodesToAddCount = sc.nextInt();
            int threshold = sc.nextInt();
            int penalty = sc.nextInt();

            int[] valuesToAdd = new int[nodesToAddCount];
            for (int j = 0; j < nodesToAddCount; j++) {
                valuesToAdd[j] = sc.nextInt();
            }

            System.out.println(processQuery(root, valuesToAdd, nodesToAddCount, threshold, penalty));
        }
    }

    private static long processQuery(TreeNode root, int[] values, int nodesToAddCount, int threshold, int penalty) {
        long result = 0;

        int nodesAdded = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode currentNode = queue.remove();

            // add node to the currentnode
            TreeNode nodeToAdd = new TreeNode(values[nodesAdded]);
            currentNode.children.add(nodeToAdd);

            result += (currentNode.value * nodeToAdd.value);
            if(currentNode.children.size() >= threshold) {
                result += penalty;
            }

            // add the new node to the queue
            queue.add(nodeToAdd);

            if(++nodesAdded == nodesToAddCount) {
                break;
            }

            // add all the children of current node to the queue
            queue.addAll(currentNode.children);
        }

        return result;
    }
}