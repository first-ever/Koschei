package koschei.models;

public class Island2 {

    private Wood3 wood;

    public Island2(Wood3 needle) {
        this.wood = needle;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
