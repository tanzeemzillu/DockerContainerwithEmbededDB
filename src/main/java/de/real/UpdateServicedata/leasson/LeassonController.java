package de.real.UpdateServicedata.leasson;

import de.real.UpdateServicedata.course.Course;
import de.real.UpdateServicedata.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LeassonController {

    @Autowired
    private LeassonService leassonService;

    @RequestMapping("/Topics/{id}/courses/{courseId}/leassons")
    public List<Leasson> getAllLeassons(@PathVariable String courseId){
        return leassonService.getAllLeassons(courseId);
    }

    @RequestMapping("/Topics/{topicId}/courses/{courseId}/leassons/{id}")
    public Leasson getLeasson(@PathVariable String id){
        return leassonService.getLeasson(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/Topics/{topicId}/courses/{courseId}/leassons")
    public void addLeasson(@RequestBody Leasson leasson, @PathVariable String courseId){
        leasson.setCourse(new Course(courseId, "","",""));
        leassonService.addLeasson(leasson);
    }
}
