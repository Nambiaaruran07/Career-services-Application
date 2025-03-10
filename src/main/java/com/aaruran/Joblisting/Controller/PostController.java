package com.aaruran.Joblisting.Controller;

import com.aaruran.Joblisting.repository.PostRepository;
import com.aaruran.Joblisting.model.Post;
import com.aaruran.Joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    SearchRepository searchRepository;

    @ApiIgnore
    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping(path="/allPosts")
    @CrossOrigin
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    @GetMapping(path="posts/{text}")
    public List<Post> search(@PathVariable String text){
        return searchRepository.findByText(text);
    }

    @PostMapping(path="post")
    public Post addPost(@RequestBody Post post){
        return postRepository.save(post);
    }


}
