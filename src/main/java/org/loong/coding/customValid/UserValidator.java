package org.loong.coding.customValid;

import org.springframework.stereotype.Component;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author xiongtaolong
 * @date 2019-06-29 17:42
 */
@Component
public class UserValidator implements ConstraintValidator<MyConstraint, Object> {

    @Override
    public void initialize(MyConstraint constraintAnnotation) {
        System.out.println("my validator init");
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        String name = (String) value;
        if (name.endsWith("xxx")) {
            return true;
        }
        System.out.println(value);
        return false;
    }
}