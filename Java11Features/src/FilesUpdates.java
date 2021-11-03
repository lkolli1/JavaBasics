import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class FilesUpdates {
	public static void main(String[] args) throws IOException {
		Path writeString = Files.writeString(Files.createTempFile("test", ".txt"), "Java 11 Files Updates");
		System.out.println(writeString);
		String str=Files.readString(writeString);
		System.out.println(str);
		///
		//Optional<String> optStr= Optional.empty();
		Optional<String> optStr= Optional.of("abc");
		System.out.println(optStr.isEmpty());

	}

}
