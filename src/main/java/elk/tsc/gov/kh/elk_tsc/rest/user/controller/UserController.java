package elk.tsc.gov.kh.elk_tsc.rest.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import elk.tsc.gov.kh.elk_tsc.rest.user.dto.UserDTO;
import elk.tsc.gov.kh.elk_tsc.service.user.UserService;

@RestController()
@RequestMapping("/api/user")
public class UserController {
  private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public void save(@RequestBody final UserDTO dto) {
        service.save(dto);
    }
}
