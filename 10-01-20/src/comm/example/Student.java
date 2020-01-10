package comm.example;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Student implements Comparable<Student>{
private String studentId;
private String firstName,lastName;
private double cgpa;
@Override
public int compareTo(Student student)
{
	int result=0;
	if(this.getCgpa()>student.getCgpa())
		result=1;
	if(this.getCgpa()<student.getCgpa())
		result=-1;
    if(this.getCgpa()==student.getCgpa())
    	result=0;
    return result;
}
}
