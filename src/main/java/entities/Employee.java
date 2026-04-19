package entities;

public class Employee {
    private String name;
    private Integer hours;
    private Double valuePerHour;

    public Employee() {
    super();
    }

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public Integer getHours() {
        return hours;
    }


    public Double getValuePerHour() {
        return valuePerHour;
    }

    public Double payment(Integer hour, Double valuePerHour) {
        return (hour*valuePerHour);
    }

    public String toString() {
        return name + " - $" + String.format("%.2f", payment(hours, valuePerHour));
    }
}
