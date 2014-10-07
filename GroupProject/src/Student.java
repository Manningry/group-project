public class Student
	{

	private String firstName;
	private String lastName;
	private Double score;
	private int group;
	
public Student(String f, String l, Double s, int g)
	{
	firstName = f;
	lastName = l;
	score = s;
	group = g;
	}

public String getFirstName()
	{
	return firstName;
	}

public void setFirstName(String firstName)
	{
	this.firstName = firstName;
	}

public String getLastName()
	{
	return lastName;
	}

public void setLastName(String lastName)
	{
	this.lastName = lastName;
	}

public Double getScore()
	{
	return score;
	}

public void setScore(Double score)
	{
	this.score = score;
	}

public int getGroup()
	{
	return group;
	}

public void setGroup(int group)
	{
	this.group = group;
	}

@Override
public String toString()
	{
	return "Student [firstName=" + firstName + ", lastName=" + lastName
			+ ", score=" + score + ", group=" + group + ", getFirstName()="
			+ getFirstName() + ", getLastName()=" + getLastName()
			+ ", getScore()=" + getScore() + ", getGroup()=" + getGroup()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
	}

	}
