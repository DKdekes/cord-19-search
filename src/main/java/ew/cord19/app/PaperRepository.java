package ew.cord19.app;

import ew.cord19.model.Paper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

// apparently spring data will automatically implement this interface?
public interface PaperRepository extends ElasticsearchRepository<Paper, String> {
    Page<Paper> findById(String name, Pageable pageable);

    @Query("{\"bool\": {\"must\": [{\"match\": {\"authors.name\": \"?0\"}}]}}")
    Page<Paper> findByIdUsingCustomQuery(String name, Pageable pageable);

}
