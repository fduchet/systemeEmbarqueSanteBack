package watchProject.objects;

import javax.persistence.*;
import java.util.Objects;

@Entity(name="bodyTemperatures")
public class BodyTemperature {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column(name="time")
    private String time;
    @Column(name = "value")
    private String value;
    @Column(name="run_id")
    private long run_id;

    public BodyTemperature(String time, String value, long run_id) {
        this.time = time;
        this.value = value;
        this.run_id = run_id;
    }

    public  BodyTemperature(){

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BodyTemperature that = (BodyTemperature) o;
        return id == that.id &&
                run_id == that.run_id &&
                Objects.equals(time, that.time) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, time, value, run_id);
    }
}
