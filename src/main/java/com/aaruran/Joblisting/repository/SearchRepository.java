package com.aaruran.Joblisting.repository;

import com.aaruran.Joblisting.model.Post;
import org.springframework.stereotype.Component;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
