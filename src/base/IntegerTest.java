package base;

public class IntegerTest {
                 public static void main (String[] args){
                	  int a=56;
                	  Integer b=56;   //56在jvm的对象池中所以直接取出来。而new则是自己创建
                	  Integer c=new Integer(56);  
                	  Integer d=Integer.valueOf(56);
                	  System.out.print(a==b);
                	  System.out.print(a==c);
                	  System.out.print(b==c);
                	  System.out.print(c==d);
                	  System.out.print(d==b);	
                	  //true true false false true
                 }
}
