package animal;


public class Cats extends Animals {
    Cats(String name, float maxMagnitudeForJump, int maxMagnitudeForRun, float maxMagnitudJumpOverObstacles,
         int maxMagnitudSwim) {
        super(name, maxMagnitudeForJump, maxMagnitudeForRun, maxMagnitudJumpOverObstacles, maxMagnitudSwim);
    }
    @Override
    protected boolean swim(int magnitudeOfAction) {
        return false;
    }
}
