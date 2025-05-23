package dev.lavan.world.search.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "regions",schema = "public")
public class Regions {

        @Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id;
        @Column(nullable = false)
        String name;

        @Column(nullable = false)
        String translations;

        @Column(nullable = false,name = "created_at")
                @CreationTimestamp
        Timestamp createdAt;
        @UpdateTimestamp
        @Column(nullable = false,name = "updated_at")
        Timestamp updatedAt;
        @Column(nullable = false)
        Integer flag;
        @Column(nullable = false,name = "wikidataid")

        String wikidataid;
}
