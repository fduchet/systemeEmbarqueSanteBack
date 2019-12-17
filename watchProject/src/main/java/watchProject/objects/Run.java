package watchProject.objects;

import javax.persistence.*;
import java.util.Objects;

@Entity(name="runs")
public class Run {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column (name="date")
    private String date;
    @Column(name = "total_distance")
    private String total_distance;
    @Column(name = "total_time")
    private String total_time;
    @Column(name="average_speed")
    private String average_speed;
    @Column(name="average_heart_rate")
    private String  average_heart_rate;
    @Column(name="average_oxygen_level")
    private int  average_oxygen_level;
    @Column(name="description")
    private String description;
    @Column(name="user_id")
    private long user_id;

    public Run(String date, String total_distance, String total_time, String average_speed, String average_heart_rate, int average_oxygen_level, String description, long user_id) {
        this.date = date;
        this.total_distance = total_distance;
        this.total_time = total_time;
        this.average_speed = average_speed;
        this.average_heart_rate = average_heart_rate;
        this.average_oxygen_level = average_oxygen_level;
        this.description = description;
        this.user_id = user_id;
    }

    public Run(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotal_distance() {
        return total_distance;
    }

    public void setTotal_distance(String total_distance) {
        this.total_distance = total_distance;
    }

    public String getTotal_time() {
        return total_time;
    }

    public void setTotal_time(String total_time) {
        this.total_time = total_time;
    }

    public String getAverage_speed() {
        return average_speed;
    }

    public void setAverage_speed(String average_speed) {
        this.average_speed = average_speed;
    }

    public String getAverage_heart_rate() {
        return average_heart_rate;
    }

    public void setAverage_heart_rate(String average_heart_rate) {
        this.average_heart_rate = average_heart_rate;
    }

    public int getAverage_oxygen_level() {
        return average_oxygen_level;
    }

    public void setAverage_oxygen_level(int average_oxygen_level) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Run run = (Run) o;
        return id == run.id &&
                average_oxygen_level == run.average_oxygen_level &&
                user_id == run.user_id &&
                Objects.equals(date, run.date) &&
                Objects.equals(total_distance, run.total_distance) &&
                Objects.equals(total_time, run.total_time) &&
                Objects.equals(average_speed, run.average_speed) &&
                Objects.equals(average_heart_rate, run.average_heart_rate) &&
                Objects.equals(description, run.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, total_distance, total_time, average_speed, average_heart_rate, average_oxygen_level, description, user_id);
    }
}
