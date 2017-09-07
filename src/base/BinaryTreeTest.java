package base;

import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.xml.soap.Node;

public class BinaryTreeTest {
	private Node root;
	private List<Node> list=new ArrayList<Node>();
	public BinaryTreeTest(){
		init();
	}
	//初始化二叉树  ,从叶节点开始
	public void init(){
		Node x= new Node("X",null,null);
		Node y=new Node("Y",null,null);
		Node d=new Node("D", x, y);
		Node e=new Node("E", null, null);
		Node f=new Node("F",null,null);
        Node c=new Node("C",e,f);
        Node b=new Node("B",d,null);
        Node a=new Node("A",b,c);
        root =a;
        
	} 
	//定义节点类
	private class Node{
		private String data;
		private Node lchild;
		private Node rchild;
		public Node(String data,Node lchild,Node rchild){
			this.data=data;
			this.lchild=lchild;
			this.rchild=rchild;
		}
		
	}
	//前序遍历 根左右
	public void preOrder(Node node){
		 list.add(node);
		 if(node.lchild!=null){
			 preOrder(node.lchild);
		 }
		 if(node.rchild!=null){
			 preOrder(node.rchild);
		 }
	}
	//中序遍历  左跟右
	public void midOrder(Node node){
		if(node.lchild!=null){
			midOrder(node.lchild);
		}
		list.add(node);
		if(node.rchild!=null){
			 midOrder(node.rchild);
		 }
	}
	//后序遍历  左右根
	public void postOrder(Node node){
		if(node.lchild!=null){
			postOrder(node.lchild);
		}
		if(node.rchild!=null){
			 postOrder(node.rchild);
		 }
		list.add(node);
	}
	//获取list
	public List<Node> getList(){
		return list;
	}
	/**
     * 返回当前数的深度
     *  说明:
     *  1、如果一棵树只有一个结点，它的深度为1。
     *  2、如果根结点只有左子树而没有右子树，那么树的深度是其左子树的深度加1；
     *  3、如果根结点只有右子树而没有左子树，那么树的深度应该是其右子树的深度加1；
     *  4、如果既有右子树又有左子树，那该树的深度就是其左、右子树深度的较大值再加1。
     *  
     * @return
     */
	public int getTreeDept(Node node){
		if(node.lchild==null&&node.rchild==null){
			return 1;
		}
		int left=0,right=0;
		if(node.lchild!=null){
			left=getTreeDept(node.lchild);
		}
		if(node.rchild!=null){
			right=getTreeDept(node.rchild);
		}
		return left>right?left+1:right+1;
	}
              public static void main(String[] args){
            	  BinaryTreeTest tree=new BinaryTreeTest();
            	  System.out.println("根节点"+tree.root.data);
            	  //前序遍历 根左右
            	  tree.preOrder(tree.root);
            	  //中序遍历  左跟右
            //	  tree.midOrder(tree.root);
            	  //后序遍历  左右根
            //	  tree.postOrder(tree.root);
            	  for(Node node:tree.getList()){
            		  System.out.print(node.data);
            	  }
              }
}
