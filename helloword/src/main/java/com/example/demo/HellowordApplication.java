package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.HelloWord;
import com.example.demo.service.BuissnessService;

@SpringBootApplication
public class HellowordApplication implements CommandLineRunner {
	/*
	 *     Au sein d’une application Spring Boot, écrire du code implique de définir les beans utilisés par Spring.

    On peut exécuter du code grâce à l’implémentation de l’interface CommandLineRunner et de la méthode run.

    Pour qu’une classe soit déclarée en tant que bean, on l’annote @Component.

    Pour qu’un bean soit injecté dans un attribut, on annote l’attribut @Autowired.

    #


	 * */
	/*
	 *     Spring Boot fournit une annotation @SpringBootTest qui permet de charger le contexte Spring lors de l’exécution des tests.

    Déployer une application Spring Boot est très facile, car l’artefact qui en résulte est un simple JAR où tout est embarqué.

    Il existe plusieurs méthodes pour exécuter notre application Spring Boot :

        Via l’IDE directement.

        Grâce à Maven et au goal spring-boot:run.

        En exécutant la commande java -jar.
	 * */
	
	@Autowired
	private BuissnessService bs;

	public static void main(String[] args) {
		SpringApplication.run(HellowordApplication.class, args);
	}

// On implemente l'interface CommandLineRunner pour pouvoir afficher les data dans la console
	@Override
	public void run(String... args) throws Exception {
	 HelloWord h = bs.getHelloword();
	 System.out.println(h);

	}

}
