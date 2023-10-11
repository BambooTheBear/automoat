public class Right extends Zustand
{
    public Right(){}
    public Zustand execute(char c){
        System.out.println("I went right");
        // Wer weiß schon was hier rei soll
        return Yeet.getObject();
    }
    public static Zustand getObject(){
        return new Right();
    }
}
