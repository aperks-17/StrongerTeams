
public class Stronger
{
    public static int StrongerTeams(int[] strengths){

        //divide strengths into two arrays based on greatest number
        int[] teamA=new int[5];
        int[] teamB=new int[5];
        int teamAIndex=0;
        int teamBIndex=0;
        for(int index=0; index<strengths.length; index++){
            int maxValue=getMaxValue(strengths);
            if(index%2==0){
                teamA[teamAIndex]=maxValue;
                teamAIndex++;
            }
            else{
                teamB[teamBIndex]=maxValue;
                teamBIndex++;
            }
            //remove current element from strength
            int maxIndex=findMaxIndex(strengths,maxValue);
            strengths[maxIndex]=-1;
        } 
        int teamASum=sumOfArray(teamA);
        int teamBSum=sumOfArray(teamB);
        int teamDiff= teamASum-teamBSum;
        return teamDiff;
    }

    public static int findMaxIndex(int[] strengths, int maxValue){
        for(int i=0; i<strengths.length; i++){
            if(strengths[i]==maxValue){
                return i;
            }
        }
        return -1;
    }

    public static int getMaxValue(int[] strengths){
        int maximum=Integer.MIN_VALUE;
        for(int i=0; i<strengths.length; i++){
            if(strengths[i]>maximum){
                maximum=strengths[i];
            }           
        }
        return maximum;
    }

    public static int sumOfArray(int[] inArray){
        int sum=0;
        for(int i=0; i<inArray.length; i++){
            sum+=inArray[i];
        }
        return sum;
    }
}
