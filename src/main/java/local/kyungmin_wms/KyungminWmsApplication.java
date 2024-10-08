package local.kyungmin_wms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class KyungminWmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KyungminWmsApplication.class, args);
	}

}
