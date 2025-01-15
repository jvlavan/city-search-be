package dev.lavan.world.search.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cities",schema = "public")
public class Cities {
    @Id
    @JsonProperty("id")
    private Integer id;

    @Column(nullable = false)
    @JsonProperty("name")
    private String name;

    @Column(nullable = false,name = "state_id")
    @JsonProperty("state_id")
    private Integer stateId;

    @Column(nullable = false,name = "state_code")
    @JsonProperty("state_code")
    private String stateCode;

    @Column(nullable = false,name = "country_id")
    @JsonProperty("country_id")
    private Integer countryId;

    @Column(nullable = false,name = "country_code")
    @JsonProperty("country_code")
    private String countryCode;

    @Column(nullable = false)
    @JsonProperty("latitude")
    private Float latitude;

    @Column(nullable = false)
    @JsonProperty("longitude")
    private Float longitude;

    @Column(nullable = false,name = "created_at")
    @JsonProperty("created_at")
    private Timestamp createdAt;

    @Column(nullable = false,name = "updated_at")
    @JsonProperty("updated_at")
    private Timestamp updatedAt;

    @Column(nullable = false)
    @JsonProperty("flag")
    private Integer flag;

    @Column(nullable = false, name = "wikidataid")
    @JsonProperty("wikidataid")
    private String wikidataid;
}
