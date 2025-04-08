package elk.tsc.gov.kh.elk_tsc.document;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface HelloRepository extends ElasticsearchRepository<HelloDocument, String>{
  
}
