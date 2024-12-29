package Timus_task.task2100;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2100 {
    public static void main(String[] args) {
        String inputFileName = "src/lab3/input.txt";
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
