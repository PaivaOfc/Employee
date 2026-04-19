package entities;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }


    @Override
    public final Double payment(Integer hour, Double valuePerHour) {
        Double amount = super.payment(hour, valuePerHour);
        Double additional = (additionalCharge * 110 / 100);
        return (amount + additional);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
