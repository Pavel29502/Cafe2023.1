package com.example.cafe2023.repository;

import com.example.cafe2023.bean.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

//    Users findById(Integer id);

    List<Users> findByName(String name);

    List<Users>


        Users findUserByEmail(String email);

        boolean existsUserByEmail(String email);



//
//    public List<Users> findById(Integer id);

//    @Service
//    public class StudentsService {
//        @Autowired
//        private StudentsRepository studentsRepository;
//
//        public Students findById(Long id) throws NotFoundException {
//            //получить студента по id
//            return studentsRepository.findById(id).orElseThrow(() -> new NotFoundException("Student not found with id " + id));
//        }
//        public List<Students> findAll() {
//            return studentsRepository.findAll();
//        }
//        //public void create(Long id, String firstName, String lastName, String groupp, boolean payment) {
//        //Students student1 = new Students(id, firstName, lastName, groupp, payment);
//        public void create(Students student1) {
//            studentsRepository.save(student1);
//        }
//
//        public List<Students> findAllByPayment() {
//
//            return studentsRepository.findAllByPaymentFalse();
//        }
}
