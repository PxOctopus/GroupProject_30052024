package com.cagri.groupproject_30052024.controller;

import com.cagri.groupproject_30052024.entity.Satis;
import com.cagri.groupproject_30052024.request.SatisSaveRequestDto;
import com.cagri.groupproject_30052024.service.SatisService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/satis")
public class SatisController {
    private final SatisService satisService;

    @PostMapping("/save")
    @CrossOrigin("*")
    public void save(@RequestBody SatisSaveRequestDto dto){
        Satis satis = Satis.builder()
                .musteriAd(dto.getAd())
                .musteriAdres(dto.getAdres())
                .musteriTel(dto.getTel())
                .urunAdi(dto.getUrunAdi())
                .adet(dto.getAdet())
                .fiyat(dto.getFiyat())
                .toplamFiyat(dto.getToplamFiyat())
                .tarih(dto.getTarih())
                .build();
        satisService.saveSatis(satis);
    }
    // GET: http://localhost:9090/musteri/get-all
    @GetMapping("/get-all")
    public ResponseEntity<List<Satis>> getAll(){
        return ResponseEntity.ok(satisService.getAllSatis());
    }

    @GetMapping("/get-all-by-musteri-ad")
    public ResponseEntity<List<Satis>> getAllByMusteriAd(String musteriAd){
        return ResponseEntity.ok(satisService.getAllByMusteriAd(musteriAd));
    }
}
