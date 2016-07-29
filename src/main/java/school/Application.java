package school;

import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableAutoConfiguration
@ComponentScan
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

//    @Bean
//    public Configuration getConfiguration() {
//        Configuration config = new Configuration();
//        config.driverConfiguration().setCredentials("test_prokarma", "Gi6516ORGRAloCrCf5tq")
//                .setDriverClassName("org.neo4j.ogm.drivers.http.driver.HttpDriver")
//                .setURI("http://testprokarma.sb10.stations.graphenedb.com:24789");
//        // .setDriverClassName("org.neo4j.ogm.drivers.bolt.driver.BoltDriver") //edit pom.xml for
//        // this driver
//        // .setURI("bolt://sb10.stations.graphenedb.com:24786");
//        return config;
//    }
//
//    @Bean
//    public SessionFactory getSessionFactory() {
//        return new SessionFactory("school.domain");
//    }

}
