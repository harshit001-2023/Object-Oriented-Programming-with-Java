package Arrays.Arrays3d;

public class DepartmentWiseStudentMarks {
    static void main() {
        int dept, student, marks, total = 0;

        int[][][] arr = {{{50,51,52},{60,61,62}},
                {{70,71,72},{80,81,82}},
                {{65,62,66},{75,76,86}}};

        for(dept = 0; dept < 3; dept++) {
            IO.println("Department "+(dept+1+": "));
            for (student = 0; student < 2; student++){
                IO.print("Student "+(student+1+"marks: "));
                for (marks = 0; marks < 3; marks++){
                    IO.print(arr[dept][student][marks]+" ");
                    total = total + arr[dept][student][marks];

                }
                IO.println("Total marks: "+total);
                total = 0;
            }
            IO.println();
        }
    }
}
