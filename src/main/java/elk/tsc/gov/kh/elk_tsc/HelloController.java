package elk.tsc.gov.kh.elk_tsc;

import org.springframework.web.bind.annotation.RestController;

import elk.tsc.gov.kh.elk_tsc.document.HelloDocument;
import elk.tsc.gov.kh.elk_tsc.document.HelloRepository;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;

@RestController()
public class HelloController {
  private HelloRepository helloRepository;

  public HelloController(HelloRepository helloRepository){
    this.helloRepository = helloRepository;
  }

  @GetMapping("/hello")
  public String getHello() {
      HelloDocument hello = new HelloDocument();
      hello.setId(UUID.randomUUID().toString());
      hello.setTest("TSC-TESTING");
      helloRepository.save(hello);
      return "TSC-RESPONSE";
  }
  
}
