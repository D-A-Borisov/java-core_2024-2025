package lab3.task2100;

import java.io.*;
import java.io.IOException;
import java.lang.module.InvalidModuleDescriptorException;
import java.nio.channels.ScatteringByteChannel;

public class task2100 {
    public static void main(String[] args) {
        String inputFileName = "src/lab3/task2100/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int marshalAndLilly = 2;
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String readLine = "";
            int numberOfFriends = 0;
            int numberOfParis = 0;
            while ((readLine = bufferedReader.readLine()) !=null){
                if(numberOfFriends == 0) {
                    numberOfFriends = Integer.parseInt(readLine);
                    continue;
                }
                if(readLine.contains("+")){
                    numberOfParis++;
                }
            }
            int result;
            int guest = (marshalAndLilly + numberOfFriends + numberOfParis);
            if(guest == 13) {
                result = (guest *100) + 100;
            } else {
                result = guest * 100;
            }
            System.out.println(result);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}