package com.baomidou.mybatisplus.test.generator.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * <p>
 * 测试的基础父类
 * </p>
 *
 * @author hubin
 * @since 2019-02-20
 */
@Data
public class SuperEntity implements Serializable {

    private Long id;
    private Boolean deleted;

}
