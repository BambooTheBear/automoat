public class Left extends Zustand
{
    public Left(){}
    public Zustand execute(char c){
        System.out.println("I went left");
        // ^_^
        return Yeet.getObject();
    }
    public static Zustand getObject(){
        return new Left();
    }
}
