package watchProject.objects;

import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Objects;

@Entity(name="runs")
public class Run {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "total_distance")
    private float total_distance;
    @Column(name = "total_time")
    private float total_time;
    @Column(name="average_speed")
    private float average_speed;
    @Column(name="average_heart_rate")
    private float average_heart_rate;
    @Column(name="average_oxygen_level")
    private float average_oxygen_level;
    @Column(name="description")
    private String description;
    @Column(name="user_id")
    private long user_id;

    public Run(float total_distance, float total_time, float average_speed, float average_heart_rate, float average_oxygen_level, String description, long user_id){
        this.total_distance=total_distance;
        this.total_time=total_time;
        this.average_speed=average_speed;
        this.average_heart_rate=average_heart_rate;
        this.average_oxygen_level=average_oxygen_level;
        this.description=description;
        this.user_id=user_id;
    }

    public Run(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getTotal_distance() {
        return total_distance;
    }

    public void setTotal_distance(float total_distance) {
        this.total_distance = total_distance;
    }

    public float getTotal_time() {
        return total_time;
    }

    public void setTotal_time(float total_time) {
        this.total_time = total_time;
    }

    public float getAverage_speed() {
        return average_speed;
    }

    public void setAverage_speed(float average_speed) {
        this.average_speed = average_speed;
    }

    public float getAverage_heart_rate() {
        return average_heart_rate;
    }

    public void setAverage_heart_rate(float average_heart_rate) {
        this.average_heart_rate = average_heart_rate;
    }

    public float getAverage_oxygen_level() {
        return average_oxygen_level;
    }

    public void setAverage_oxygen_level(float average_oxygen_level) {
        this.average_oxygen_level = average_oxygen_level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Run{" +
                "id=" + id +
                ", total_distance=" + total_distance +
                ", total_time=" + total_time +
                ", average_speed=" + average_speed +
                ", average_heart_rate=" + average_heart_rate +
                ", average_oxygen_level=" + average_oxygen_level +
                ", description='" + description + '\'' +
                ", user_id=" + user_id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Run run = (Run) o;
        return id == run.id &&
                Float.compare(run.total_distance, total_distance) == 0 &&
                Float.compare(run.total_time, total_time) == 0 &&
                Float.compare(run.average_speed, average_speed) == 0 &&
                Float.compare(run.average_heart_rate, average_heart_rate) == 0 &&
                Float.compare(run.average_oxygen_level, average_oxygen_level) == 0 &&
                user_id == run.user_id &&
                Objects.equals(description, run.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, total_distance, total_time, average_speed, average_heart_rate, average_oxygen_level, description, user_id);
    }
}
