package com.mysite.sbb.answer;

import java.time.LocalDateTime;
import javax.persistence.ManyToOne;
import com.mysite.sbb.user.SiteUser;
import org.springframework.data.annotation.CreatedDate;

import com.mysite.sbb.question.Question;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import java.util.Set;
import javax.persistence.ManyToMany;

@Getter
@Setter
@Entity
public class Answer {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    @Column(columnDefinition = "TEXT")
	    private String content;

	    @CreatedDate
	    private LocalDateTime createDate;

	    @ManyToOne
	    private Question question;
	    
	    @ManyToOne
	    private SiteUser author;
	    
	    private LocalDateTime modifyDate;
	    
	    @ManyToMany
	    Set<SiteUser> voter;
}