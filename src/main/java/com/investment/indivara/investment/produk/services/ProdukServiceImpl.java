package com.investment.indivara.investment.produk.services;

import com.investment.indivara.investment.produk.entity.Produk;
import com.investment.indivara.investment.produk.repository.ProdukRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class ProdukServiceImpl implements ProdukService{

    @Autowired
    private final ProdukRepository produkRepository;

    @Override
    public Produk createProduk(Produk produk) {
        return produkRepository.save(produk);
    }

    @Override
    public Produk findById(Long produkId) {
        return produkRepository.findById(produkId).orElseThrow(()
                -> new EntityNotFoundException("Id not found"));
    }

    @Override
    public Produk updateProduk(Long produkId, Produk produk) {
        Produk original = findById(produkId);

        if(produk.getNamaProduk() != null){
            original.setNamaProduk(produk.getNamaProduk());
        }

        if(produk.getKeteranganProdukDetail() != null){
            original.setKeteranganProdukDetail(produk.getKeteranganProdukDetail());
        }

        produkRepository.save(original);
        return original;
    }

    @Override
    public String deleteProduk(Long produkId) {
        produkRepository.deleteById(produkId);
        return "Data deleted...";
    }
}
