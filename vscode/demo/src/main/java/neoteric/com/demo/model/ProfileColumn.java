package neoteric.com.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "profile_column")
public class ProfileColumn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "column_name")
    private String columnName;

    @Column(name = "content")
    private String content;
    public ProfileColumn(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Getters and setters
}
