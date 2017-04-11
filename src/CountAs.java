import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class CountAs {

  public static void main(String[] args) {
    String hereIsTheFile = "countas/afile.txt";
    System.out.println(countLetterAs(hereIsTheFile));
  }

  public static int countLetterAs(String filepath) {
    List<String> allLines;
    File f = new File(filepath);
    int aCounter = 0;
    if (f.exists()) {
      try {
        Path theAfile = Paths.get(filepath);
        allLines = Files.readAllLines(theAfile);
        for (String s : allLines) {
          for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
              aCounter++;
            }
          }
        }
        return aCounter;
      } catch (IOException e) {
        System.out.println("file handling error.");
      }
    }
    return 0;
  }
}
