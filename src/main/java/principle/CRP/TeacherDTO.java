package principle.CRP;

/**
 * @Author stormbroken
 * Create by 2021/03/04
 * @Version 1.0
 **/

public class TeacherDTO {
    private String id;

    public TeacherDTO() {
    }

    public TeacherDTO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TeacherDTO{" +
                "id='" + id + '\'' +
                '}';
    }
}
