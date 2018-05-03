package de.real.UpdateServicedata.leasson;

import de.real.UpdateServicedata.course.Course;
import de.real.UpdateServicedata.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Leasson {

    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private Topic topic;
    @ManyToOne
    private Course course;

    public Leasson(){

    }

    public Leasson(String id, String name, String description, String topicId, String courseId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic= new Topic(topicId, "", "");
        this.course = new Course(courseId,"","",topicId);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
