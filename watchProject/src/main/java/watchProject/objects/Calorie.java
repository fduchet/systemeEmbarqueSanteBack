package watchProject.objects;

import javax.persistence.*;
import java.util.Objects;

@Entity(name="calories")
public class Calorie {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column(name="time")
    private String time;
    @Column(name = "value")
    private String value;
    @Column(name="run_id")
    private long run_id;

    public Calorie(String time, String value, long run_id) {
        this.time = time;
        this.value = value;
        this.run_id = run_id;
    }

    public Calorie(){

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
        return "Calorie{" +
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
        Calorie calorie = (Calorie) o;
        return id == calorie.id &&
                run_id == calorie.run_id &&
                Objects.equals(time, calorie.time) &&
                Objects.equals(value, calorie.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, time, value, run_id);
    }
}
