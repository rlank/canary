package edu.umt.csci427.canary;

import ice.Numeric;

/**
 * Created by RYELAPTOP on 4/6/2015.
 */
public class MultiparameterMonitorFactory extends OpenICEAbstractFactory {
    @Override
    OpenICEDataPackage PackageOpenICESimulatedData(Numeric data) {
        return null;
    }

    @Override
    OpenICEDataPackage PackageOpenICERealTimeData(Numeric data) {
        return null;
    }
}
