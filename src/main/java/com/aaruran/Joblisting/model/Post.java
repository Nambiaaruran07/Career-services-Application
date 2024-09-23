package com.aaruran.Joblisting.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.DomainEvents;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Setter
@Getter
@Document(collection="JobPost")
public class Post {
    private String profile;
    private String desc;
    private int exp;
    private String techs[];

    public Post() {
    }

    @Override
    public String toString() {
        return "Post{" +
                "profile='" + profile + '\'' +
                ", desc='" + desc + '\'' +
                ", exp=" + exp +
                ", techs=" + Arrays.toString(techs) +
                '}';
    }
}
