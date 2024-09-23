package com.aaruran.Joblisting.repository;

import com.aaruran.Joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepository extends MongoRepository<Post,String> {
}
