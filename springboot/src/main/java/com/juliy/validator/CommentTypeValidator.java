package com.juliy.validator;

import com.juliy.annotation.CommentType;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.HashSet;
import java.util.Set;

/**
 * 评论类型校验器
 * @author juliy
 * @date 2023/5/16 15:36
 */
public class CommentTypeValidator implements ConstraintValidator<CommentType, Integer> {
    private final Set<Integer> set = new HashSet<>();

    /**
     * 初始化
     * @param constraintAnnotation 评论类型注解
     */
    @Override
    public void initialize(CommentType constraintAnnotation) {
        for (int value : constraintAnnotation.values()) {
            set.add(value);
        }
    }

    /**
     * 校验方法
     * @param value                      校验的值
     * @param constraintValidatorContext 上下文
     * @return 是否校验成功
     */
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        return set.contains(value);
    }
}
