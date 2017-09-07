package base;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AIOTest {
	    static Thread current;
        public static void main(String[] args) throws IOException, InterruptedException, ExecutionException{
        	 if(args==null||args.length==0){
        		 System.out.println("please input file path");
        		 return;
        	 }
        	 Path filePath=Paths.get(args[0]);
        	 //创建一个可以读写的文件并且返回一个异步通道用来访问创建的文件
        	 AsynchronousFileChannel afc=AsynchronousFileChannel.open(filePath);
        	 ByteBuffer byteBuffer=ByteBuffer.allocate(16*1024);
        	 futureDemo(afc,byteBuffer);
        	// completionHanderDemo(afc,byteBuffer);	 
        }
        /*在这个包中定义的异步通道允许指定一个完成处理程序来消耗异步操作的结果。
         * 当I/O操作成功完成时，将调用已完成的方法。
         * 如果I/O操作失败，将调用失败的方法。
         * 这些方法的实现应及时完成，以避免将调用线程分配给其他完成处理程序。
         */
        private static void completionHanderDemo(AsynchronousFileChannel afc,ByteBuffer byteBuffer) throws IOException{
        	current=Thread.currentThread();
        	afc.read(byteBuffer, 0, null, new CompletionHandler<Integer, Object>() {
        		@Override
        		//当操作完成时调用
        		public  void completed(Integer result,Object attachment){
        			System.out.println("Byte Read ="+result);
        			current.interrupt();
        		}
                //当操作失败时调用
				@Override
				public void failed(Throwable exc, Object attachment) {
					// TODO Auto-generated method stub
					System.out.println(exc.getCause());
					current.interrupt();
				}
        		
			});
        	System.out.println("waiting for completion");
        	 try {  
                 current.join();  
             } catch (InterruptedException e) {  
             }  
             System.out.println("End");  
             afc.close();  
        }
        /*
         * future代表异步计算的结果。提供了检查计算是否完成、等待其完成并检索计算结果的方法。
         * 只有在计算完成时使用方法获取，才能在需要时阻塞，直到就绪为止。
         * 取消是通过取消方法执行的。还提供了其他方法以确定任务是否正常完成或取消。
         * 一旦计算完成，计算就不能取消。如果你想使用一个为future着想而不可提供一个有用的结果，
         * 你可以声明的形式本<类型？>并根据基础任务返回null。
         */
        private static void futureDemo(AsynchronousFileChannel afc,ByteBuffer byteBuffer) throws InterruptedException, IOException, ExecutionException{
        	Future<Integer> resultFuture=afc.read(byteBuffer,0);
        	while(!resultFuture.isDone()){
        		System.out.println("waiting file channel finished...");
        		Thread.sleep(1);
        			}
        	System.out.println("Finished?="+resultFuture.isDone());
        	System.out.println("byteBuffer="+resultFuture.get());
        	System.out.println(byteBuffer);
        	afc.close();
        	
        }
}
