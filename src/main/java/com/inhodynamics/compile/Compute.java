package com.inhodynamics.compile;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.Display;



public class Compute {
	


	public String[] compile(String code) throws Exception, IOException, InterruptedException {
		
		String sourceCode = code;
		String error = "";
		String result = "";
		String[] data = new String[2];
	
	
	
	System.out.println("soruce In");
	File file = new File("C:\\Users\\inhoj\\Desktop\\eclipse\\workspace\\The Coder\\code.java");
	System.out.println("created file");
	FileWriter fw = new FileWriter(file);
	fw.write(sourceCode);
	fw.close();
	System.out.println("file writed");
	
	String batchFile = "C:\\Users\\inhoj\\Desktop\\eclipse\\workspace\\The Coder\\run.bat";
	/*String[] commands = {"cmd.exe", "/c", "C:\\Users\\inhoj\\Desktop\\eclipse\\workspace\\The Coder\\run.bat"};
	Process proc = Runtime.getRuntime().exec(commands);*/
	
	/*Display display = new Display();
	Program.launch(batchFile);
	display.dispose();*/
	
	File bfile = new File("C:\\Users\\inhoj\\Desktop\\eclipse\\workspace\\The Coder\\run.bat");
    
	
	Desktop desk = Desktop.getDesktop();
	long start = System.currentTimeMillis(); //시작시각
	synchronized (desk) {
		desk.open(bfile);		
		Thread.sleep(2000);
	}
/*	
	long end = System.currentTimeMillis(); //끝나는 시각
	
	long gap = (int)((end-start)/1000);
	
	System.out.println(gap+"초");
	if(gap>3) System.exit(0);*/
	 //Desktop.getDesktop().open(bfile);
	 //Desktop.getDesktop().wait(2000);
	/*Runtime rt = Runtime.getRuntime();
	String batFile = "C:\\Users\\inhoj\\Desktop\\eclipse\\workspace\\The Coder\\run.bat";
	Process proc;
	
	try {
		proc = rt.exec(batFile);
		proc.waitFor();
	} catch(Exception e) {
		e.printStackTrace();
	}*/
	//Thread.sleep(1500);
	
	File eFile = new File("C:\\Users\\inhoj\\Desktop\\eclipse\\workspace\\The Coder\\error.txt");
	File rFile = new File("C:\\Users\\inhoj\\Desktop\\eclipse\\workspace\\The Coder\\result.txt");
	
	Scanner scanError = new Scanner(eFile);
	Scanner scanResult = new Scanner(rFile);
	
	
	
	while(scanError.hasNext()) {
		error += scanError.nextLine()+"\r\n";
	}
	
	while(scanResult.hasNext()) {
		result += scanResult.nextLine();
		System.out.println("scanResult : " + result);
	} 
	
	
	if(error.contains("error")) {
		result="";
	}
	
	data[0] = error;
	System.out.println("data[1]: "+ result);
	data[1] = result;
	scanError.close();
	scanResult.close();
	eFile.delete();
	rFile.delete();
	
	System.out.println("에러메세지 : "+ error);
	System.out.println("결과 :" + result);
	
	return data;
	}
}
