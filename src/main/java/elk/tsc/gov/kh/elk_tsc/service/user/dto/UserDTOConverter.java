package elk.tsc.gov.kh.elk_tsc.service.user.dto;

import org.springframework.stereotype.Component;

import elk.tsc.gov.kh.elk_tsc.document.UserDocument;
import elk.tsc.gov.kh.elk_tsc.rest.user.dto.UserDTO;

@Component
public class UserDTOConverter {
  public UserDocument convertToDocument(final UserDTO dto) {
    if (dto == null) {
        return null;
    }

    final UserDocument UserDocument = new UserDocument();
    UserDocument.setId(dto.getId());
    UserDocument.setName(dto.getName());
    // UserDocument.setEmail(dto.getEmail());
    // UserDocument.setUsername(dto.getUsername());
    //UserDocument.setPassword(dto.getPassword());

    return UserDocument;
}
}
