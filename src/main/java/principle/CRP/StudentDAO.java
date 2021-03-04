package principle.CRP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author stormbroken
 * Create by 2021/03/04
 * @Version 1.0
 **/

public class StudentDAO {
    private DBUtil dbOperator;
    private Map<String, StudentDTO> map = new HashMap<>();

    public void setDbOperator(DBUtil dbOperator){
        this.dbOperator = dbOperator;
    }

    public StudentDTO findStudentById(String id){
        dbOperator.getConnection();
        StudentDTO studentDTO = map.get(id);
        return studentDTO;
    }

    public List<StudentDTO> findAllStudents(){
        dbOperator.getConnection();
        List<StudentDTO> studentDTOS = new ArrayList<>(map.values());
        return studentDTOS;
    }

    public boolean save(StudentDTO studentDTO){
        dbOperator.getConnection();
        map.put(studentDTO.getId(), studentDTO);
        return true;
    }
}
