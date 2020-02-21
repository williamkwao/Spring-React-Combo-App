package e.the.awesome.springreactcomboapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.servlet.annotation.WebServlet;

@SpringBootApplication
@WebServlet
public class SpringReactComboAppApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringReactComboAppApplication.class, args);
	}

}
