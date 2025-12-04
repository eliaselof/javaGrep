import java.io.BufferedReader;
import java.io.FileReader;

public class search {
    public static void main(String[] args) {
        
        if(args.length > 2 || args[0] == null){
            System.exit(1);
        }
        
        String inputText = args[0];
        String inputFile = args[1];

        try {
            FileReader reader = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(reader);

            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains(inputText)) {
                    System.out.println(line);
                }
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
