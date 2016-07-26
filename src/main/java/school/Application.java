/*
 * Copyright [2011-2016] "Neo Technology"
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 *
 */
package school;

import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
//import org.springframework.boot.neo4j.NodeEntityScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EntityScan(basePackages = "school.domain")
public class Application {

    public static void main(String[] args) {
        new SpringApplication(Application.class).run(args);
    }
    
//    public static final String URL = System.getenv("NEO4J_URL") != null ? System.getenv("NEO4J_URL") : "http://localhost:7474";
    
//    public class Neo4jSessionFactory {
//
//        private final static SessionFactory sessionFactory = new SessionFactory("school.domain");
//        private static Neo4jSessionFactory factory = new Neo4jSessionFactory();
//
//        public static Neo4jSessionFactory getInstance() {
//            return factory;
//        }
//
//        private Neo4jSessionFactory() {
//        }
//
//        public Session getNeo4jSession() {
//            return sessionFactory.openSession();
//        }
//    }
    
    @Bean
    public Configuration getConfiguration() {
       Configuration config = new Configuration();
       config
           .driverConfiguration()
           .setCredentials("test_prokarma","Gi6516ORGRAloCrCf5tq")
//           .setDriverClassName("org.neo4j.ogm.drivers.bolt.driver.BoltDriver")
//           .setURI("bolt://sb10.stations.graphenedb.com:24786");
       .setDriverClassName("org.neo4j.ogm.drivers.http.driver.HttpDriver")
       .setURI("http://testprokarma.sb10.stations.graphenedb.com:24789");
       return config;
    }
    
    @Bean
    public SessionFactory getSessionFactory() {
        return new SessionFactory("school.domain");
    }

}
