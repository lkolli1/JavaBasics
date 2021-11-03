package ioexceptions;

import java.io.*;
import java.util.StringTokenizer;

public class IOException {
	public static void main(String[] args) throws Exception {

		// IMAGE Copying with FIS ,FOS
		File fi = new File("C:/Users/lkolli1/Downloads/Passport Size Photo.JPG");
		FileInputStream fis = new FileInputStream(fi);
		FileOutputStream fos = new FileOutputStream("C:/Users/lkolli1/Downloads/newImage.jpg");

		// File Copying with FR ,FW
		File fi1 = new File("D:/io/io.txt");
		FileReader fr = new FileReader(fi1);
		FileWriter fw = new FileWriter("D:/io/newFile.txt");

		// Buffered Reader
		FileReader fr1 = new FileReader(fi1);
		BufferedReader br = new BufferedReader(fr1);

		// OOS
		FileOutputStream fos1 = new FileOutputStream("D:/io/Emp.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos1);
		Emp emp = new Emp(111, "sls", "12ssn");
		oos.writeObject(emp);

		// OIS
		FileInputStream fis1 = new FileInputStream("D:/io/Emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis1);
		//Object oj=ois.readObject();
		Emp emp1 =(Emp)ois.readObject();
		System.out.println(emp1);
		
		int i;
		String line;
		try {
			// FIS
			while ((i = fis.read()) != -1) {
				// System.out.print((char)i);
				fos.write(i);
			}

			// FR
			i = 0;
			while ((i = fr.read()) != -1) {

				fw.write(i);
			}

			// BR
			i = 0;

			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, " ");
				while (st.hasMoreTokens()) {
					i++;
					System.out.println(st.nextToken());
				}
				System.out.println("Count of Words in the File :" + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				fis.close();
				fis1.close();
				fos.close();
				fos1.close();
				fr.close();
				fr1.close();
				fw.close();
				br.close();
				oos.close();
				ois.close();
			} catch (java.io.IOException e) {
				e.printStackTrace();
			}
		}
	}

}
