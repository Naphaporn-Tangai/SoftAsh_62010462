package structural;

public class TaxPayingHealthcareWorker  extends HealthcareWorkerDecorator {

    public TaxPayingHealthcareWorker(HealthcareWorker worker) {
        super(employee);
        System.out.println("Decorate"+ employee.getName()+ "with TaxPaying.");
    }


    @Override
    public double getPrice() {
        
        return this.employee.getPrice()*1.1;
    }
}
