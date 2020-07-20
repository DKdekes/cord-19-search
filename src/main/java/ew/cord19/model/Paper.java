package ew.cord19.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

@Document(indexName = "papers")
@Getter @Setter
public class Paper {

    @JsonProperty("paper_id")
    private @Id String id;

    @Field(type = FieldType.Nested, includeInParent = true)
    private Metadata metadata;

    @JsonProperty("abstract")
    @Field(type = FieldType.Nested, includeInParent = true)
    private List<Abstract> _abstract;

    @Field(type = FieldType.Nested, includeInParent = true)
    private List<BodyText> body_text;

//    @Field(type = FieldType.Nested, ignoreFields = {"authors", "ref_id"}, includeInParent = true)
//    private List<BibRef> bib_entries;

}
