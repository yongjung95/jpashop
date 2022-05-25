package jpabook.jpashop.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "CATEGORY_ITEM",
            joinColumns = @JoinColumn(name = "ITEM_ID"),
            inverseJoinColumns = @JoinColumn(name = "CATEGORY_ID")
    )
    private List<Item> items;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category parent;

    @OneToMany(mappedBy = "parent")
    private List<Category> child;
}
