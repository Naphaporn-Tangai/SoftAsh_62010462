package structural;

public class HealthcareWorkerDecorator extends HealthcareWorker {
    HealthcareWorker employee;

    public HealthcareWorkerDecorator(HealthcareWorker worker) {
        super(employee);
        this.employee = employee;
    }

    @Override
    public void service() {
        this.employee.service();
    }

    @Override
    public double getPrice() {
        return this.employee.getPrice();
    }
}
