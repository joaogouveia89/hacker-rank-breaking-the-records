public class BreakingTheRecords{
	static int[] breakingRecords(int[] scores) {
        int[] response = {0, 0};
        
        int lowestScore = scores[0];
        int highestScore = lowestScore;
        
        for(int i = 0; i < scores.length; i++){
            if(i != 0){
                if(scores[i] > highestScore){
                    highestScore = scores[i];
                    response[0]++;
                }
                
                if(scores[i] < lowestScore){
                    lowestScore = scores[i];
                    response[1]++;
                }
            }
        }
        
        return response;
    }
}