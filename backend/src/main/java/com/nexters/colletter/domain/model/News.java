package com.nexters.colletter.domain.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "news")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "news_id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "uri")
    private String uri;
    @Column(name = "view")
    private int view;
    @Column(name = "image")
    private String image;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;
    @OneToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Builder
    public News(
            String name,
            String uri,
            int view,
            String image,
            String title,
            String content,
            Category category
    ) {
        this.name = name;
        this.uri = uri;
        this.view = view;
        this.image = image;
        this.title = title;
        this.content = content;
        this.category = category;
    }
}
