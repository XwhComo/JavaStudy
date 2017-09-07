package base;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOTest {
                  public static void main (String[] args){ 
                	  
//                	  FileWriter fw =null;
//                		try{	  
//                		fw=	  new FileWriter("D://test/Demo.txt",true);
//                		fw.write("cbuerf");
//                	  
//                  } 
//                		catch(IOException e){
//                			System.out.println(e.toString()+"");
//                		}
//                		finally{                //要有finally
//                			if(fw!=null){
//                				try{
//                					fw.close();
//                				}
//                				catch(IOException e){
//                					System.out.println("close"+e.toString());
//                					
//                				}
//                			}
//                		}
//                		
//                		
//                		try {
//							FileReader fr = new FileReader("D://test/Demo.txt");
//							char [] str=new char[100];
//							int len=0;
//							while((len=fr.read(str))!=-1){
//							//	System.out.println(new String(str,0,len));
//								}
//						
//							fr.close();
//						} catch (IOException e) {
//							e.printStackTrace();
//						}
                	  //添加流到缓冲区可以提高流的效率
                	  /*
                	   * 0abc
                         1abc
                         2abc
                         3abc
                	   */
//                	  try {
//						FileWriter fw=new FileWriter("D://test/Demo.txt");
//						BufferedWriter bu=new BufferedWriter(fw);
//						for(int x=0;x<4;x++){
//							bu.write(x+"abc");
//							bu.newLine();
//							bu.flush();
//							
//						}
//						bu.close();
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
                	 /*
                	  * 读取文件 
                	  */
//                	  try{
//                		  FileReader fr=new FileReader("D://test/Demo.txt");
//                		  BufferedReader bu=new BufferedReader(fr);
//                		  String line=null;
//                		  while((line=bu.readLine())!=null){
//                			  System.out.println(line);
//                		  }
//                	  }
//                	  catch(IOException e){
//                		  e.printStackTrace();
//                	  }
                	  
                	  /*
                	   * 键盘输入和控制台显示
                	   */
                	  BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
                      BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(System.out));
                      String line=null;
                      try{
                      while((line=bufferedReader.readLine())!=null){
                    	  System.out.println(line);
                      }
                      bufferedWriter.close();
                      bufferedReader.close();
                      }
                      catch(IOException e){
                    	  e.printStackTrace();
                      }
                  }
                	  
}
