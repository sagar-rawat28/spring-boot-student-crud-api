package in.strikes.curdSpringBootDemo.repository;

import in.strikes.curdSpringBootDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Repository/* It is not needed because it is interface cannot create bean of it.
public interface StudentRepository  extends JpaRepository<Student,Long> {
    void existsById(long id);

    Optional<Student> findByIdAndDeletedIsFalse(Long id);
    List<Student> findByDeletedIsFalse();

    //It is not useful because we do not want to write SQL query by ourselves.
//    public Student saveStudent(Student studentReq) {
//        //Save to DataBase.
//        System.out.println("Inside Student Repository");
//        System.out.println("Exiting Student Repository");
//        Student s1= new Student();
//        s1.setName("Sagar");
//        s1.setAge(23);
//        s1.setEmail("adddi");
//        s1.setRollNo(3);
//        s1.setSubject("kingfisher");
//        return s1;
//    }
}
