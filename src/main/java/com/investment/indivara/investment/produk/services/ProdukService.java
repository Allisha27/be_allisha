package com.investment.indivara.investment.produk.services;

import com.investment.indivara.investment.produk.entity.Produk;

import java.util.List;

public interface ProdukService {

    Produk createProduk(Produk produk);

    Produk findById(Long produkId);

    Produk updateProduk(Long ProdukId, Produk produk);

    String deleteProduk(Long produkId);

}
