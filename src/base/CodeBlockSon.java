package base;
/*
 * 静态成员和静态代码块是属于类的，先于对象的创建
 * 输出结果：CodeBlock 的静态代码块   CodeBlockSon 的静态代码块  
 *         CodeBlock 的构造代码块    CodeBlock 的构造函数
 *         CodeBlockSon 的构造代码块    CodeBlockSon 的构造函数
 */
public class CodeBlockSon extends CodeBlock{
	 //构造函数方法
    public CodeBlockSon(){
    	System.out.print("CodeBlockSon 的构造函数");
    }
   //构造代码块
    {
    	System.out.print("CodeBlockSon 的构造代码块");
    }   
     //静态代码块
       static    {
    	System.out.print("CodeBlockSon 的静态代码块");
        } 
       
       public static void main(String[] args){
    	  CodeBlockSon son =new CodeBlockSon();
    	 // instanceof ;判断对象是否实现了指定的接口或继承了指定的类
    	   if(son instanceof CodeBlock){
    		   System.out.print("son 是 codeBlock");
    	   }
       }
}
