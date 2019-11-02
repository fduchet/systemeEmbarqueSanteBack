package watchProject.objects;

import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.*;
import java.util.Objects;

@Entity(name="speeds")
public class Speed {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column(name="time")
    private float time;
    @Column(name="value")
    private float value;
    @Column(name="run_id")
    private long run_id;

    public Speed(float time, float value, long run_id) {
        this.time = time;
        this.value = value;
        this.run_id = run_id;
    }

    public Speed(){

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
        return "Speed{" +
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
        Speed speed = (Speed) o;
        return id == speed.id &&
                Float.compare(speed.time, time) == 0 &&
                Float.compare(speed.value, value) == 0 &&
                run_id == speed.run_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, time, value, run_id);
    }
}
