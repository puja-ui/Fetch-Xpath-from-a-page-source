import java.util.*;
import java.io.*;

class FileMan{
    public static void main(String[] args){
        File pagesource = new File("pagesource.txt");
        Scanner scanst = new Scanner(System.in);
        //int i;
        try {
            //FileReader fread = new FileReader("pagesource.txt");
            System.out.println("Enter the element for which you want the XPATH...");
            String text = scanst.nextLine();
            String tag = scanst.nextLine();
            Scanner scanfile = new Scanner(pagesource);
            FileWriter fwrite = new FileWriter("selectedEl.txt");

            while(scanfile.hasNext()){
                String element = scanfile.nextLine();
                if(element.contains(text + "</" + tag +">")){
                    fwrite.write(element);
                    
                }
            }
            scanfile.close();
            fwrite.close();
            // while((i = fread.read()) != -1){
            //     fwrite.write((char)i);
            // }
            System.out.println("done");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error error");
        }
    }
}