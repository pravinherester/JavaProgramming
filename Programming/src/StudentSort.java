import java.util.Comparator;

class Student implements Comparable<Student>{
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "rollno:" + rollno + "and name : " + name;
    }

    @Override
    public int compareTo(Student o) {
        if (rollno ==o.rollno)
            return 0;
        else if (rollno > o.rollno)
            return 1 ;
        else 
            return -1;
        
        
    }
}

class StudentSortByRoll implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        return o1.rollno - o2.rollno;
    }
}

class StudentSortByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        return o1.name.compareTo(o2.name);
    }

    

  
}
