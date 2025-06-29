package com.adeesha.AutowiringConcepts;

import com.adeesha.AutowiringConcepts.beans.Person;
import com.adeesha.AutowiringConcepts.beans.Vehicle;
import com.adeesha.AutowiringConcepts.config.ProjectConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AutowiringConceptsApplication {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		//If you are using Spring Boot, you can use the following line instead:
		//But make sure whether the main class to the root package


//		var context = SpringApplication.run(AutowiringConceptsApplication.class, args);

		// Get all beans of type Person and Vehicle
		String[] persons = context.getBeanNamesForType(Person.class);
		Person person = context.getBean(Person.class);

		String[] names = context.getBeanNamesForType(Vehicle.class);

//		System.out.println(Arrays.toString(persons));
//		System.out.println(person);
//		System.out.println(Arrays.toString(names));

		Vehicle vehicle = context.getBean(Vehicle.class);
		vehicle.getVehicleService().playMusic();
		vehicle.getVehicleService().moveVehicle();

	}

}
