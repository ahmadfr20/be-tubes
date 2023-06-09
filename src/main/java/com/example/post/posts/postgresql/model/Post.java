package com.example.post.posts.postgresql.model;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

    @Column(name = "penulis")
	private String penulis;

	@Column(name = "published")
	private boolean published;

	public Post() {

	}

	public Post(String title, String description, String penulis, boolean published) {
		this.title = title;
		this.description = description;
        this.penulis = penulis;
		this.published = published;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

    public String getPenulis() {
		return penulis;
	}

	public void setPenulis(String penulis) {
		this.penulis = penulis;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean isPublished) {
		this.published = isPublished;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", desc=" + description + ", penulis=" + penulis + ", published=" + published + "]";
	}

}

