package models;
import java.time.LocalDateTime;
/**
 *
 * @author javie
 */
public class Category {
    private int id;
    private String category;
    private String description;
    private LocalDateTime created;
    private LocalDateTime updated;
    private boolean bitStatus; 
    public Category() {
    }
    
    public Category(int id, String category, String description, LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.created = created;
        this.updated = updated;
    }

    public boolean isBitStatus() {
        return bitStatus;
    }

    public void setBitStatus(boolean bitStatus) {
        this.bitStatus = bitStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
