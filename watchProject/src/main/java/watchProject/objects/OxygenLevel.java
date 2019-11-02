package watchProject.objects;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

public class OxygenLevel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column(name="time")
    private float time;
    @Column(name="value")
    private float value;
    @Column(name="run_id")
    private long run_id;

    public OxygenLevel(float time, float value, long run_id) {
        this.time = time;
        this.value = value;
        this.run_id = run_id;
    }

    public OxygenLevel(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
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
        return "OxygenLevel{" +
                "id=" + id +
                ", time=" + time +
                ", value=" + value +
                ", run_id=" + run_id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OxygenLevel that = (OxygenLevel) o;
        return id == that.id &&
                Float.compare(that.time, time) == 0 &&
                Float.compare(that.value, value) == 0 &&
                run_id == that.run_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, time, value, run_id);
    }
}
