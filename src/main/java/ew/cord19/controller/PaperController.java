package ew.cord19.controller;

import ew.cord19.app.PaperRepository;
import ew.cord19.model.Paper;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import static org.elasticsearch.index.query.QueryBuilders.queryStringQuery;

@RestController
@RequestMapping("/v1/papers")
@AllArgsConstructor
public class PaperController {

    PaperRepository paperRepository;

    @CrossOrigin
    @GetMapping(value = "/simple/{q}", produces = "application/json")
    public Page<Paper> getPapers(@PathVariable String q) {
        return (Page<Paper>) paperRepository.search(queryStringQuery(q));
    }

}
