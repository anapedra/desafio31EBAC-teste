package org.anasantana.services.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Service for common BigDecimal operations like normalization,
 * safe comparison and precision handling.
 *
 * Can be reused across business logic, tests, and response formatting.
 * 
 * @author Ana
 */
public class BigDecimalService {

    /**
     * Normalize a BigDecimal by stripping trailing zeros.
     * Useful for comparisons or formatting.
     */
    public BigDecimal normalize(BigDecimal value) {
        return value == null ? null : value.stripTrailingZeros();
    }

    /**
     * Normalize to a fixed scale with rounding.
     * Default: 10 casas decimais, HALF_UP.
     */
    public BigDecimal normalizeScale(BigDecimal value) {
        return value == null ? null : value.setScale(10, RoundingMode.HALF_UP);
    }

    /**
     * Compare two BigDecimals ignoring scale.
     */
    public boolean equalsIgnoreScale(BigDecimal a, BigDecimal b) {
        if (a == null || b == null) return false;
        return a.stripTrailingZeros().equals(b.stripTrailingZeros());
    }

    /**
     * Compares using compareTo() == 0 (mais leve)
     */
    public boolean isEqual(BigDecimal a, BigDecimal b) {
        if (a == null || b == null) return false;
        return a.compareTo(b) == 0;
    }
}
