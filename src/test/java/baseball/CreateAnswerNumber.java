package baseball;

import java.util.ArrayList;
import java.util.List;

public class CreateAnswerNumber {

    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 9;

    public List<Integer> CreateRandomNumberList(){

        List<Integer> randomNumberList = new ArrayList<>();

        while (randomNumberList.size() < 3){
            randomNumberList = RandomNumberList(randomNumberList);
        }

        return randomNumberList;
    }

    public List<Integer> RandomNumberList(List<Integer> randomNumberList){

        int randomNumber = RandomNumber();

        if(!randomNumberList.contains(randomNumber)){
            randomNumberList.add(randomNumber);
        }

        return randomNumberList;
    }

    public int RandomNumber(){
        return (int)(Math.random() * (MIN_NUMBER - MAX_NUMBER)) + MIN_NUMBER;
    }
}
