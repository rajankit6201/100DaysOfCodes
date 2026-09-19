// class Solution {
//     TreeNode keyNode = null;
//     TreeNode parent = null;

//     private void keyNode(TreeNode root, TreeNode par, int key) {
//         if (root == null) return;

//         if (root.val == key) {
//             keyNode = root;
//             parent = par;
//             return;
//         }

//         if (key < root.val) {
//             keyNode(root.left, root, key);
//         } else {
//             keyNode(root.right, root, key);
//         }
//     }

//     public TreeNode deleteNode(TreeNode root, int key) {
//         if (root == null) return null;

//         keyNode(root, null, key);

//         // Key not found
//         if (keyNode == null) return root;

//         // Case 1: leaf node
//         if (keyNode.left == null && keyNode.right == null) {
//             if (parent == null) return null;

//             if (parent.left == keyNode)
//                 parent.left = null;
//             else
//                 parent.right = null;

//             return root;
//         }

//         // Case 2: only right child
//         if (keyNode.left == null) {
//             if (parent == null) return keyNode.right;

//             if (parent.left == keyNode)
//                 parent.left = keyNode.right;
//             else
//                 parent.right = keyNode.right;

//             return root;
//         }

//         // Case 3: only left child
//         if (keyNode.right == null) {
//             if (parent == null) return keyNode.left;

//             if (parent.left == keyNode)
//                 parent.left = keyNode.left;
//             else
//                 parent.right = keyNode.left;

//             return root;
//         }

//         // Case 4: two children
//         TreeNode successorParent = keyNode;
//         TreeNode successor = keyNode.right;

//         while (successor.left != null) {
//             successorParent = successor;
//             successor = successor.left;
//         }

//         keyNode.val = successor.val;

//         if (successorParent.left == successor)
//             successorParent.left = successor.right;
//         else
//             successorParent.right = successor.right;

//         return root;
//     }
// }






class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        else {
            // No left child
            if (root.left == null) {
                return root.right;
            }

            // No right child
            if (root.right == null) {
                return root.left;
            }

            // Two children
            TreeNode successor = root.right;

            while (successor.left != null) {
                successor = successor.left;
            }

            root.val = successor.val;

            root.right = deleteNode(root.right, successor.val);
        }

        return root;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna