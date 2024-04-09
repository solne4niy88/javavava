package animal;

/*
Данный класс Animals является родительским классом для Cats и Dogs.
 */

public abstract class Animals {
    protected String name;
    protected float maxMagnitudeForJump;
    protected int maxMagnitudeForRun;
    protected float maxMagnitudJumpOverObstacles;
    protected int maxMagnitudSwim;

    Animals(String name, float maxMagnitudeForJump, int maxMagnitudeForRun, float maxMagnitudJumpOverObstacles,
            int maxMagnitudSwim) {
        this.name = name;
        this.maxMagnitudeForJump = maxMagnitudeForJump;
        this.maxMagnitudeForRun = maxMagnitudeForRun;
        this.maxMagnitudJumpOverObstacles = maxMagnitudJumpOverObstacles;
        this.maxMagnitudSwim = maxMagnitudSwim;
    }


    protected boolean jump(float magnitudeOfAction) {
        return  magnitudeOfAction <= maxMagnitudeForJump;
    }

    protected boolean run(int magnitudeOfAction) {
        return  magnitudeOfAction <= maxMagnitudeForRun;
    }

    protected boolean jumpOverObstacles(float magnitudeOfAction) {
        return magnitudeOfAction <= maxMagnitudJumpOverObstacles;
    }

    protected boolean swim(int magnitudeOfAction) {
        return magnitudeOfAction <= maxMagnitudSwim;
    }

}
