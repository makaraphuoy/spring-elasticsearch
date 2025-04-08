package elk.tsc.gov.kh.elk_tsc.service.user;

import org.springframework.stereotype.Service;

import elk.tsc.gov.kh.elk_tsc.document.UserDocument;
import elk.tsc.gov.kh.elk_tsc.document.UserRepository;
import elk.tsc.gov.kh.elk_tsc.rest.user.dto.UserDTO;
import elk.tsc.gov.kh.elk_tsc.service.user.dto.UserDTOConverter;

@Service
public class UserService {
  private final UserRepository repository;
  private final UserDTOConverter converter;

  public UserService(final UserRepository repository,
                       final UserDTOConverter converter) {
      this.repository = repository;
      this.converter = converter;
  }

  public void save(final UserDTO dto) {
      final UserDocument document = converter.convertToDocument(dto);
      if (document == null) {
          return;
      }
      System.out.println("={%s}="+dto.getName());
      repository.save(document);
      //repository.deleteAll();
  }
}
