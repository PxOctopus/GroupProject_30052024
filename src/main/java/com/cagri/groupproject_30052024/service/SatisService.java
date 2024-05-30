package com.cagri.groupproject_30052024.service;

import com.cagri.groupproject_30052024.entity.Satis;
import com.cagri.groupproject_30052024.repository.SatisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SatisService {
    private final SatisRepository satisRepository;

    public void saveSatis(Satis satis) {
        satisRepository.save(satis);
    }

    public List<Satis> getAllSatis() {
        return satisRepository.findAll();
    }

    public List<Satis> getAllByMusteriAd(String musteriAd) {
        return satisRepository.findAllByUrunAdi(musteriAd);
    }

//    public Double getToplamFiyatByUrunAdi(Integer urunAdet, String urunAdi, Double urunFiyat) {
//       return satisRepository.finda
//    }
}
