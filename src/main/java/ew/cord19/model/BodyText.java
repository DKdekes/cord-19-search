package ew.cord19.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BodyText {
    private String text;
    private List<Cite> cite_spans;
    private String section;
}
