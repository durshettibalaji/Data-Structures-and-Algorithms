package tree;

public class binarytree {
//  static   node root= new node(0);

    public static void main(String[] args) {
        binarytree bt=new binarytree();
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);
        System.out.print("preorder :- ");
        bt.preorder(root);
        System.out.println();
        System.out.println();
        System.out.print("Inorder :-");
        bt.inorder(root);
        System.out.println();
        System.out.println();
        System.out.print("Post Order :-");
        bt.postorder(root);
        System.out.println();
        System.out.println("height :- "+bt.height(root));

    }
    public  void preorder(node head)
    {
        if(head==null)
        {
            return ;
        }
        System.out.print(head.val+" ");
        preorder(head.left);



        preorder(head.right);
    }

    public   void inorder(node head)
    {
        if(head==null)
            return ;
        inorder(head.left);
        System.out.print(head.val+" ");
        inorder(head.right);
    }

    public  void postorder(node head){
        if(head==null)
            return;
        postorder(head.left);
        postorder(head.right);
        System.out.print(head.val+" ");
    }

    public int height(node head)
    {
        if(head==null)
            return 0;
        int left=height(head.left);
        left++;
        int right=height(head.right);
        right++;
        return  Math.max(left,right);
    }



}
