public class Shoot extends Zustand
{
    public Shoot(){}
    public Zustand execute(char c){
        System.out.println("I shot");
        // (^°.°^)
        return Yeet.getObject();
    }
    public static Zustand getObject(){
        return new Shoot();
    }
}
