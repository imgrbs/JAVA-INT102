import java.io.*;
import java.util.Scanner;
class Post6{
	public static void main(String[] args){
		File f = new File("file.txt");
		FileReader fr = null;
		BufferedReader br = null;
		String word;
		try(Scanner sc= new Scanner(new FileInputStream(f))){
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			while((word=br.readLine())!=null){
				System.out.println("Text file : \n\""+word+"\"");
				int count=0;
				while(sc.hasNext()){
					sc.next();
					count++;
				}
			System.out.println("these file has " + count + " words");
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}