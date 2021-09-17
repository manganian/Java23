package pl.chojnacki.lesson5.homework.task5;

public class Car implements Vehicle {

    private boolean engineStarted;

    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    @Override
    public void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
        }
    }

    @Override
    public void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
        }
    }
}
