package com.example.jsonex.util.impl;

import com.example.jsonex.util.ValidationUtil;
import org.springframework.stereotype.Component;

import javax.validation.Validator;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;

import java.util.Set;
@Component
public class ValidationUtilImpl implements ValidationUtil {

    private final Validator validator;

    public ValidationUtilImpl() {
        this.validator = Validation
                .buildDefaultValidatorFactory()
                .getValidator();

    }
    @Override
    public <E> boolean isValid(E entity) {
        return validator.validate(entity).isEmpty();
    }

    @Override
    public <E> Set<ConstraintViolation<E>> getViolations(E entity) {
        return validator.validate(entity);
    }
}