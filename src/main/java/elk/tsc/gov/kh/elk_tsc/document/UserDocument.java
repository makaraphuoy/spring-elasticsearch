package elk.tsc.gov.kh.elk_tsc.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Mapping;

@Document(indexName = "user")
@Mapping(mappingPath = "static/user.json")
public class UserDocument {
  @Id
  private String id;
  private String name;

  public String getId() {
      return id;
  }

  public void setId(String id) {
      this.id = id;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }
}
  /* 
  private String password;

  public String getPassword(){
    return password;
  }

  public void setPassword(String password){
    this.password = password;
  }
*/