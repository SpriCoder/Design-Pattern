package principle.CRP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TransferQueue;

/**
 * @Author stormbroken
 * Create by 2021/03/04
 * @Version 1.0
 **/

public class TeacherDAO {
    private DBUtil dbOperator;
    private Map<String, TeacherDTO> map = new HashMap<>();

    public void setDbOperator(DBUtil dbOperator) {
        this.dbOperator = dbOperator;
    }

    public TeacherDTO findTeacherById(String id){
        dbOperator.getConnection();
        TeacherDTO teacherDTO = map.get(id);
        return teacherDTO;
    }

    public List<TeacherDTO> findAllTeacher(){
        dbOperator.getConnection();
        List<TeacherDTO> teacherDTOS = new ArrayList<>(map.values());
        return teacherDTOS;
    }

    public boolean save(TeacherDTO teacherDTO){
        dbOperator.getConnection();
        map.put(teacherDTO.getId(), teacherDTO);
        return true;
    }

}
