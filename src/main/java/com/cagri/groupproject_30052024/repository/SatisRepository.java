package com.cagri.groupproject_30052024.repository;

import com.cagri.groupproject_30052024.entity.Satis;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface SatisRepository extends JpaRepository<Satis, Long> {
    List<Satis> findAllByUrunAdi(String urunAdi);
    Optional<Satis> findOptionalByMusteriTel(String musteriTel);
    List<Satis> findAllByTarihBetween(LocalDate min, LocalDate max);
    List<Satis> findAllByAdet(Integer adet);


//   Double findAllByUrunFiyatAndUrunAdi(Double urunFiyat, String urunAdi);
}
