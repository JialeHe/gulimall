package com.hjl.gulimall.ware.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * 
 * 
 * @author hejiale
 * @email 965374246@qq.com
 * @date 2022-10-15 15:47:19
 */
@Data
@TableName("wms_purchase_detail")
public class PurchaseDetailEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    @TableId
    private Long id;
    /**
     * 采购单id
     */
    private Long purchaseId;
    /**
     * 采购商品id
     */
    private Long skuId;
    /**
     * 采购数量
     */
    private Integer skuNum;
    /**
     * 采购金额
     */
    private BigDecimal skuPrice;
    /**
     * 仓库id
     */
    private Long wareId;
    /**
     * 状态[0新建，1已分配，2正在采购，3已完成，4采购失败]
     */
    private Integer status;

}
