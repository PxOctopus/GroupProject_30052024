package com.cagri.groupproject_30052024.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data // get,set toString
@AllArgsConstructor // parametreli constructorlarin tumu
@NoArgsConstructor // default constructor
@Builder
@Entity
@Table(name = "tblsatis")
public class Satis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id icin otomatik artan
    private Long id;
    private String musteriAd;
    private String musteriAdres;
    private String musteriTel;
    private String urunAdi;
    private Double fiyat;
    private Integer adet;
    private Double toplamFiyat;
    private LocalDate tarih;
}
