/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.time.LocalDateTime;

/**
 *
 * @author javie
 */
public class SubCategory {
    private int id;
    private String subCategory;
    private String description;
    private LocalDateTime created;
    private LocalDateTime updated;
    private Category category;

    public SubCategory(int id, String subCategory, String description, LocalDateTime created, LocalDateTime updated,Category category) {
        this.id = id;
        this.subCategory = subCategory;
        this.description = description;
        this.created = created;
        this.updated = updated;
        this.category=category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
    
}
