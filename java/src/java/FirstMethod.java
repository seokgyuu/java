package java;

import java.io.FileWriter;
import java.io.IOException;

public class FirstMethod {

	public static void main(String[] args)throws IOException {
		System.out.println(twoTimes("a","-"));
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a","*"));
		fw.close();
	}
	public static String twoTimes(String text , String delimiter) {
		String out="";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}
	//return 값은 method를 종료시킴과, return 뒤의 있는 값이 method의 실행결과
	//void는 return값이 없다. 
}
