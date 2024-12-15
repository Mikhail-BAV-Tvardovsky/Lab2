public class Wall implements  IObstacle {
    int height;

    public Wall(WallHeight wallHeight) {
        this.height = wallHeight.getHeight();
    }

    @Override
    public boolean isOvercome(IParticipant participant) {
        return participant.jump(height);
    }
}
