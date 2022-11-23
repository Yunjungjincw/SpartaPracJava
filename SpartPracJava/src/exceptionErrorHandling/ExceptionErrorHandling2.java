package exceptionErrorHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionErrorHandling2 {

	public static void main(String[] args) {
		
		
		try(FileOutputStream out = new FileOutputStream("test.txt")){
					//FileOutputStream => IOException의 자식 클래스에 해당 => catch문에 걸림.
			
			
				//Unhandled exception type FileNotFoundException
			// 다루지 않은 예외가 IOEception이 발생할 수 있어.
			out.write("Hellow Sparta".getBytes());
			out.flush();
		}catch(IOException e) {
			System.out.println("IOException 발생 : " + e.getMessage());
			e.printStackTrace();
		}

	}

}
