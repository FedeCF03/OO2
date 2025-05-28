package ar.edu.info.unlp.Ejer22P2;

public abstract class ProcessStep {
    private Boolean result;

    public void execute(FakeMixingTank tank) {
        if (this.basicExecute(tank)) {
            this.setSuccess();
        } else {
            this.setFailure();
        }
    }

    protected abstract boolean basicExecute(FakeMixingTank tank);

    public boolean isDone() {
        return false;
    }

    private void setSuccess() {
        this.result = true;
    }

    private void setFailure() {
        this.result = false;
    }

}
