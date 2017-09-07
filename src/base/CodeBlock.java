package base;

public class CodeBlock {
	 //构造函数方法
            public CodeBlock(){
            	System.out.print("CodeBlock 的构造函数");
            }
     //构造代码块
            {
            	System.out.print("CodeBlock 的构造代码块");
            }   
     //静态代码块
        static    {
            	System.out.print("CodeBlock 的静态代码块");
            }   
     
}
