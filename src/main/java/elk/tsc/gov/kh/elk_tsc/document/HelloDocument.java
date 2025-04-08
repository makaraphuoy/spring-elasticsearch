package elk.tsc.gov.kh.elk_tsc.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Getter;
import lombok.Setter;

@Document(indexName = "hello")
@Getter
@Setter
public class HelloDocument {
  @Id
  private String id;
  private String test;
}
