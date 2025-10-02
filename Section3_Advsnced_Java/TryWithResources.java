import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String args[]){
        int num=0;
        //this will auto close the br reader ince it impleemtns autoClosable class
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 

