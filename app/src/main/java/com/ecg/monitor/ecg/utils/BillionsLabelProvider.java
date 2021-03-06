//******************************************************************************
// SCICHART® Copyright SciChart Ltd. 2011-2017. All rights reserved.
//
// Web: http://www.scichart.com
// Support: support@scichart.com
// Sales:   sales@scichart.com
//
// BillionsLabelProvider.java is part of the SCICHART® Examples. Permission is hereby granted
// to modify, create derivative works, distribute and publish any part of this source
// code whether for commercial, private or personal use.
//
// The SCICHART® examples are distributed in the hope that they will be useful, but
// without any warranty. It is provided "AS IS" without warranty of any kind, either
// expressed or implied.
//******************************************************************************

package com.ecg.monitor.ecg.utils;

import com.scichart.charting.numerics.labelProviders.NumericLabelProvider;
import com.scichart.core.utility.ComparableUtil;

public class BillionsLabelProvider extends NumericLabelProvider {
    @Override
    public CharSequence formatLabel(Comparable dataValue) {
        return super.formatLabel(ComparableUtil.toDouble(dataValue) / Math.pow(10, 9)) + "B";
    }
}