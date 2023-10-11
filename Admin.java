
public class Admin
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        char[] liste = {'d','l','d','s','s','o','o'};
        Zustand z = new Idle();
        for (int i = 0; i < liste.length; i++) {
            System.out.println(liste[i]);
            z = z.execute(liste[i]);
        }
    }
}
