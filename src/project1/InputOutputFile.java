package project1;

import java.io.File;
import java.io.IOException;

public class InputOutputFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File(".\\SashankConfig.Properties");
		if(f.exists()) {
			f.delete();
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			}

}
