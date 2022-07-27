import java.util.*;

public class School {
    public String name;
    public String zipCode;
    public long numStudents;

    public School(String n, String zip, long num) {
        name = n;
        zipCode = zip;
        numStudents = num;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof School) {
            return name.equals(((School) other).name);
        }
        else return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
    public static long fun(List<School> schools, String in) {
//        List<School> temp1 = new LinkedList<>();
//        for (School s : schools) {
//            if (s.zipCode.equals(in)) {
//                temp1.add(s);
//            }
//        }
//        List<School> temp2 = new LinkedList<>();
//        for (School s : temp1) {
//            if (temp2.contains(s) == false) {
//                temp2.add(s);
//            }
//        }
//        long a = 0;
//        for (School s : temp2) {
//            a += s.numStudents;
//        }
//        return a / temp2.size();
        Long sumStudents = schools.stream()
                .filter(school -> school.zipCode.equals(in))
                .distinct()
                .map(school -> school.numStudents)
                .reduce(0L, (a, b) -> a + b);

        Long numDistinctSchools = schools.stream()
                .filter(school -> school.zipCode.equals(in))
                .distinct()
                .count();

        return sumStudents / numDistinctSchools;
    }
}