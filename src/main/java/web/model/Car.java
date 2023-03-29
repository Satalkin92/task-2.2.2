package web.model;

public class Car {
    private Long id;
    private String model;
    private int series;

    public Car() {
    }

    public Car(Long id, String model, int series) {
        this.model = model;
        this.series = series;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Id=" + id +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }

}
