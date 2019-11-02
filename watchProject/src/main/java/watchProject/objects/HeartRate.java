package watchProject.objects;

import javax.persistence.*;
import java.util.Objects;

@Entity(name="heartRates")
public class HeartRate {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column(name="time")
    private String time;
    @Column(name = "value")
    private String value;
    @Column(name="run_id")
    private long run_id;

    public HeartRate(String time, String value, long run_id) {
        this.time = time;
        this.value = value;
        this.run_id = run_id;
    }

    public HeartRate(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public long getRun_id() {
        return run_id;
    }

    public void setRun_id(long run_id) {
        this.run_id = run_id;
    }

    @Override
    public String toString() {
        return "HeartRate{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", value='" + value + '\'' +
                ", run_id=" + run_id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeartRate heartRate = (HeartRate) o;
        return id == heartRate.id &&
                run_id == heartRate.run_id &&
                Objects.equals(time, heartRate.time) &&
                Objects.equals(value, heartRate.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, time, value, run_id);
    }
}
