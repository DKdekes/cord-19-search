package ew.cord19.model;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Affiliation {
    private String laboratory;
    private String institution;
    private Location location;
}
