package ew.cord19.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import ew.cord19.app.PaperRepository;
import ew.cord19.model.Paper;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("ingest")
@AllArgsConstructor
public class IngestionController {
    private static Logger logger = LoggerFactory.getLogger(IngestionController.class);

    @Qualifier("elasticsearchTemplate")
    private ElasticsearchOperations elasticsearchTemplate;

    private PaperRepository paperRepository;

    @CrossOrigin
    @GetMapping(value = "/", produces = "application/json")
    public void ingest() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        elasticsearchTemplate.deleteIndex(Paper.class);
        elasticsearchTemplate.createIndex(Paper.class);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        File folder = new File("C:\\Development\\CORD-19\\document_parses\\pdf_json");
        File[] listOfFiles = folder.listFiles();
        assert listOfFiles != null;
        for (int i=0; i<listOfFiles.length; i++) {
            Paper paper = objectMapper.readValue(new File(listOfFiles[i].getAbsolutePath()), Paper.class);
            paperRepository.save(paper);
        }
    }
}
