package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import ex01.MyApplication01;

@SpringBootConfiguration
public class MyApplication01 {

	@Bean("MyComponent01")
	public MyComponent myComponent() {
		return new MyComponent();
	}

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ac = SpringApplication.run(MyApplication01.class, args)) {
		}

	}
}
