public class Shoot extends Zustand
{
    public Shoot(){}
    public Zustand execute(char c){
        System.out.println("I shot");
        if (c=='s') {
            return Shoot.getObject();
        }
        if (c=='d') {
            return Down.getObject();
        }
        return Yeet.getObject();
    }
    public static Zustand getObject(){
        return new Shoot();
    }
}
