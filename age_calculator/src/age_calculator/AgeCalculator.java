package age_calculator;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter your brith date 'AAAA-MM-DD' : ");
		String birthDate = scanner.nextLine();
		LocalDate birthDateLocal = LocalDate.parse(birthDate);
				
		LocalDate today = LocalDate.now();
		
		Period period = Period.between(birthDateLocal, today);
		
		int age = period.getYears();
		
		System.out.println("Hello!! " + name.toUpperCase() + " your age is " + age + ".");
		
		scanner.close();		

	}

}
