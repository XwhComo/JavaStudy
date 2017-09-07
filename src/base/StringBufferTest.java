package base;

public class StringBufferTest {
   /*
    * 增  append insert
    * 删 delete
    * 查  indexOf
    * 改  replace  setcharAt 
    * 反转 reverse()
    */
	public static void main(String[] args) {
		   StringBuffer buffer=new StringBuffer();
		   buffer.append("abc");
		   System.out.println(buffer);
		   buffer.append("def").append("qwe");  //添加字符串到缓冲区
		   System.out.println(buffer);
		   buffer.insert(3, 1);   //插入数据
		   buffer.insert(3, "w");
		   buffer.delete(3, 5);//删除到4为止
		   buffer.deleteCharAt(5);
		   int a=buffer.indexOf("er");
		   buffer.reverse();
		   System.out.print(buffer);
	}

}
