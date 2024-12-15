public class Main {
    public static void main(String[] args) {

        IParticipant[] participants = {
                new Human("Человек", 1000, 200),
                new Cat("Кот1", 1200, 400),
                new Cat("Кот2", 1200, 400),
                new Cat("Кот3", 1200, 400),
                new Robot("Робот", 500, 400)
        };

        IObstacle[] obstacles = {
                new Treadmill(TreadmillLength.LOW),
                new Wall(WallHeight.LOW),
                new Wall(WallHeight.HIGH),
                new Treadmill(TreadmillLength.HIGH),
                new Treadmill(TreadmillLength.HIGH),
                new Wall(WallHeight.HIGH),
                new Wall(WallHeight.HIGH),
                new Treadmill(TreadmillLength.MEDIUM),
                new Wall(WallHeight.MEDIUM),
                new Treadmill(TreadmillLength.HIGH),
                new Wall(WallHeight.HIGH),
                new Treadmill(TreadmillLength.HIGH),
        };
        for (IParticipant p : participants) {
            for (IObstacle o : obstacles) {
                if (!o.isOvercome(p)) break;
            }
        }
    }
}
