package com.investment.indivara.investment.produk.repository;

import com.investment.indivara.investment.produk.entity.Produk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdukRepository extends JpaRepository <Produk,Long> {
}
