package com.investment.indivara.investment.produk.controller;

import com.investment.indivara.investment.produk.entity.Produk;
import com.investment.indivara.investment.produk.services.ProdukService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ProdukController {

    @Autowired
    private final ProdukService produkService;

    @PostMapping("/produk/create")
    Produk createData(@RequestBody Produk produk){
        return produkService.createProduk(produk);
    }

    @GetMapping("/produk/findbyid/{produkId}")
    Produk findProdukById(@PathVariable Long produkId){
        return produkService.findById(produkId);
    }

    @PutMapping("/produk/updateproduk/{produkId}")
    Produk updateData(@PathVariable Long produkId , @RequestBody Produk produk){
        return produkService.updateProduk(produkId,produk);
    }

    @DeleteMapping("/produk/deleteproduk/{produkId}")
    String deleteData(@PathVariable Long produkId){
        return produkService.deleteProduk(produkId);
    }

}
