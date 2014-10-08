import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class MainProgram
	{

	public static void main(String[] args) throws IOException
		{
	
		ArrayList <Student> gradebook = new ArrayList <Student>();


		Scanner file= new Scanner(new File("roster1.txt"));
		int numberOfStudents = file.nextInt();

		for(int i =0; i < numberOfStudents; i++)
			{
			String firstName = file.next();
			String lastName = file.next();
			double score = file.nextDouble();
			
			gradebook.add(new Student(firstName,lastName,score, 0));
			Collections.sort(gradebook, new ScoreSorter());
		
			}
		
		System.out.println("How many groups would you like?");
		
		Scanner userInput = new Scanner(System.in);
		int amountOfGroups = userInput.nextInt();
		boolean Group = true;
		
		while(Group)
		{
			for(int i = 0; i < gradebook.size(); i++)
				if(gradebook.get(i).getGroup()==0)
					for(int j = 0; j < amountOfGroups; j++)
						gradebook.get(i).setGroup(j);
		
		}
				
				
						
					

					
	for(Student x: gradebook)
			{
			System.out.println(x.getFirstName() + " " + x.getLastName() + " " + x.getScore() + "  " + x.getGroup());
			}

			
			}
		}




	



//	call datafile with a scanner
//	numberOfStudents = file.nextInt
//
//	for loop
//		firstName = file.next()
//		lastName = file.next()
//		score = file.nextDouble()
//		add students to the ArrayList
//
//	sort each student by grade and put in order
//	Create sorters
//
//	ask for how many groups
//	Scanner input
//
//
//	for loop to assign ArrayList students to the groups
//		(0-ArrayList.length)
//		
//			
//		
//		
//		
//		
//		
//		
//		
//		
//	Collections.sort(gradeBook, new ScoreScorter());
	

	
