package chanbrightt.mission3;

import chanbrightt.mission3.repository.BurgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "chanbrightt.mission3.repository")
@SpringBootApplication
public class Mission3Application implements CommandLineRunner {

	@Autowired
	BurgerRepository burgerRepository;

	public static void main(String[] args) {
		SpringApplication.run(Mission3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//	burgerRepository.save(new BurgerMenu(1,"Cheese Burger",200d));
//	burgerRepository.save(new BurgerMenu(2,"Double Cheese Burger",280d));
//	burgerRepository.save(new BurgerMenu(3,"Bacon Cheese Burger",280d));
//	burgerRepository.save(new BurgerMenu(4,"Omakase Burger",2000d));
//	burgerRepository.save(new BurgerMenu(5,"Kid's Burger",120d));
//	burgerRepository.save(new BurgerMenu(6,"Water",20d));
//	burgerRepository.save(new BurgerMenu(7,"Coke",50d));
	}
}
