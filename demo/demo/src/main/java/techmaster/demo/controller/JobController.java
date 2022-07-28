//package techmaster.demo.model;
//
//import java.util.List;
//import java.util.UUID;
//import java.util.concurrent.ConcurrentHashMap;
//
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import vn.techmaster.crud_rest.dto.BookRequest;
//import vn.techmaster.crud_rest.dto.JobRequest;
//import vn.techmaster.crud_rest.model.Book;
//import vn.techmaster.crud_rest.model.Job;
//
//@RestController
//@RequestMapping("/job")
//public class JobController {
//    private ConcurrentHashMap<String, Job> jobs;
//    public JobController() {
//        jobs = new ConcurrentHashMap<>();
//        jobs.put("OX-13", new Job("OX-13","Lập trình","Mệt", Job.location.HANOI,1000000,"a@gmail.com"));
//        //books.put("OX-14", new Book("OX-14", "Chi Dau", "Nam Cao", 1943));
//    }
//
//    @GetMapping
//    public List<Job> getJobs() {
//        return jobs.values().stream().toList();
//    }
//
//    @PostMapping
////    private String id;
////    private String title;
////    private String description;
////    //private enum location;
////    public enum location {
////        HANOI, HAIPHONG, DANANG, HOCHIMINH
////    }
////    private int min_salary;
////    private int max_salary;
////    private String email_to;
//    public Job createNewJob(@RequestBody JobRequest jobRequest) {
//        String uuid = UUID.randomUUID().toString();
//        Job newJob = new Job(uuid, jobRequest.title(), jobRequest.description(), jobRequest.location(),jobRequest.max_salary(),
//                jobRequest.max_salary(),jobRequest.email_to());
//        jobs.put(uuid, newJob);
//        return newJob;
//    }
//
//    @GetMapping(value="/{id}")
//    public Job getBookById(@PathVariable("id") String id) {
//        return jobs.get(id);
//    }
//
//    @PutMapping(value="/{id}")
//    public Job updateJobById(@PathVariable("id") String id, @RequestBody JobRequest jobRequest) {
//        Job updateBook = new Job(id, bookRequest.title(), bookRequest.author(), bookRequest.year());
//        //books.put(id, updateBook);
//        jobs.replace(id, updateBook);
//        return updateBook;
//    }
//
//    @DeleteMapping(value="/{id}")
//    public Job deleteJobById(@PathVariable("id") String id) {
//        Job removedJob = jobs.remove(id);
//        return removedJob;
//    }
//}
