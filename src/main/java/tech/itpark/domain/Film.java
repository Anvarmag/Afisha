package tech.itpark.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Film {
    private long id;
    private String name;
    private double rating;
    private long timestamp;
    private String image;
    private String url;
    private boolean liked;
    private boolean available;
}
