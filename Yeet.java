public class Yeet extends Zustand
{
    public Yeet(){}
    public Zustand execute(char c){
        System.out.println("An error occured");
        return Yeet.getObject();
    }
    public static Zustand getObject(){
        return new Yeet();
    }
}
