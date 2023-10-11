public class Idle extends Zustand
{
    public Idle(){}
    public Zustand execute(char c){
        System.out.println("Im idling");
        System.out.println(c);
        if (c=='d') {
            return Down.getObject();
        }
        return Yeet.getObject();
    }
    public static Zustand getObject(){
        return new Idle();
    }
}
