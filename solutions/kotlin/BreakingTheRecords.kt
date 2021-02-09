fun breakingRecords(scores: Array<Int>): Array<Int> {
    val response = arrayOf(0, 0)
    var lowerScore = scores[0]
    var higherScore = lowerScore
    
    scores.forEachIndexed loop@{ index, score ->
        if(index != 0){
            if(score > higherScore){
                higherScore = score
                response[0]++
            }
            
            if(score < lowerScore){
                lowerScore = score
                response[1]++
            }
        }
        
     }
     return response
}