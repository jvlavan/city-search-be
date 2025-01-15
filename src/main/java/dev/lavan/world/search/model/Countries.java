package dev.lavan.world.search.model;

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
@Table(name = "countries",schema = "public")
public class Countries {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id;
        @Column(nullable = false)
        String name;
        @Column(nullable = false)
        String iso3;
        @Column(nullable = false,name = "numeric_code")
        String numericCode;
        @Column(nullable = false)
        String iso2;
        @Column(nullable = false,name = "phonecode")
        String phoneCode;
        @Column(nullable = false)
        String capital;
        @Column(nullable = false)
        String currency;
        @Column(nullable = false,name = "currency_name")
        String currencyName;
        @Column(nullable = false,name = "currency_symbol")
        String currencySymbol;
        @Column(nullable = false)
        String tld;
        @Column(nullable = false,name="Native")
        String Native;
        @Column(nullable = false)
        String region;

        @Column(nullable = false)
        String subregion;

        @Column(nullable = false)
        String nationality;
        @Column(nullable = false)
        String timezones;
        @Column(nullable = false)
        String translations;
        @Column(nullable = false)
        BigDecimal latitude;
        @Column(nullable = false)
        BigDecimal longitude;
        @Column(nullable = false)
        String emoji;
        @Column(nullable = false,name = "emojiU")
        String emojiU;
        @Column(nullable = false,name="created_at")
                @CreationTimestamp
        Timestamp createdAt;
        @Column(nullable = false,name="updated_at")
        @UpdateTimestamp
        Timestamp updatedAt;
        @Column(nullable = false)
        Integer flag;
        @Column(nullable = false,name = "wikidataid")

        String wikidataid;
        @ManyToOne(fetch = FetchType.LAZY)
                @JoinColumn(name="region_id",referencedColumnName = "id")
        Regions regions;
        @ManyToOne(fetch=FetchType.LAZY)
                @JoinColumn(name="subregion_id",referencedColumnName = "id")
        Subregions subregions;
}
