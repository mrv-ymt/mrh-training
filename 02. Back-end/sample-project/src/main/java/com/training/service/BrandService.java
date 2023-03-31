package com.training.service;

import java.util.List;
import java.util.Map;

import com.training.entity.BrandEntity;
import com.training.model.ResponseDataModel;

/**
 * This interface is used to declare functions to handle logic and business for Brand Entities
 * 
 * @author Red Devil
 * @since 2020-10-10
 */
public interface BrandService {

	ResponseDataModel add(BrandEntity brandEntity);

	ResponseDataModel update(BrandEntity brandEntity);

	ResponseDataModel findByBrandIdForApi(Long brandId);

	ResponseDataModel delete(Long brandId);

	List<BrandEntity> getAll();

	BrandEntity findByBrandId(Long brandId);

	BrandEntity findByBrandName(String brandName);

	ResponseDataModel searchWithPager(Map<String, Object> searchDataMap);
}