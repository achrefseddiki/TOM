package com.example.TOM.BasicApp.Repository;

import com.example.TOM.BasicApp.Entity.ProductFamily;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductFamilyRepository extends JpaRepository<ProductFamily,Long> {
}
