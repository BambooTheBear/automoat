public class Down extends Zustand
{
    public Down(){}
    public Zustand execute(char c){
        System.out.println("Im Ducked");
        if (c=='r') {
            return Right.getObject();
        }
        if (c=='l') {
            return Left.getObject();
        }
        if (c=='s') {
            return Shoot.getObject();
        }
        return Yeet.getObject();
    }
    public static Zustand getObject(){
        return new Down();
    }
}
