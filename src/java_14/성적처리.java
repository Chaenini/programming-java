package java_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 己利贸府 {
	static ArrayList<己利> 己利甸 = new ArrayList<>();
	public static void main(String[] args) {
		//颇老 楷搬
		//滚欺 楷搬
		FileReader fr;
		try {
			fr = new FileReader("src/writed.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			while (( line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line,"\t");
				己利 new己利 = new 己利();
				new己利.setName(st.nextToken());
				new己利.setAddress(st.nextToken());
				new己利.setMath(Double.parseDouble(st.nextToken()));
				new己利.setEnglish(Double.parseDouble(st.nextToken()));
				
				己利甸.add(new己利);
			}
			
			for(己利 a : 己利甸) {
				System.out.println(a);
			}
			
//			for(int i=0; i<己利甸.size(); i++) {
//				System.out.println();
//			}
			
			FileWriter fw = new FileWriter("src/save.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (己利 a : 己利甸) {
				 bw.write(a.getName()+"\t"+a.getAddress()+"\t");
				 bw.write(a.getMath()+"\t"+a.getEnglish()+"\t");
				 bw.write(a.getTotal()+"\t"+a.getAverage()+"\t");
				 bw.newLine();
			}
			
			br.close();
			bw.close();
			fr.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}