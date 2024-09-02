package ediLuis.menuPizzeria;

import ediLuis.menuPizzeria.entities.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MenuPizzeriaApplication implements CommandLineRunner {

	public static void main(String[] args)  {
		SpringApplication.run(MenuPizzeriaApplication.class, args);
		
		System.out.println("Hello World!");
	}

	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuPizzeriaApplication.class);
		Menu menu = ctx.getBean(Menu.class);

		menu.printMenu();


	}
}
