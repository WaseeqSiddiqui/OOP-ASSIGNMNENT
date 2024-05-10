import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/Data.txt");
        Scanner sc=new Scanner(System.in);
        ArrayList<String>list=new ArrayList<>();
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String text;
                while ((text = bufferedReader.readLine()) != null) {
                    String arr[]=text.split(",");
                    for (String temp:arr){
                        list.add(temp);
                        System.out.println(temp);

                    }
                }
            } catch (FileNotFoundException e) {

            } catch (IOException e) {

            }

        }

    }

