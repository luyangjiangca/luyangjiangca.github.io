package ap_cs.teach.unit10_recursive;
public class Question1 {

public static void main(String [] args){
    // Level level1 = new Level(true, 9999999);
    // System.out.println(level1.goalReached());
    // System.out.println(level1.getPoints());
    Game game1 = new Game(true);
    System.out.print(game1.playManyTimes(6));
}
}
public class Level {
    private boolean goal;
    private int points;
    public Level(boolean goal, int points){
        this.goal = goal;
        this.points = points;
    }
    public boolean goalReached(){
        return goal;
    }
    public int getPoints(){
        return points;
    }
    
}
public class Game
{
    private Level levelOne = new Level(true,2);
    private Level levelTwo = new Level(true,3);
    private Level levelThree = new Level(true,5);
    private boolean isBonus;
    private int pointTotal = 0;
    public Game(Boolean isBonus){
        this.isBonus = isBonus;
    }
    //True if bonus level, false if not
    public boolean isBonus(){
        return isBonus;
    }
    //simulataes game, three levels, updates game data
    public void play(){
        if (levelOne.goalReached()){
            pointTotal+=levelOne.getPoints();
                if (levelTwo.goalReached()){
                    pointTotal+=levelTwo.getPoints();
                
                    if (levelThree.goalReached()){
                        pointTotal+=levelThree.getPoints();
                        }
                }
            }
        if(this.isBonus()){
            pointTotal*=3;
        }
    }
    //Total score in most recent game
    public int getScore(){
        return pointTotal;
    }
    //simulates playing num games, returns highest score earned, nim >0
    public int playManyTimes(int num){
        int maxScore = 0;
        for (int i = 0; i<num; i++){
            this.play();
            if (pointTotal>maxScore){
                maxScore = pointTotal;
            }
        }
        return maxScore;
    }

}