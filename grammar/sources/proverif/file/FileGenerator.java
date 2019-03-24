package proverif.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileGenerator {
	public static StringBuilder fileContent;
	public static File logFile;
	public static String name;

	public static final String LOG_DIRECTORY_PATH = "logs/";

	public static void newLogFile (String name_, String path) {
		name = name_.substring(0, name_.indexOf('.'));
		logFile = new File(path);
		try {
			fileContent = new StringBuilder();
		} catch (Exception e) {
			System.err.println("There was an issue when creating the FileWriter object to log the file");
		}
	}

	public static void log (String message) {
		fileContent.append(message);
	}

	public static File getOriginalFile () {
		return logFile;
	}

	public static String getOriginalName () {
		return name;
	}

	public static void cleanDirectory (String path) {
		File directory = new File(path);

		if (directory.exists()) {
			for (File file : directory.listFiles()) {
				file.delete();
			}
		} else {
			System.err.println("The directory : " + path + " that you are trying to clean does not exist");
		}
	}

}
