package egovframework;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

import egovframework.com.config.EgovWebApplicationInitializer;

@ServletComponentScan
@SpringBootApplication
@Import({EgovWebApplicationInitializer.class})
public class EgovBootApplication extends SpringBootServletInitializer{
	
	// 이 부분 추가
		@Override
		protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
			return builder.sources(EgovBootApplication.class);
		}
	

	public static void main(String[] args) {
		
		SpringApplication springApplication = new SpringApplication(EgovBootApplication.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		//springApplication.setLogStartupInfo(false);
		springApplication.run(args);
		System.out.println("##### EgovBootApplication End #####");
	}

}
