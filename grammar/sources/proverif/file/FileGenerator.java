package proverif.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileGenerator {
	public static File logFile;
	public static FileOutputStream logFileWriter;
	public static StringBuilder fileContent;

	public static final String LOG_DIRECTORY_PATH = "logs/";

	public static void newLogFile (String name) {
		logFile = new File(LOG_DIRECTORY_PATH + name + ".log");

		try {
			logFileWriter = new FileOutputStream(logFile);
			fileContent = new StringBuilder();
		} catch (Exception e) {
			System.err.println("There was an issue when creating the FileWriter object to log the file");
		}
	}
	
	public static void log (String message) {
		fileContent.append(message);
	}

	public static void cleanDirectory (String path) {
		File directory = new File(path);

		if (directory.exists()) {
			for (File file : directory.listFiles()) {
				if (!file.isDirectory()) {
					file.delete();
				}
			}
		} else {
			System.err.println("The directory : " + path + " that you are trying to clean does not exist");
		}
	}

	public static void flush () {
		try {
			logFileWriter.write(fileContent.toString().getBytes());
			logFileWriter.flush();
			logFileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
