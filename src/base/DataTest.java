package base;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataTest { 
	
	public static void main(String [] args) throws ParseException{
//             Date data=new Date();
//         //    Date data1=new Date();
//             long time1=data.getTime();   //java.util.Date 获取
//             long time2=System.currentTimeMillis();   //java.lang.System获取
//             String time="2017//12//01";   //格式要与format的一致
             SimpleDateFormat df=new SimpleDateFormat("yyyy//MM//dd");
//             Date on=df.parse(time);     //字符串转为Date类型 
//             String a=df.format(time1);  //date的long类型转为String特定的格式
//             String b=df.format(data);   //date类型转为String
//           //  data1.setTime(time1+1111);
//             System.out.println(a);
//        //     System.out.println(data1); 
//             System.out.println(data);
//             System.out.println(time1);
//             System.out.println(time2); 
             
             
             Calendar rili=Calendar.getInstance();
             Date timeli=rili.getTime();
             System.out.println(timeli);
             long time=timeli.getTime();
             System.out.println(time);
             String b=df.format(rili.getTime());
             rili.add(Calendar.DAY_OF_MONTH, -1);   //获取前一天
             System.out.print(rili.getTime());
             
             
}
}
