public class Right extends Zustand
{
    public Right(){}
    public Zustand execute(char c){
        System.out.println("I went right");
        if (c=='l') {
            return Left.getObject();
        }
        if (c=='d') {
            return Down.getObject();
        }
        return Yeet.getObject();
    }
    public static Zustand getObject(){
        return new Right();
    }
}
