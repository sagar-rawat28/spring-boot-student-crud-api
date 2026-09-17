package in.strikes.curdSpringBootDemo.controller;

import in.strikes.curdSpringBootDemo.entity.Student;
import in.strikes.curdSpringBootDemo.repository.StudentRepository;
import in.strikes.curdSpringBootDemo.service.StudentService;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {


    private final StudentRepository studentRepository;
    private StudentService studentService;
    public StudentController(StudentService studentService, StudentRepository studentRepository) {
        this.studentService = studentService;
        this.studentRepository = studentRepository;
    }
    //Create student.
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {

        System.out.println("Inside Student Controller");
        System.out.println("Exiting Student Controller");
       Student createdStudent= studentService.createStudent(student);

       // return ResponseEntity.ok(createdStudent);
//        return  ResponseEntity.status(201).body(createdStudent);
        return  ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdStudent);


//        System.out.println("CREATE API CALLED");
//        System.out.println("Name: " + student.getName());
//        System.out.println("Email: " + student.getEmail());
    }


    //==================
    //Read Student.
    //==================

  //  @GetMapping("/get/{id}")
    @GetMapping("/get")

    public ResponseEntity<Student> getStudent(@RequestParam Long id) {
       Student studentResp= studentService.getStudent(id);
       if(studentResp==null) {
           return ResponseEntity.notFound().build();
       }
       return ResponseEntity.ok(studentResp);
    }



    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudent() {
        List<Student> studentList= studentService.getAllStudent();
        if(studentList.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentList);
    }



    //==================
    //Update Student.
    //==================


   // @PutMapping("/update/{id}")
   @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestParam Long id , @RequestBody Student studentReq) {
        Student studentResp= studentService.updateStudent(id,studentReq);
        if(studentResp!=null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentResp);
    }


    //==================
    //Delete Student.
    //==================


//    @DeleteMapping("/delete/{id}")
@DeleteMapping("/delete")
    public ResponseEntity<String> deleteStudent(@RequestParam Long id) {
        Boolean isDeleted= studentService.deleteStudent(id);
        if(!isDeleted) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Record Deleted");
    }

    //==================
    //Soft Delete Student.
    //==================


//    @PatchMapping("/delete-soft/{id}")
@PatchMapping("/delete-soft")
    public ResponseEntity<String> deleteStudentSoftly(@RequestParam Long id){
        Boolean isDeleted= studentService.deleteStudentSoftly(id);
        if(!isDeleted) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok("Record Deleted");
    }

}
