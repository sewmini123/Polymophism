public class Sport {
    void play(){
        System.out.println("playing");
    }
}
class Cricket extends Sport{
    void play(){
        System.out.println("Cricket");
    }
}
class Football extends Sport{
    void play(){
        System.out.println("FootBall");
    }
}
class Rugby extends Sport{
    void play(){
        System.out.println("Rugby");
    }

    public static void main(String[] args) {
        Sport sm;
        sm = new Cricket();
        sm.play();
        sm = new Football();
        sm.play();
        sm = new Rugby();
        sm.play();
    }
}
