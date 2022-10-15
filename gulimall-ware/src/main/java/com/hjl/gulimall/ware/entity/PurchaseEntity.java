package com.hjl.gulimall.ware.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * 采购信息
 * 
 * @author hejiale
 * @email 965374246@qq.com
 * @date 2022-10-15 15:47:19
 */
@Data
@TableName("wms_purchase")
public class PurchaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    @TableId
    private Long id;
    /**
     * 
     */
    private Long assigneeId;
    /**
     * 
     */
    private String assigneeName;
    /**
     * 
     */
    private String phone;
    /**
     * 
     */
    private Integer priority;
    /**
     * 
     */
    private Integer status;
    /**
     * 
     */
    private Long wareId;
    /**
     * 
     */
    private BigDecimal amount;
    /**
     * 
     */
    private Date createTime;
    /**
     * 
     */
    private Date updateTime;

}
