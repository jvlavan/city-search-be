package dev.lavan.world.search.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "states",schema = "public")
public class States {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(nullable = false)
    @JsonProperty("name")
    String name;


    @Column(nullable = false,name="country_code")
    @JsonProperty("country_code")
    String countryCode;
    @Column(nullable = false,name="fips_code")
    @JsonProperty("fips_code")
    String flipsCode;
    @Column(nullable = false)
    @JsonProperty("iso2")
    String iso2;
    @Column(nullable = false)
    @JsonProperty("type")
    String type;
    @Column(nullable = false)
    @JsonProperty("latitude")
    BigDecimal latitude;
    @Column(nullable = false)
    @JsonProperty("longitude")
    BigDecimal longitude;
    @Column(nullable = false,name = "created_at")
    @CreationTimestamp
    @JsonProperty("created_at")
    Timestamp createdAt;
    @Column(nullable = false,name = "updated_at")
    @UpdateTimestamp
    @JsonProperty("updated_at")
    Timestamp updatedAt;
    @Column(nullable = false)
    @JsonProperty("flag")
    Integer flag;
    @Column(nullable = false,name = "wikidataid")
    @JsonProperty("wikidataid")
    String wikidataid;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="country_id",referencedColumnName = "id")
    Countries country;

}
