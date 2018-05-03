package de.real.UpdateServicedata.leasson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeassonService {

    @Autowired
    private LessonRepository lessonRepository;

    public List<Leasson> getAllLeassons(String courseId){
        List<Leasson> leassons = new ArrayList<>();
        lessonRepository.findByCourseId(courseId).forEach(leassons::add);
        return leassons;
    }

    public Leasson getLeasson(String id){
        return lessonRepository.findById(id).orElse(null);
    }

    public void addLeasson(Leasson leasson){
        lessonRepository.save(leasson);
    }

}
