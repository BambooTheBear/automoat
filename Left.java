public class Left extends Zustand
{
    public Left(){}
    public Zustand execute(char c){
        System.out.println("I went left");
        if (c=='r') {
            return Right.getObject();
        }
        if (c=='d') {
            return Down.getObject();
        }
        return Yeet.getObject();
    }
    public static Zustand getObject(){
        return new Left();
    }
}
