import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test_p36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
			
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			System.out.println("�g�J���ɮפ�����Ӧr��O\n"+str1+"\n"+str2);
			
			br.close();
		}
		catch(IOException e ) {
			System.out.println("��X�J���~");
		}
	}

}
