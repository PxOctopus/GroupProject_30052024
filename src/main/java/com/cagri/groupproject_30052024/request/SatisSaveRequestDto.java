package com.cagri.groupproject_30052024.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SatisSaveRequestDto {
    String ad;
    String adres;
    String tel;
    String urunAdi;
    Double fiyat;
    Integer adet;
    Double toplamFiyat;
    LocalDate tarih;
}
