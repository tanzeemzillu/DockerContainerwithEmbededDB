package de.real.UpdateServicedata.leasson;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LessonRepository extends CrudRepository<Leasson,String> {

    public List<Leasson> findByCourseId(String courseId);
    public List<Leasson> findByTopicId(String topicId);
}
