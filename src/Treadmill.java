public class Treadmill  implements IObstacle {
    int length;

    public Treadmill(TreadmillLength treadmillLength) {
        this.length = treadmillLength.getLength();
    }

    @Override
    public boolean isOvercome(IParticipant participant) {
        return participant.run(length);
    }
}
