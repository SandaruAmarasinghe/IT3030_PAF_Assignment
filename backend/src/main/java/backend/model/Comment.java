package backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import backend.service.User;

@Entity
public class Comment {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      private String content;

      @ManyToOne
      private User author;

      @ManyToOne
      private Post post;

      public Comment() {
            // Default constructor required by JPA
      }

      public Comment(String content, User author, Post post) {
            this.content = content;
            this.author = author;
            this.post = post;
      }

      // Getters and Setters
      public Long getId() {
            return id;
      }

      public void setId(Long id) {
            this.id = id;
      }

      public String getContent() {
            return content;
      }

      public void setContent(String content) {
            this.content = content;
      }

      public User getAuthor() {
            return author;
      }

      public void setAuthor(User author) {
            this.author = author;
      }

      public Post getPost() {
            return post;
      }

      public void setPost(Post post) {
            this.post = post;
      }
}
