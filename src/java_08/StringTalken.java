package java_08;

import java.util.StringTokenizer;

public class StringTalken {

	public static void main(String[] args) {
		String line;
		String tmpstr = "hong ¿ë»ê±¸ 10.5 20.5";
		StringTokenizer parse = new StringTokenizer(tmpstr);
		String name, address;
		double math, english, total, avg ;
		name = parse.nextToken();
		address = parse.nextToken();
		math = Double.valueOf(parse.nextToken()).doubleValue();
		english = Double.valueOf(parse.nextToken()).doubleValue();
		total = math + english;
		avg = total/2;
		System.out.println(name+"\t"+address+"\t"+math+"\t"+english+"\t"+total+"\t"+avg);
		
		String[] arrStr = tmpstr.split(" ");
		for (String str : arrStr) {
			System.out.print(str  + "\t");
		}
	}

}
