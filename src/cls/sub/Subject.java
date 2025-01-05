package cls.sub;

public class Subject {
    @Override
    public String toString() {
        return super.toString();
    }

    // private 문자열 title
    private String title;

    public Subject(String title) {
        this.title = title;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Subject) {
            Subject sub = (Subject) obj;
            if ( sub.toString().equals(title) )
                return true;
        }

        return false;
    }


}
