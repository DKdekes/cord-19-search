package ew.cord19.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Metadata {
    private String title;
    private List<Author> authors;
    private Affiliation affiliation;
}
