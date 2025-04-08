package elk.tsc.gov.kh.elk_tsc.configuration;

//import org.apache.http.conn.ssl.TrustAllStrategy;
//import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
//import javax.net.ssl.SSLContext;

@Configuration
@EnableElasticsearchRepositories(basePackages = "elk.tsc.gov.kh.elk_tsc.document") //
public class ELKRegisterConfiguration extends ElasticsearchConfiguration {

  @Value("${register.elasticsearch.user}")
  private String username;

  @Value("${register.elasticsearch.password}")
  private String password;

  @Override
  public ClientConfiguration clientConfiguration() {
      return ClientConfiguration.builder()
              .connectedToLocalhost()
              //.usingSsl(builSSLContext())
              .withBasicAuth(username, password)
              .build();
  }

  // private static SSLContext builSSLContext() {
  //     try {
  //         return new SSLContextBuilder().loadTrustMaterial(null, TrustAllStrategy.INSTANCE).build();
  //     } catch (Exception e) {
  //         throw new RuntimeException(e);
  //     }
  // }
}