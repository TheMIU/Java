package compare_obj_vs_primitive;

public class TestObj {
    private int id;

    TestObj(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestObj otherTestObj = (TestObj) obj;
        return id == otherTestObj.id;
    }
}
