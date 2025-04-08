package elk.tsc.gov.kh.elk_tsc.rest.index;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import elk.tsc.gov.kh.elk_tsc.service.index.IndexService;

@RestController
@RequestMapping("/api/index")
public class IndexController {
      private final IndexService service;

    public IndexController(IndexService service) {
        this.service = service;
    }

    @PostMapping
    public void create() {
        service.createIndices();
    }
}
