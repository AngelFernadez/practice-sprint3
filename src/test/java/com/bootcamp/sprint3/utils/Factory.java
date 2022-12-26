package com.bootcamp.sprint3.utils;

import com.bootcamp.sprint3.dto.all.SectionDto;
import com.bootcamp.sprint3.dto.request.ProductRequestDto;
import com.bootcamp.sprint3.dto.request.PurchaseOrderDto;
import com.bootcamp.sprint3.dto.response.BatchStockExpirationDto;
import com.bootcamp.sprint3.dto.response.BatchStockLocationDto;
import com.bootcamp.sprint3.dto.response.ProductResponseDto;
import com.bootcamp.sprint3.entity.*;
import com.bootcamp.sprint3.enums.RolE;
import com.bootcamp.sprint3.enums.StatusCode;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

public class Factory {
    @Autowired
    private static ModelMapper mapper;


    //--------------Product------------------------------------
    public static Product getProduct(Double unitPrice) {
        Product product = new Product();
        product.setProductId((int) (Math.random() * 10));
        product.setUnitPrice(unitPrice);
        return product;
    }

    public static ProductResponseDto getProductResponseDto(Double unitPrice) {
        return mapper.map(getProduct(unitPrice), ProductResponseDto.class);
    }

    public static ProductRequestDto getProductRequestDto(Integer productId, Integer quality) {
        return new ProductRequestDto(productId, quality);
    }

    //---------Batch--------------------------

    public static Batch getBatch(Product product) {
        return new Batch((int) (Math.random() * 10), product, 10.5, 5., 50,
                45, LocalDate.now().minusWeeks(10), LocalDateTime.now().minusWeeks(10),
                LocalDate.now().plusWeeks(10));
    }
    public static BatchStockLocationDto getBatchStockLocationDto(Product product) {
        return mapper.map(getBatch(product),BatchStockLocationDto.class);
    }
    public static BatchStockExpirationDto getBatchStockExpirationDto(Product product) {
        return mapper.map(getBatch(product),BatchStockExpirationDto.class);
    }

    //------------Section-------------------------------
    public static Section getSection(){
        return new Section((int) (Math.random() * 10));
    }

    public static SectionDto getSectionDto(Integer sectionId,Integer warehouseId){
        return new SectionDto(sectionId,warehouseId);
    }

    //--------Rol-------------------------------

    public static Rol getRoleBuyer(){
        return new Rol(1,RolE.BUYER);
    }
    public static Rol getRoleSeller(){
        return new Rol(1,RolE.SELLER);
    }
    public static Rol getRoleAdmin(){
        return new Rol(1,RolE.ADMIN);
    }

    //-------------User------------------------
    public static User getUserBuyer(String username, String password){
        return new User(1,username,password, Collections.singletonList(getRoleBuyer()));

    }
    public static User getUserSeller(String username, String password){
        return new User(2,username,password, Collections.singletonList(getRoleSeller()));

    }
    public static User getUserAdmin(String username, String password){
        return new User(3,username,password, Collections.singletonList(getRoleAdmin()));

    }

    //----------------PurchaseOrder-------------------

    public static PurchaseOrder getPurchaseOrder(User buyer, List<Product>products){
        return new PurchaseOrder((int) (Math.random() * 10),LocalDate.now(),buyer, StatusCode.CARRITO,products);
    }

    public static PurchaseOrderDto getPurchaseOrderDto(User buyer, List<Product>products){
        return mapper.map(getPurchaseOrder(buyer,products),PurchaseOrderDto.class);
    }

    //---------InboundOrder---------------------------


}
